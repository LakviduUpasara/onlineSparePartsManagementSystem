/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.104
 * Generated at: 2025-05-15 14:54:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Stock_005fmanager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.spareparts.model.Item;

public final class itemDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("com.spareparts.model.Item");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Full Trade Support - Item Dashboard</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\" rel=\"stylesheet\" integrity=\"sha512-A8kq5D4Y6Q3u5nF4Osk6M4s3hZcIdvKS0EXVaM3vKL+xnF3l5g2Z+BlI9yGddALf6nWrXg1WXDxK38g/Mq2bCQA==\" crossorigin=\"anonymous\">\r\n");
      out.write("  <!-- Fallback for Bootstrap CSS -->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"print\" onload=\"this.media='all'\">\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      min-height: 100vh;\r\n");
      out.write("      overflow-x: hidden;\r\n");
      out.write("    }\r\n");
      out.write("    .sidebar {\r\n");
      out.write("      width: 250px;\r\n");
      out.write("      background-color: #001f3f;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      flex-shrink: 0;\r\n");
      out.write("      padding-top: 1rem;\r\n");
      out.write("    }\r\n");
      out.write("    .sidebar a {\r\n");
      out.write("      display: block;\r\n");
      out.write("      padding: 12px 20px;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      transition: background 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("    .sidebar a:hover {\r\n");
      out.write("      background-color: #003366;\r\n");
      out.write("    }\r\n");
      out.write("    .sidebar h5 {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      margin-bottom: 1rem;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("    .main-content {\r\n");
      out.write("      flex-grow: 1;\r\n");
      out.write("      background: #f8f9fa;\r\n");
      out.write("    }\r\n");
      out.write("    .navbar {\r\n");
      out.write("      background-color: #ffffff;\r\n");
      out.write("      box-shadow: 0 2px 4px rgba(0,0,0,0.1);\r\n");
      out.write("    }\r\n");
      out.write("    .dashboard-content {\r\n");
      out.write("      padding: 2rem;\r\n");
      out.write("    }\r\n");
      out.write("    .custom-header {\r\n");
      out.write("      background-color: #0d0b56;\r\n");
      out.write("      color: white;\r\n");
      out.write("    }\r\n");
      out.write("    .btn-primary {\r\n");
      out.write("      background-color: #0d0b56;\r\n");
      out.write("      border-color: #0d0b56;\r\n");
      out.write("    }\r\n");
      out.write("    .btn-primary:hover {\r\n");
      out.write("      background-color: #003366;\r\n");
      out.write("      border-color: #003366;\r\n");
      out.write("    }\r\n");
      out.write("    .export-btn {\r\n");
      out.write("      background-color: #ffffff;\r\n");
      out.write("      color: #0d0b56;\r\n");
      out.write("      border: 1px solid #0d0b56;\r\n");
      out.write("    }\r\n");
      out.write("    .export-btn:hover {\r\n");
      out.write("      background-color: #0d0b56;\r\n");
      out.write("      color: #ffffff;\r\n");
      out.write("    }\r\n");
      out.write("    .item-image {\r\n");
      out.write("      width: 50px;\r\n");
      out.write("      height: 50px;\r\n");
      out.write("      object-fit: cover;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("    }\r\n");
      out.write("    /* Style for action buttons */\r\n");
      out.write("    .action-btn {\r\n");
      out.write("      padding: 6px 12px;\r\n");
      out.write("      font-size: 0.9rem;\r\n");
      out.write("      min-width: 80px; /* Ensure buttons are wide enough */\r\n");
      out.write("    }\r\n");
      out.write("    .action-btn i {\r\n");
      out.write("      margin-right: 4px;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    ");
 String userRole = (String) session.getAttribute("userRole"); 
      out.write("\r\n");
      out.write("    <div class=\"sidebar\" id=\"sidebar\">\r\n");
      out.write("        <h5 class=\"text-center fw-bold\">\r\n");
      out.write("            ");
      out.print( userRole != null ? userRole + " Panel" : "Panel" );
      out.write("\r\n");
      out.write("        </h5>\r\n");
      out.write("        ");
 if ("Manager".equals(userRole) || "Admin".equals(userRole)) { 
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dashboard\">\r\n");
      out.write("                <i class=\"fas fa-chart-line me-2\"></i> Dashboard\r\n");
      out.write("            </a>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cashier\">\r\n");
      out.write("            <i class=\"fas fa-cash-register me-2\"></i> Cashier\r\n");
      out.write("        </a>\r\n");
      out.write("        \r\n");
      out.write("        ");
 if ("Admin".equals(userRole) || "Manager".equals(userRole)) { 
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/GetAllServlet\">\r\n");
      out.write("                <i class=\"fas fa-users me-2\"></i> User Management\r\n");
      out.write("            </a>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        ");
 if (!"Cashier".equals(userRole)) { 
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item-list\">\r\n");
      out.write("                <i class=\"fas fa-boxes me-2\"></i> Stock Management\r\n");
      out.write("            </a>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        ");
 if ("Stock Manager".equals(userRole)) { 
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/order-management\">\r\n");
      out.write("                <i class=\"fas fa-shopping-cart me-2\"></i> Order Management\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item-list\">\r\n");
      out.write("                <i class=\"fas fa-box me-2\"></i> Item Management\r\n");
      out.write("            </a>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        ");
 if ("Admin".equals(userRole) || "Manager".equals(userRole)) { 
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/supplier-list\">\r\n");
      out.write("                <i class=\"fas fa-truck me-2\"></i> Supplier Management\r\n");
      out.write("            </a>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        <a href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#settingsMenu\">\r\n");
      out.write("            <i class=\"fas fa-gear me-2\"></i> Settings\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"collapse ms-3\" id=\"settingsMenu\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/profile.jsp\" class=\"d-block mt-1\">\r\n");
      out.write("                <i class=\"fas fa-sliders-h me-2\"></i> Profile\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main-content w-100\">\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-white px-4 shadow-sm\">\r\n");
      out.write("            <a class=\"navbar-brand fw-bold\" href=\"#\">Autoparts Pvt Ltd</a>\r\n");
      out.write("            <div class=\"ms-auto d-flex align-items-center\">\r\n");
      out.write("                ");
      out.print( session.getAttribute("Name") != null ? session.getAttribute("Name") : "Guest" );
      out.write("\r\n");
      out.write("                <div class=\"dropdown ms-3\">\r\n");
      out.write("                    <a class=\"btn btn-light dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fas fa-user-circle fa-lg\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-end\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/profile.jsp\"><i class=\"fas fa-id-badge me-2\"></i> Profile</a></li>\r\n");
      out.write("                        <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item text-danger\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/LogoutServlet\"><i class=\"fas fa-sign-out-alt me-2\"></i> Logout</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Item Management Section -->\r\n");
      out.write("    <div class=\"dashboard-content\">\r\n");
      out.write("      <h2>Item Management</h2>\r\n");
      out.write("      <p>Manage your items below:</p>\r\n");
      out.write("      ");
 String error = (String) request.getAttribute("error"); 
      out.write("\r\n");
      out.write("      ");
 if (error != null) { 
      out.write("\r\n");
      out.write("          <div class=\"alert alert-danger\">");
      out.print( error );
      out.write("</div>\r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- Search Bar -->\r\n");
      out.write("      <div class=\"mb-3 w-100\">\r\n");
      out.write("        <div class=\"input-group shadow-sm\">\r\n");
      out.write("          <span class=\"input-group-text bg-white border-end-0\">\r\n");
      out.write("            <i class=\"fas fa-search text-secondary\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("          <input type=\"text\" id=\"searchInput\" class=\"form-control border-start-0\" placeholder=\"Search items...\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Add Button -->\r\n");
      out.write("      <button class=\"btn btn-primary mb-4\" data-bs-toggle=\"modal\" data-bs-target=\"#addItemModal\">\r\n");
      out.write("        Add New Item\r\n");
      out.write("      </button>\r\n");
      out.write("\r\n");
      out.write("      <!-- Item Table -->\r\n");
      out.write("      <div class=\"table-container mt-4\">\r\n");
      out.write("        <table class=\"table table-bordered table-striped\" id=\"item-table\">\r\n");
      out.write("          <thead class=\"custom-header\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>ID</th>\r\n");
      out.write("              <th>Name</th>\r\n");
      out.write("              <th>Brand</th>\r\n");
      out.write("              <th>Quantity</th>\r\n");
      out.write("              <th>Buy Price</th>\r\n");
      out.write("              <th>Sell Price</th>\r\n");
      out.write("              <th>Image</th>\r\n");
      out.write("              <th>Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            ");

              List<Item> itemList = (List<Item>) request.getAttribute("itemList");
              if (itemList != null && !itemList.isEmpty()) {
                for (Item item : itemList) {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>");
      out.print( item.getItemID() );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( item.getItemName() );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( item.getItemBrand() != null ? item.getItemBrand() : "N/A" );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( item.getQty() );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( String.format("%.2f", item.getBuyPrice()) );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( String.format("%.2f", item.getSellPrice()) );
      out.write("</td>\r\n");
      out.write("              <td>\r\n");
      out.write("                ");
 if (item.getImagePath() != null && !item.getImagePath().isEmpty()) { 
      out.write("\r\n");
      out.write("                  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('/');
      out.print( item.getImagePath() );
      out.write("\" class=\"item-image\" alt=\"Item Image\">\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                  No Image\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("              <td>\r\n");
      out.write("                <div class=\"d-flex gap-2\">\r\n");
      out.write("                  <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item-update?id=");
      out.print( item.getItemID() );
      out.write("\" class=\"btn btn-outline-primary action-btn\">\r\n");
      out.write("                    <i class=\"fas fa-edit\"></i> Edit\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item-delete?id=");
      out.print( item.getItemID() );
      out.write("\" class=\"btn btn-outline-danger action-btn\" onclick=\"return confirm('Are you sure you want to delete this item?')\">\r\n");
      out.write("                    <i class=\"fas fa-trash-alt\"></i> Delete\r\n");
      out.write("                  </a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 } } else { 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td colspan=\"8\" class=\"text-center\">No items found.</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Add Item Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"addItemModal\" tabindex=\"-1\" aria-labelledby=\"addItemModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item-add\" method=\"post\" enctype=\"multipart/form-data\" class=\"modal-content\" id=\"addItemForm\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <h5 class=\"modal-title\" id=\"addItemModalLabel\">Add New Item</h5>\r\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("              <label for=\"itemName\" class=\"form-label\">Item Name</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"itemName\" name=\"itemName\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("              <label for=\"itemBrand\" class=\"form-label\">Item Brand</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"itemBrand\" name=\"itemBrand\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("              <label for=\"qty\" class=\"form-label\">Quantity</label>\r\n");
      out.write("              <input type=\"number\" class=\"form-control\" id=\"qty\" name=\"qty\" required min=\"0\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("              <label for=\"buyPrice\" class=\"form-label\">Buy Price</label>\r\n");
      out.write("              <input type=\"number\" step=\"0.01\" class=\"form-control\" id=\"buyPrice\" name=\"buyPrice\" required min=\"0\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("              <label for=\"sellPrice\" class=\"form-label\">Sell Price</label>\r\n");
      out.write("              <input type=\"number\" step=\"0.01\" class=\"form-control\" id=\"sellPrice\" name=\"sellPrice\" required min=\"0\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("              <label for=\"image\" class=\"form-label\">Item Image</label>\r\n");
      out.write("              <input type=\"file\" class=\"form-control\" id=\"image\" name=\"image\" accept=\"image/*\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"formError\" class=\"text-danger\" style=\"display: none;\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Add Item</button>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- JS Scripts -->\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <!-- Fallback for Bootstrap JS -->\r\n");
      out.write("  <script>\r\n");
      out.write("    if (typeof bootstrap === 'undefined') {\r\n");
      out.write("      document.write('<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.bundle.min.js\"><\\/script>');\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.18.5/xlsx.full.min.js\" integrity=\"sha512-r22gChDnGvBylk90+2e/ycr3RVrDi8DIOkIGNwZ7eFqnh1mJ8f/1lS0OCcBS5ZPlgqNx0H4hoT9h7A8DosPK32Q==\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.5.1/jspdf.umd.min.js\" integrity=\"sha512-qZvrmS2ekKPF2mSznTQsxqPgnpkI4DNTlrdUmTzrDgektczlKNRRhy5X5AAahnI7EbgL51cBFSrGNuqsg1qBWLg==\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/3.5.23/jspdf.plugin.autotable.min.js\" integrity=\"sha512-P3z5YHtqjIxRAu1cT3pLuN+0dBfk1pSIuh91AHp9N2exbk0j2kE/intK3uoptBsX7t7bB11lGUcKxSAo2/f7kkg==\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("    // Search functionality\r\n");
      out.write("    function filterTable() {\r\n");
      out.write("      const input = document.getElementById(\"searchInput\");\r\n");
      out.write("      const filter = input.value.toUpperCase();\r\n");
      out.write("      const table = document.getElementById(\"item-table\");\r\n");
      out.write("      const rows = table.getElementsByTagName(\"tr\");\r\n");
      out.write("\r\n");
      out.write("      for (let i = 1; i < rows.length; i++) {\r\n");
      out.write("        let rowVisible = false;\r\n");
      out.write("        const cells = rows[i].getElementsByTagName(\"td\");\r\n");
      out.write("\r\n");
      out.write("        for (let j = 0; j < cells.length - 2; j++) {\r\n");
      out.write("          if (cells[j]) {\r\n");
      out.write("            const text = cells[j].textContent || cells[j].innerText;\r\n");
      out.write("            if (text.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("              rowVisible = true;\r\n");
      out.write("              break;\r\n");
      out.write("            }\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        rows[i].style.display = rowVisible ? \"\" : \"none\";\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"searchInput\").addEventListener(\"input\", filterTable);\r\n");
      out.write("\r\n");
      out.write("    // PDF export\r\n");
      out.write("    async function exportTableToPDF() {\r\n");
      out.write("      try {\r\n");
      out.write("        const { jsPDF } = window.jspdf;\r\n");
      out.write("        const doc = new jsPDF();\r\n");
      out.write("        const table = document.getElementById('item-table');\r\n");
      out.write("        const headers = [];\r\n");
      out.write("        const data = [];\r\n");
      out.write("\r\n");
      out.write("        const headerCells = table.querySelectorAll('thead tr th');\r\n");
      out.write("        headerCells.forEach((th, index) => {\r\n");
      out.write("          if (index < headerCells.length - 2) {\r\n");
      out.write("            headers.push(th.innerText.trim());\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        const rows = table.querySelectorAll('tbody tr');\r\n");
      out.write("        rows.forEach(row => {\r\n");
      out.write("          const rowData = [];\r\n");
      out.write("          const cells = row.querySelectorAll('td');\r\n");
      out.write("          cells.forEach((td, index) => {\r\n");
      out.write("            if (index < cells.length - 2) {\r\n");
      out.write("              rowData.push(td.innerText.trim());\r\n");
      out.write("            }\r\n");
      out.write("          });\r\n");
      out.write("          if (rowData.length > 0) {\r\n");
      out.write("            data.push(rowData);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        doc.autoTable({\r\n");
      out.write("          head: [headers],\r\n");
      out.write("          body: data,\r\n");
      out.write("          theme: 'grid',\r\n");
      out.write("          headStyles: { fillColor: [13, 11, 86] },\r\n");
      out.write("          styles: { fontSize: 9 }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        doc.save('item_data.pdf');\r\n");
      out.write("      } catch (e) {\r\n");
      out.write("        console.error('PDF export failed:', e);\r\n");
      out.write("        alert('Failed to export PDF. Please try again.');\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Excel export\r\n");
      out.write("    function exportTableToExcel() {\r\n");
      out.write("      try {\r\n");
      out.write("        const table = document.getElementById('item-table');\r\n");
      out.write("        const wb = XLSX.utils.table_to_book(table, { sheet: \"Items\" });\r\n");
      out.write("        XLSX.writeFile(wb, 'item_data.xlsx');\r\n");
      out.write("      } catch (e) {\r\n");
      out.write("        console.error('Excel export failed:', e);\r\n");
      out.write("        alert('Failed to export Excel. Please try again.');\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Form validation\r\n");
      out.write("    document.getElementById(\"addItemForm\").addEventListener(\"submit\", function(event) {\r\n");
      out.write("      const itemName = document.getElementById(\"itemName\").value;\r\n");
      out.write("      const qty = document.getElementById(\"qty\").value;\r\n");
      out.write("      const buyPrice = document.getElementById(\"buyPrice\").value;\r\n");
      out.write("      const sellPrice = document.getElementById(\"sellPrice\").value;\r\n");
      out.write("      const errorDiv = document.getElementById(\"formError\");\r\n");
      out.write("      let error = \"\";\r\n");
      out.write("\r\n");
      out.write("      if (!itemName.trim()) {\r\n");
      out.write("        error = \"Item name is required\";\r\n");
      out.write("      } else if (qty < 0) {\r\n");
      out.write("        error = \"Quantity cannot be negative\";\r\n");
      out.write("      } else if (buyPrice < 0) {\r\n");
      out.write("        error = \"Buy price cannot be negative\";\r\n");
      out.write("      } else if (sellPrice < 0) {\r\n");
      out.write("        error = \"Sell price cannot be negative\";\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      if (error) {\r\n");
      out.write("        event.preventDefault();\r\n");
      out.write("        errorDiv.textContent = error;\r\n");
      out.write("        errorDiv.style.display = \"block\";\r\n");
      out.write("      } else {\r\n");
      out.write("        errorDiv.style.display = \"none\";\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // Test modal initialization\r\n");
      out.write("    document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("      const modalElement = document.getElementById('addItemModal');\r\n");
      out.write("      if (modalElement) {\r\n");
      out.write("        const modal = new bootstrap.Modal(modalElement);\r\n");
      out.write("        console.log('Modal initialized:', modal);\r\n");
      out.write("      } else {\r\n");
      out.write("        console.error('Modal element not found');\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
