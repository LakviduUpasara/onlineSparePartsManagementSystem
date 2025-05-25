package com.spareparts.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.spareparts.controller.DetailsController;
import com.spareparts.model.DetailsModel;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String contactnumber = request.getParameter("contactnumber");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String userRole = request.getParameter("userRole"); 
        // Ensure this is in your form

        boolean isTrue = DetailsController.updatedata(id, name, address, contactnumber, email, password, userRole);

        if (isTrue) {
            List<DetailsModel> details = DetailsController.getById(id);
            request.setAttribute("details", details);
            String alertMessage = "Data Update Successful";
            response.getWriter().println("<script>alert('" + alertMessage + "'); window.location.href='GetAllServlet';</script>");
        } else {
        	
        	
            RequestDispatcher dis2 = request.getRequestDispatcher("GetAllServlet.jsp");
            dis2.forward(request, response);
        }
    }
}
