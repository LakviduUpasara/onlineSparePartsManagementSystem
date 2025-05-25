package com.spareparts.servlet;

import com.spareparts.controller.SupplierController;
import com.spareparts.model.Supplier;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/supplier-list")
public class SupplierListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       
        List<Supplier> supplierList = SupplierController.getAllSuppliers();

        // Set it in request scope
        request.setAttribute("supplierList", supplierList);

        // Forward to JSP (manager.jsp or supplier-list.jsp)
        RequestDispatcher dispatcher = request.getRequestDispatcher("Maneger/maneger_dashbord.jsp"); // Or supplier-list.jsp
        dispatcher.forward(request, response);
    }
}
