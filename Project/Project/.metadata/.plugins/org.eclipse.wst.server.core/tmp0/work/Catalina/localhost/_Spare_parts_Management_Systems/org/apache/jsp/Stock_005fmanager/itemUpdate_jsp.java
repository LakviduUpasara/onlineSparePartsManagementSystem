/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.104
 * Generated at: 2025-05-15 11:12:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Stock_005fmanager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.spareparts.model.Item;

public final class itemUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
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
      out.write("  <title>Full Trade Support - Update Item</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <style>\r\n");
      out.write("        body { display: flex; min-height: 100vh; overflow-x: hidden; }\r\n");
      out.write("        .sidebar { width: 250px; background-color: #001f3f; color: #fff; flex-shrink: 0; padding-top: 1rem; }\r\n");
      out.write("        .sidebar a { display: block; padding: 12px 20px; color: #fff; text-decoration: none; transition: background 0.3s; }\r\n");
      out.write("        .sidebar a:hover { background-color: #003366; }\r\n");
      out.write("        .sidebar h5 { text-align: center; margin-bottom: 1rem; font-weight: bold; }\r\n");
      out.write("        .main-content { flex-grow: 1; background: #f8f9fa; }\r\n");
      out.write("        .navbar { background-color: #ffffff; box-shadow: 0 2px 4px rgba(0,0,0,0.1); }\r\n");
      out.write("        .dashboard-content { padding: 2rem; }\r\n");
      out.write("        .custom-header { background-color: #0d0b56; color: white; }\r\n");
      out.write("        .btn-primary { background-color: #0d0b56; border-color: #0d0b56; }\r\n");
      out.write("        .btn-primary:hover { background-color: #003366; border-color: #003366; }\r\n");
      out.write("        .card { border-radius: 8px; box-shadow: 0 2px 8px rgba(0,0,0,0.1); }\r\n");
      out.write("        .chart-container { max-width: 600px; margin: auto; }\r\n");
      out.write("\r\n");
      out.write("        /* ✅ Fix image size */\r\n");
      out.write("        .item-image {\r\n");
      out.write("            max-width: 200px;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 2px 6px rgba(0,0,0,0.2);\r\n");
      out.write("        }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
 String userRole = (String) session.getAttribute("userRole"); 
      out.write("\r\n");
      out.write("<div class=\"sidebar\" id=\"sidebar\">\r\n");
      out.write("    <h5 class=\"text-center fw-bold\">\r\n");
      out.write("        ");
      out.print( userRole != null ? userRole + " Panel" : "Panel" );
      out.write("\r\n");
      out.write("    </h5>\r\n");
      out.write("    ");
 if ("Manager".equals(userRole) || "Admin".equals(userRole)) { 
      out.write("\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dashboard\">\r\n");
      out.write("            <i class=\"fas fa-chart-line me-2\"></i> Dashboard\r\n");
      out.write("        </a>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cashier\">\r\n");
      out.write("        <i class=\"fas fa-cash-register me-2\"></i> Cashier\r\n");
      out.write("    </a>\r\n");
      out.write("    ");
 if ("Admin".equals(userRole) || "Manager".equals(userRole)) { 
      out.write("\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/GetAllServlet\">\r\n");
      out.write("            <i class=\"fas fa-users me-2\"></i> User Management\r\n");
      out.write("        </a>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    ");
 if (!"Cashier".equals(userRole)) { 
      out.write("\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item-list\">\r\n");
      out.write("            <i class=\"fas fa-boxes me-2\"></i> Stock Management\r\n");
      out.write("        </a>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    ");
 if ("Stock Manager".equals(userRole)) { 
      out.write("\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/order-management\">\r\n");
      out.write("            <i class=\"fas fa-shopping-cart me-2\"></i> Order Management\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item-list\">\r\n");
      out.write("            <i class=\"fas fa-box me-2\"></i> Item Management\r\n");
      out.write("        </a>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    ");
 if ("Admin".equals(userRole) || "Manager".equals(userRole)) { 
      out.write("\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/supplier-list\">\r\n");
      out.write("            <i class=\"fas fa-truck me-2\"></i> Supplier Management\r\n");
      out.write("        </a>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    <a href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#settingsMenu\">\r\n");
      out.write("        <i class=\"fas fa-gear me-2\"></i> Settings\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"collapse ms-3\" id=\"settingsMenu\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/profile.jsp\" class=\"d-block mt-1\">\r\n");
      out.write("            <i class=\"fas fa-sliders-h me-2\"></i> Profile\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"main-content w-100\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-white px-4 shadow-sm\">\r\n");
      out.write("        <a class=\"navbar-brand fw-bold\" href=\"#\">Autoparts Pvt Ltd</a>\r\n");
      out.write("        <div class=\"ms-auto d-flex align-items-center\">\r\n");
      out.write("            ");
      out.print( session.getAttribute("Name") != null ? session.getAttribute("Name") : "Guest" );
      out.write("\r\n");
      out.write("            <div class=\"dropdown ms-3\">\r\n");
      out.write("                <a class=\"btn btn-light dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("                    <i class=\"fas fa-user-circle fa-lg\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end\">\r\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/profile.jsp\"><i class=\"fas fa-id-badge me-2\"></i> Profile</a></li>\r\n");
      out.write("                    <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                    <li><a class=\"dropdown-item text-danger\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/LogoutServlet\"><i class=\"fas fa-sign-out-alt me-2\"></i> Logout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Update Item Section -->\r\n");
      out.write("    <div class=\"dashboard-content\">\r\n");
      out.write("      <h2>Update Item</h2>\r\n");
      out.write("      <p>Update the item details below:</p>\r\n");
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
      out.write("      ");

        Item item = (Item) request.getAttribute("item");
        if (item != null) {
      
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <form action=\"item-update\" method=\"post\" enctype=\"multipart/form-data\" class=\"mt-4\" id=\"updateItemForm\">\r\n");
      out.write("        <input type=\"hidden\" name=\"itemID\" value=\"");
      out.print( item.getItemID() );
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"existingImagePath\" value=\"");
      out.print( item.getImagePath() != null ? item.getImagePath() : "" );
      out.write("\">\r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"itemName\" class=\"form-label\">Item Name</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"itemName\" name=\"itemName\" value=\"");
      out.print( item.getItemName() );
      out.write("\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"itemBrand\" class=\"form-label\">Item Brand</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"itemBrand\" name=\"itemBrand\" value=\"");
      out.print( item.getItemBrand() != null ? item.getItemBrand() : "" );
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"qty\" class=\"form-label\">Quantity</label>\r\n");
      out.write("          <input type=\"number\" class=\"form-control\" id=\"qty\" name=\"qty\" value=\"");
      out.print( item.getQty() );
      out.write("\" required min=\"0\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"buyPrice\" class=\"form-label\">Buy Price</label>\r\n");
      out.write("          <input type=\"number\" step=\"0.01\" class=\"form-control\" id=\"buyPrice\" name=\"buyPrice\" value=\"");
      out.print( item.getBuyPrice() );
      out.write("\" required min=\"0\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"sellPrice\" class=\"form-label\">Sell Price</label>\r\n");
      out.write("          <input type=\"number\" step=\"0.01\" class=\"form-control\" id=\"sellPrice\" name=\"sellPrice\" value=\"");
      out.print( item.getSellPrice() );
      out.write("\" required min=\"0\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <label for=\"image\" class=\"form-label\">Item Image</label>\r\n");
      out.write("          ");
 if (item.getImagePath() != null && !item.getImagePath().isEmpty()) { 
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('/');
      out.print( item.getImagePath() );
      out.write("\" class=\"item-image\" alt=\"Current Item Image\">\r\n");
      out.write("            </div>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("          <input type=\"file\" class=\"form-control\" id=\"image\" name=\"image\" accept=\"image/*\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"formError\" class=\"text-danger\" style=\"display: none;\"></div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Update Item</button>\r\n");
      out.write("        <a href=\"item-list\" class=\"btn btn-secondary\">Cancel</a>\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("      <script>\r\n");
      out.write("        document.getElementById(\"updateItemForm\").addEventListener(\"submit\", function(event) {\r\n");
      out.write("          const itemName = document.getElementById(\"itemName\").value;\r\n");
      out.write("          const qty = document.getElementById(\"qty\").value;\r\n");
      out.write("          const buyPrice = document.getElementById(\"buyPrice\").value;\r\n");
      out.write("          const sellPrice = document.getElementById(\"sellPrice\").value;\r\n");
      out.write("          const errorDiv = document.getElementById(\"formError\");\r\n");
      out.write("          let error = \"\";\r\n");
      out.write("\r\n");
      out.write("          if (!itemName.trim()) {\r\n");
      out.write("            error = \"Item name is required\";\r\n");
      out.write("          } else if (qty < 0) {\r\n");
      out.write("            error = \"Quantity cannot be negative\";\r\n");
      out.write("          } else if (buyPrice < 0) {\r\n");
      out.write("            error = \"Buy price cannot be negative\";\r\n");
      out.write("          } else if (sellPrice < 0) {\r\n");
      out.write("            error = \"Sell price cannot be negative\";\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if (error) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            errorDiv.textContent = error;\r\n");
      out.write("            errorDiv.style.display = \"block\";\r\n");
      out.write("          } else {\r\n");
      out.write("            errorDiv.style.display = \"none\";\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      </script>\r\n");
      out.write("      ");
 } else { 
      out.write("\r\n");
      out.write("        <p class=\"text-danger\">Item not found.</p>\r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JS Scripts -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
