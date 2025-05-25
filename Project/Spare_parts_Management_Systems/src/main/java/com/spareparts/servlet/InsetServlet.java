package com.spareparts.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spareparts.controller.DetailsController;

@WebServlet("/InsetServlet")
public class InsetServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String contactnumber = request.getParameter("contactnumber");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String userRole = request.getParameter("userRole"); // Added role

        // Insert into database
        
        String messege ;
        boolean isTrue = DetailsController.insertdata(name, address, contactnumber, email, password, userRole);

        // Handle result
        if (isTrue) {
        	
        	messege =  "Data inserted successfully." ;
            response.getWriter().println("<script>alert('"+messege+"'); window.location.href='GetAllServlet';</script>");
        } else {
        	messege =  "This Email Address Have Alrady Accounts " ;
            response.getWriter().println("<script>alert('"+messege+"'); window.location.href='GetAllServlet';</script>");
        }
    }
}
