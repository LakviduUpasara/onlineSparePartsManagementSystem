package com.spareparts.servlet;

import com.spareparts.controller.SupplierController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/supplier-delete")
public class SupplierDeleteServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        boolean isDeleted = SupplierController.deleteSupplier(id);

        if (isDeleted) {
            String message = "Supplier deleted successfully.";
            response.getWriter().println("<script>alert('" + message + "'); window.location.href='supplier-list';</script>");
        } else {
            String message = "Failed to delete supplier.";
            response.getWriter().println("<script>alert('" + message + "'); window.location.href='supplier-list';</script>");
        }
    }
}
