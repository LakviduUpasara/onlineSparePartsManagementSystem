package com.spareparts.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spareparts.controller.DetailsController;
import com.spareparts.model.DetailsModel;

@WebServlet("/GetAllServlet")
public class GetAllServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handles GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<DetailsModel> alldetails = DetailsController.getAllDetail();
            request.setAttribute("alldetails", alldetails);

            RequestDispatcher dispatcher = request.getRequestDispatcher("Admin/display.jsp");
            dispatcher.forward(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<script>alert('Error fetching user details.'); window.location.href='Admin/display.jsp';</script>");
        }
    }

    // Handles POST requests the same way as GET
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
