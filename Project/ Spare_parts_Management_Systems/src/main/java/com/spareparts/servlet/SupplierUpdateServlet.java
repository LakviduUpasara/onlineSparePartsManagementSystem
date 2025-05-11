package com.spareparts.servlet;

import com.spareparts.controller.SupplierController;
import com.spareparts.model.Supplier;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/supplier-update")
public class SupplierUpdateServlet extends HttpServlet {
    private SupplierController supplierDAO;

    public void init() {
        supplierDAO = new SupplierController();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        Supplier supplier = supplierDAO.getSupplierById(id);
        request.setAttribute("supplier", supplier);
        RequestDispatcher dispatcher = request.getRequestDispatcher("supplier-update.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        String id = request.getParameter("supplierId");
        String name = request.getParameter("supplierName");
        String contact = request.getParameter("contactNumber");
        String address = request.getParameter("address");

        boolean updated = supplierDAO.updateSupplier(id, name, contact, address);
        if (updated) {
        	String alterMessage = "Supllier Details Update successful";
			response.getWriter().println("<script> alert('"+alterMessage+"'); window.location.href='supplier-list'</script>");
            
        } else {
            response.getWriter().println("Failed to update supplier.");
        }
    }
}
