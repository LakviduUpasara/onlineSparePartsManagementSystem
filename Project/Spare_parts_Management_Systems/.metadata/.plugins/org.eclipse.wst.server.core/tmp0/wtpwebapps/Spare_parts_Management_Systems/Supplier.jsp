<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Dashboard - Supplier Management</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
  <style>
    body {
      margin: 0;
      font-family: Arial, sans-serif;
      background-color: #f8f9fa;
    }
    .sidebar {
      height: 100vh;
      background-color: #0d6efd;
      color: white;
      position: fixed;
      width: 240px;
      padding-top: 20px;
    }
    .sidebar a {
      color: white;
      text-decoration: none;
      display: block;
      padding: 12px 20px;
      font-size: 16px;
    }
    .sidebar a:hover {
      background-color: #0b5ed7;
    }
    .main-content {
      margin-left: 240px;
    }
    .navbar {
      background-color: #ffffff;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }
    .navbar .nav-link, .navbar .navbar-brand {
      color: #333;
    }
    .navbar .dropdown-menu {
      right: 0;
      left: auto;
    }
    .dashboard-content {
      padding: 40px;
      min-height: calc(100vh - 56px);
    }
    .dashboard-content h2 {
      margin-bottom: 20px;
    }
    .table-container {
      margin-top: 40px;
    }
  </style>
</head>
<body>
  <!-- Sidebar -->
  <div class="sidebar">
    <h4 class="text-center mb-4">Admin Panel</h4>
    <a href="#"><i class="fas fa-users"></i> User Management</a>
    <a href="#"><i class="fas fa-boxes"></i> Stock Management</a>
    <a href="#"><i class="fas fa-shopping-cart"></i> Order Management</a>
    <a href="#"><i class="fas fa-cash-register"></i> Cashier</a>
    <a href="#"><i class="fas fa-box"></i> Item Management</a>
    <a href="#"><i class="fas fa-user-friends"></i> Customer Management</a>
    <a href="#"><i class="fas fa-truck"></i> Supplier Management</a>
  </div>

  <!-- Top Navbar -->
  <div class="main-content">
    <nav class="navbar navbar-expand-lg navbar-light px-4">
      <a class="navbar-brand" href="#">Full Trade Support</a>
      <div class="ms-auto d-flex align-items-center">
        <span class="me-3">Welcome, <strong>Admin</strong> (Role: <em>Manager</em>)</span>
        <div class="dropdown">
          <a class="btn btn-light dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
            <i class="fas fa-user-circle"></i>
          </a>
          <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
            <li><a class="dropdown-item" href="#">Profile</a></li>
            <li><a class="dropdown-item" href="#">Settings</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item text-danger" href="#">Logout</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Dashboard Content -->
    <div class="dashboard-content">
      <h2>Supplier Management</h2>
      <p>Manage your suppliers below:</p>

      <div class="table-container">
        <table class="table table-striped table-bordered">
          <thead class="table-primary">
            <tr>
              <th scope="col">ID</th>
              <th scope="col">Name</th>
              <th scope="col">Contact</th>
              <th scope="col">Address</th>
              <th scope="col">Actions</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="supplier" items="${suppliers}">
              <tr>
                <td>${supplier.supplierID}</td>
                <td>${supplier.supplierName}</td>
                <td>${supplier.contactNumber}</td>
                <td>${supplier.address}</td>
                <td>
                  <a href="SupplierServlet?action=edit&id=${supplier.supplierID}" class="btn btn-sm btn-primary">Update</a>
                  <a href="SupplierServlet?action=delete&id=${supplier.supplierID}" class="btn btn-sm btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
                </td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
        <button class="btn btn-success mt-3" data-bs-toggle="modal" data-bs-target="#addSupplierModal">Add New Supplier</button>
      </div>
    </div>
  </div>

  <!-- Add/Edit Supplier Modal -->
  <div class="modal fade" id="addSupplierModal" tabindex="-1" aria-labelledby="addSupplierModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="addSupplierModalLabel">${supplier != null ? 'Edit Supplier' : 'Add New Supplier'}</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <form id="supplierForm" action="SupplierServlet" method="post">
            <input type="hidden" name="action" value="${supplier != null ? 'update' : 'insert'}">
            <input type="hidden" name="supplierID" value="${supplier != null ? supplier.supplierID : ''}">
            <div class="mb-3">
              <label for="supplierName" class="form-label">Supplier Name</label>
              <input type="text" class="form-control" id="supplierName" name="supplierName" value="${supplier != null ? supplier.supplierName : ''}" required>
            </div>
            <div class="mb-3">
              <label for="contactNumber" class="form-label">Contact Number</label>
              <input type="text" class="form-control" id="contactNumber" name="contactNumber" value="${supplier != null ? supplier.contactNumber : ''}" required>
            </div>
            <div class="mb-3">
              <label for="address" class="form-label">Address</label>
              <textarea class="form-control" id="address" name="address" rows="3" required>${supplier != null ? supplier.address : ''}</textarea>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
              <button type="submit" class="btn btn-primary">${supplier != null ? 'Update Supplier' : 'Add Supplier'}</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>