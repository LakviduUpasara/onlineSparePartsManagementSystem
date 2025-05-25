<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.spareparts.model.DetailsModel" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Full Trade Support Dashboard</title>
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

      <% String userRole = (String) session.getAttribute("userRole"); %>
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
    <!-- User Management Section -->
    <div class="dashboard-content">
      <h2>User Management</h2>
      <p>Manage system users below:</p>

      <!-- Search Bar -->
      <div class="mb-3 w-100">
        <div class="input-group shadow-sm">
          <span class="input-group-text bg-white border-end-0">
            <i class="fas fa-search text-secondary"></i>
          </span>
          <input type="text" id="searchInput" class="form-control border-start-0" placeholder="Search users...">
        </div>
      </div>

      <!-- Export Buttons -->
      <div class="mb-3 d-flex gap-2">
        <button onclick="exportTableToPDF()" class="btn export-btn">
          <i class="fas fa-file-pdf me-1"></i> Export PDF
        </button>
        <button onclick="exportTableToExcel()" class="btn export-btn">
          <i class="fas fa-file-excel me-1"></i> Export Excel
        </button>
      </div>

      <!-- Add Button -->
		 <a href="${pageContext.request.contextPath}/Admin/insert.jsp" class="btn btn-primary mb-3">
		  <i class="fas fa-user-plus me-1"></i> Add New User
		</a>


      <!-- User Table -->
      <div class="table-container mt-4">
        <table class="table table-bordered table-striped" id="user-table">
          <thead class="custom-header">
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Address</th>
              <th>Contact Number</th>
              <th>User Role</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="details" items="${alldetails}">
              <tr>
                <td>${details.id}</td>
                <td>${details.name}</td>
                <td>${details.address}</td>
                <td>${details.contactnumber}</td>
                <td>${details.userRole}</td>
                <td>
                  <div class="d-flex gap-2">
                    <a href="Admin/update.jsp?id=${details.id}&name=${details.name}&address=${details.address}&contactnumber=${details.contactnumber}&email=${details.email}&password=${details.password}&userRole=${details.userRole}" class="btn btn-primary btn-sm">
                      <i class="fas fa-edit"></i>
                    </a>
                    <a href="DeleteServlet?id=${details.id}" class="btn btn-outline-danger btn-sm" onclick="return confirm('Are you sure?')">
                      <i class="fas fa-trash-alt"></i>
                    </a>
                  </div>
                </td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>

    <!-- JS Scripts -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script>
      function filterTable() {
        const input = document.getElementById("searchInput");
        const filter = input.value.toUpperCase();
        const table = document.querySelector("#user-table");
        const rows = table.getElementsByTagName("tr");

        for (let i = 1; i < rows.length; i++) {
          let rowVisible = false;
          const cells = rows[i].getElementsByTagName("td");

          for (let j = 0; j < cells.length - 1; j++) {
            if (cells[j]) {
              const text = cells[j].textContent || cells[j].innerText;
              if (text.toUpperCase().indexOf(filter) > -1) {
                rowVisible = true;
                break;
              }
            }
          }
          rows[i].style.display = rowVisible ? "" : "none";
        }
      }

      document.getElementById("searchInput").addEventListener("input", filterTable);

      async function exportTableToPDF() {
        const { jsPDF } = window.jspdf;
        const doc = new jsPDF();

        const table = document.getElementById('user-table');
        const headers = [];
        const data = [];

        const headerCells = table.querySelectorAll('thead tr th');
        headerCells.forEach((th, index) => {
          if (index < headerCells.length - 1) {
            headers.push(th.innerText.trim());
          }
        });

        const rows = table.querySelectorAll('tbody tr');
        rows.forEach(row => {
          const rowData = [];
          const cells = row.querySelectorAll('td');
          cells.forEach((td, index) => {
            if (index < cells.length - 1) {
              rowData.push(td.innerText.trim());
            }
          });
          if (rowData.length > 0) {
            data.push(rowData);
          }
        });

        doc.autoTable({
          head: [headers],
          body: data,
          theme: 'grid',
          headStyles: { fillColor: [13, 11, 86] },
          styles: { fontSize: 9 }
        });

        doc.save('user_details.pdf');
      }

      function exportTableToExcel() {
        var table = document.getElementById('user-table');
        var wb = XLSX.utils.table_to_book(table, { sheet: "Suppliers" });
        XLSX.writeFile(wb, 'supplier_data.xlsx');
      }
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.18.5/xlsx.full.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.5.1/jspdf.umd.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/3.5.23/jspdf.plugin.autotable.min.js"></script>
</body>
</html>
