/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.104
 * Generated at: 2025-05-09 16:50:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Maneger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.spareparts.model.Supplier;

public final class maneger_005fdashbord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.spareparts.model.Supplier");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Manager  Dashboard - Full Trade Support</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\r\n");
      out.write("  <style>\r\n");
      out.write("    /* Your original CSS remains unchanged */\r\n");
      out.write("    /* ... (keep your previous style here) ... */\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <!-- Sidebar and Top Navbar (unchanged) -->\r\n");
      out.write("  <div class=\"sidebar\">\r\n");
      out.write("    <!-- Sidebar links -->\r\n");
      out.write("    <h4 class=\"text-center mb-4\">Admin Panel</h4>\r\n");
      out.write("    <a href=\"#\"><i class=\"fas fa-users\"></i> User Management</a>\r\n");
      out.write("    <a href=\"#\"><i class=\"fas fa-boxes\"></i> Stock Management</a>\r\n");
      out.write("    <a href=\"#\"><i class=\"fas fa-shopping-cart\"></i> Order Management</a>\r\n");
      out.write("    <a href=\"#\"><i class=\"fas fa-cash-register\"></i> Cashier</a>\r\n");
      out.write("    <a href=\"#\"><i class=\"fas fa-box\"></i> Item Management</a>\r\n");
      out.write("    <a href=\"#\"><i class=\"fas fa-user-friends\"></i> Customer Management</a>\r\n");
      out.write("    <a href=\"#\"><i class=\"fas fa-truck\"></i> Supplier Management</a>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"main-content\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light px-4\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Full Trade Support</a>\r\n");
      out.write("      <div class=\"ms-auto d-flex align-items-center\">\r\n");
      out.write("        <span class=\"me-3\">Welcome, <strong>Admin</strong> (Role: <em>Manager</em>)</span>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("          <a class=\"btn btn-light dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            <i class=\"fas fa-user-circle\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\r\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("            <li><a class=\"dropdown-item text-danger\" href=\"#\">Logout</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Dashboard Content -->\r\n");
      out.write("    <div class=\"dashboard-content\">\r\n");
      out.write("      <h2>Supplier Management</h2>\r\n");
      out.write("      <p>Manage your suppliers below:</p>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"table-container\">\r\n");
      out.write("        <table class=\"table table-striped table-bordered\">\r\n");
      out.write("          <thead class=\"table-primary\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>ID</th>\r\n");
      out.write("              <th>Name</th>\r\n");
      out.write("              <th>Contact</th>\r\n");
      out.write("              <th>Address</th>\r\n");
      out.write("              <th>Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            ");

              List<Supplier> supplierList = (List<Supplier>) request.getAttribute("supplierList");
              if (supplierList != null) {
                  for (Supplier supplier : supplierList) {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>");
      out.print( supplier.getId() );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( supplier.getName() );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( supplier.getContact() );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print( supplier.getAddress() );
      out.write("</td>\r\n");
      out.write("              <td>\r\n");
      out.write("                <a href=\"editSupplier.jsp?id=");
      out.print( supplier.getId() );
      out.write("\" class=\"btn btn-sm btn-primary\">Update</a>\r\n");
      out.write("                <a href=\"deleteSupplierServlet?id=");
      out.print( supplier.getId() );
      out.write("\" class=\"btn btn-sm btn-danger\"\r\n");
      out.write("                   onclick=\"return confirm('Are you sure you want to delete this supplier?')\">Delete</a>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 
                  }
              } else {
            
      out.write("\r\n");
      out.write("            <tr><td colspan=\"5\">No suppliers found.</td></tr>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <!-- Add Supplier Button -->\r\n");
      out.write("        <button class=\"btn btn-success mt-3\" data-bs-toggle=\"modal\" data-bs-target=\"#addSupplierModal\">Add New Supplier</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Add Supplier Modal -->\r\n");
      out.write("  <div class=\"modal fade\" id=\"addSupplierModal\" tabindex=\"-1\" aria-labelledby=\"addSupplierModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("      <form action=\"SupplierInsertServlet\" method=\"post\" class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h5 class=\"modal-title\" id=\"addSupplierModalLabel\">Add New Supplier</h5>\r\n");
      out.write("          <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"supplierName\" class=\"form-label\">Supplier Name</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"name\" id=\"supplierName\" required>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"contactNumber\" class=\"form-label\">Contact Number</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"contact\" id=\"contactNumber\" required>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"address\" class=\"form-label\">Address</label>\r\n");
      out.write("            <textarea class=\"form-control\" name=\"address\" id=\"address\" rows=\"3\" required></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">Add Supplier</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
