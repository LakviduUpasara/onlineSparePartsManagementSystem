/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.104
 * Generated at: 2025-05-11 23:18:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>User Registration - Full Trade Support</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("      background-color: #f8f9fa;\r\n");
      out.write("    }\r\n");
      out.write("    .sidebar {\r\n");
      out.write("      height: 100vh;\r\n");
      out.write("      background-color: #0d6efd;\r\n");
      out.write("      color: white;\r\n");
      out.write("      position: fixed;\r\n");
      out.write("      width: 240px;\r\n");
      out.write("      padding-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .sidebar a {\r\n");
      out.write("      color: white;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      display: block;\r\n");
      out.write("      padding: 12px 20px;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("    }\r\n");
      out.write("    .sidebar a:hover {\r\n");
      out.write("      background-color: #0b5ed7;\r\n");
      out.write("    }\r\n");
      out.write("    .main-content {\r\n");
      out.write("      margin-left: 240px;\r\n");
      out.write("    }\r\n");
      out.write("    .navbar {\r\n");
      out.write("      background-color: #ffffff;\r\n");
      out.write("      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    }\r\n");
      out.write("    .navbar .nav-link, .navbar .navbar-brand {\r\n");
      out.write("      color: #333;\r\n");
      out.write("    }\r\n");
      out.write("    .dashboard-content {\r\n");
      out.write("      padding: 40px;\r\n");
      out.write("      min-height: calc(100vh - 56px);\r\n");
      out.write("    }\r\n");
      out.write("    .form-container {\r\n");
      out.write("      background-color: #ffffff;\r\n");
      out.write("      padding: 30px 35px;\r\n");
      out.write("      border-radius: 10px;\r\n");
      out.write("      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      max-width: 500px;\r\n");
      out.write("      margin: auto;\r\n");
      out.write("      margin-top: 30px;\r\n");
      out.write("    }\r\n");
      out.write("    h2 {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      color: #007BFF;\r\n");
      out.write("      margin-bottom: 25px;\r\n");
      out.write("    }\r\n");
      out.write("    .form-group {\r\n");
      out.write("      margin-bottom: 15px;\r\n");
      out.write("    }\r\n");
      out.write("    label {\r\n");
      out.write("      display: block;\r\n");
      out.write("      margin-bottom: 6px;\r\n");
      out.write("      color: #333;\r\n");
      out.write("      font-weight: 500;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=\"text\"],\r\n");
      out.write("    input[type=\"email\"],\r\n");
      out.write("    input[type=\"password\"] {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      border: 1px solid #ccc;\r\n");
      out.write("      border-radius: 6px;\r\n");
      out.write("      font-size: 14px;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=\"submit\"] {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      padding: 12px;\r\n");
      out.write("      background-color: #007BFF;\r\n");
      out.write("      color: white;\r\n");
      out.write("      border: none;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("      border-radius: 6px;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      transition: background-color 0.3s ease;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=\"submit\"]:hover {\r\n");
      out.write("      background-color: #0056b3;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Sidebar -->\r\n");
      out.write("<div class=\"sidebar\">\r\n");
      out.write("  <h4 class=\"text-center mb-4\">Manager Panel</h4>\r\n");
      out.write("  <a href=\"#\"><i class=\"fas fa-users\"></i> User Management</a>\r\n");
      out.write("  <a href=\"#\"><i class=\"fas fa-boxes\"></i> Stock Management</a>\r\n");
      out.write("  <a href=\"#\"><i class=\"fas fa-shopping-cart\"></i> Order Management</a>\r\n");
      out.write("  <a href=\"#\"><i class=\"fas fa-cash-register\"></i> Cashier</a>\r\n");
      out.write("  <a href=\"#\"><i class=\"fas fa-box\"></i> Item Management</a>\r\n");
      out.write("  <a href=\"#\"><i class=\"fas fa-user-friends\"></i> Customer Management</a>\r\n");
      out.write("  <a href=\"#\"><i class=\"fas fa-truck\"></i> Supplier Management</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Main Content -->\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-light px-4\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Full Trade Support</a>\r\n");
      out.write("    <div class=\"ms-auto d-flex align-items-center\">\r\n");
      out.write("      <span class=\"me-3\">Welcome, <strong>Manager</strong></span>\r\n");
      out.write("      <div class=\"dropdown\">\r\n");
      out.write("        <a class=\"btn btn-light dropdown-toggle\" href=\"#\" id=\"userDropdown\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("          <i class=\"fas fa-user-circle\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\r\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\r\n");
      out.write("          <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("          <li><a class=\"dropdown-item text-danger\" href=\"#\">Logout</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"dashboard-content\">\r\n");
      out.write("    <div class=\"form-container\">\r\n");
      out.write("    \r\n");
      out.write("      <h2>User Registration</h2>\r\n");
      out.write("      <form action=\"InsetServlet\" method=\"post\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label>Name:</label>\r\n");
      out.write("          <input type=\"text\" name=\"name\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label>Address:</label>\r\n");
      out.write("          <input type=\"text\" name=\"address\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label>Contact Number:</label>\r\n");
      out.write("          <input type=\"text\" name=\"contactnumber\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label>Email:</label>\r\n");
      out.write("          <input type=\"email\" name=\"email\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label>Password:</label>\r\n");
      out.write("          <input type=\"password\" name=\"password\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label>User Role:</label>\r\n");
      out.write("          <select name=\"userRole\" class=\"form-control border border-gray-300 rounded px-3 py-2 w-full\" required>\r\n");
      out.write("            <option value=\"Cashier\">Cashier</option>\r\n");
      out.write("            <option value=\"Stock Manager\">Stock Manager</option>\r\n");
      out.write("            <option value=\"Admin\">Admin</option>\r\n");
      out.write("            <option value=\"Manager\">Manager</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
