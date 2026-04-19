package com.fintech.servlet;

import com.fintech.dao.ProductDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            String name = req.getParameter("name");
            double price = Double.parseDouble(req.getParameter("price"));

            ProductDAO.addProduct(name, price);

            res.sendRedirect("dashboard.jsp");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
