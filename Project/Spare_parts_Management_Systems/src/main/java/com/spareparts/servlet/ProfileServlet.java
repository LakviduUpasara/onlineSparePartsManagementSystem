package com.spareparts.servlet;

import com.spareparts.controller.DetailsController;
import com.spareparts.model.DetailsModel;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String userId = String.valueOf(session.getAttribute("userId"));

        // Get user details from DB
        List<DetailsModel> details = DetailsController.getById(userId);

        if (!details.isEmpty()) {
            request.setAttribute("profile", details.get(0)); // Send one user only
        }

        RequestDispatcher dis = request.getRequestDispatcher("profile.jsp");
        dis.forward(request, response);
    }
}
