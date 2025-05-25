package com.spareparts.servlet;

import com.spareparts.controller.ItemController;
import com.spareparts.dao.ItemDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/item-add")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)
public class ItemAddServlet extends BaseServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ItemController itemController;

    @Override
    public void init() {
        super.init();
        itemController = new ItemController(itemDAO);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            String itemName = request.getParameter("itemName");
            String itemBrand = request.getParameter("itemBrand");
            int qty = Integer.parseInt(request.getParameter("qty"));
            double buyPrice = Double.parseDouble(request.getParameter("buyPrice"));
            double sellPrice = Double.parseDouble(request.getParameter("sellPrice"));
            Part filePart = request.getPart("image");
            String applicationPath = request.getServletContext().getRealPath("");

            itemController.addItem(itemName, itemBrand, qty, buyPrice, sellPrice, filePart, applicationPath);
            response.sendRedirect("item-list");
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        } catch (IllegalArgumentException e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/itemDashboard.jsp").forward(request, response);
        }
    }
}