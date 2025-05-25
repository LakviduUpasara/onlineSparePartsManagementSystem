<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>User Registration - Full Trade Support</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" rel="stylesheet">
  <style>
    body { display: flex; min-height: 100vh; overflow-x: hidden; }
        .sidebar { width: 250px; background-color: #001f3f; color: #fff; flex-shrink: 0; padding-top: 1rem; }
        .sidebar a { display: block; padding: 12px 20px; color: #fff; text-decoration: none; transition: background 0.3s; }
        .sidebar a:hover { background-color: #003366; }
        .sidebar h5 { text-align: center; margin-bottom: 1rem; font-weight: bold; }
        .main-content { flex-grow: 1; background: #f8f9fa; }
        .navbar { background-color: #ffffff; box-shadow: 0 2px 4px rgba(0,0,0,0.1); }
        .dashboard-content { padding: 2rem; }
        .custom-header { background-color: #0d0b56; color: white; }
        .btn-primary { background-color: #0d0b56; border-color: #0d0b56; }
        .btn-primary:hover { background-color: #003366; border-color: #003366; }
        .card { border-radius: 8px; box-shadow: 0 2px 8px rgba(0,0,0,0.1); }
        .chart-container { max-width: 600px; margin: auto; }
  </style>
</head>
<body>

    <% String  userRole = (String) session.getAttribute("userRole"); %>
    <div class="sidebar" id="sidebar">
        <h5 class="text-center fw-bold">
            <%= userRole != null ? userRole + " Panel" : "Panel" %>
        </h5>
        <% if ("Manager".equals(userRole) || "Admin".equals(userRole)) { %>
            <a href="${pageContext.request.contextPath}/dashboard">
                <i class="fas fa-chart-line me-2"></i> Dashboard
            </a>
        <% } %>
        <a href="${pageContext.request.contextPath}/cashier">
            <i class="fas fa-cash-register me-2"></i> Cashier
        </a>
        <% if ("Admin".equals(userRole) || "Manager".equals(userRole)) { %>
            <a href="${pageContext.request.contextPath}/GetAllServlet">
                <i class="fas fa-users me-2"></i> User Management
            </a>
        <% } %>
        <% if (!"Cashier".equals(userRole)) { %>
            <a href="${pageContext.request.contextPath}/item-list">
                <i class="fas fa-boxes me-2"></i> Stock Management
            </a>
        <% } %>
        <% if ("Stock Manager".equals(userRole)) { %>
            <a href="${pageContext.request.contextPath}/order-management">
                <i class="fas fa-shopping-cart me-2"></i> Order Management
            </a>
            <a href="${pageContext.request.contextPath}/item-list">
                <i class="fas fa-box me-2"></i> Item Management
            </a>
        <% } %>
        <% if ("Admin".equals(userRole) || "Manager".equals(userRole)) { %>
            <a href="${pageContext.request.contextPath}/supplier-list">
                <i class="fas fa-truck me-2"></i> Supplier Management
            </a>
        <% } %>
        <a href="#" data-bs-toggle="collapse" data-bs-target="#settingsMenu">
            <i class="fas fa-gear me-2"></i> Settings
        </a>
        <div class="collapse ms-3" id="settingsMenu">
            <a href="${pageContext.request.contextPath}/profile.jsp" class="d-block mt-1">
                <i class="fas fa-sliders-h me-2"></i> Profile
            </a>
        </div>
    </div>

    <div class="main-content w-100">
        <nav class="navbar navbar-expand-lg navbar-light bg-white px-4 shadow-sm">
            <a class="navbar-brand fw-bold" href="#">Autoparts Pvt Ltd</a>
            <div class="ms-auto d-flex align-items-center">
                <%= session.getAttribute("Name") != null ? session.getAttribute("Name") : "Guest" %>
                <div class="dropdown ms-3">
                    <a class="btn btn-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">
                        <i class="fas fa-user-circle fa-lg"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end">
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/profile.jsp"><i class="fas fa-id-badge me-2"></i> Profile</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item text-danger" href="${pageContext.request.contextPath}/LogoutServlet"><i class="fas fa-sign-out-alt me-2"></i> Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>

  <div class="dashboard-content">
    <div class="container">
      <h2 class="mb-4">User Registration</h2>
      <form action="${pageContext.request.contextPath}/InsetServlet" method="post" class="bg-white p-4 rounded shadow-sm">
        <div class="mb-3">
          <label for="name" class="form-label">Name:</label>
          <input type="text" name="name" id="name" class="form-control" required>
        </div>

        <div class="mb-3">
          <label for="address" class="form-label">Address:</label>
          <input type="text" name="address" id="address" class="form-control" required>
        </div>

        <div class="mb-3">
          <label for="contactnumber" class="form-label">Contact Number:</label>
          <input type="text" name="contactnumber" id="contactnumber" class="form-control" required>
        </div>

        <div class="mb-3">
          <label for="email" class="form-label">Email:</label>
          <input type="email" name="email" id="email" class="form-control" required>
        </div>

        <div class="mb-3">
          <label for="password" class="form-label">Password:</label>
          <input type="password" name="password" id="password" class="form-control" required>
        </div>

        <div class="mb-4">
          <label for="userRole" class="form-label">User Role:</label>
          <select name="userRole" id="userRole" class="form-select" required>
            <option value="Cashier">Cashier</option>
            <option value="Stock Manager">Stock Manager</option>
            <option value="Admin">Admin</option>
            <option value="Manager">Manager</option>
          </select>
        </div>

        <button type="submit" class="btn w-100">Submit</button>
      </form>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
