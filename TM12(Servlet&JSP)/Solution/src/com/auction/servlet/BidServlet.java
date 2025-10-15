package com.auction.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.auction.bean.BidBean;

public class BidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String itemId = request.getParameter("itemId");
        String itemName = request.getParameter("itemName");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String amountStr = request.getParameter("amount");
        String autoInc = request.getParameter("autoIncrement");

        if (itemId.isEmpty() || itemName.isEmpty() || name.isEmpty() || email.isEmpty() || amountStr.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        } else {
            double amount = Double.parseDouble(amountStr);
            boolean autoIncrement = (autoInc != null);

            BidBean bid = new BidBean();
            bid.setItemId(itemId);
            bid.setItemName(itemName);
            bid.setName(name);
            bid.setEmail(email);
            bid.setAmount(amount);
            bid.setAutoIncrement(autoIncrement);

            request.setAttribute("bid", bid);
            RequestDispatcher rd = request.getRequestDispatcher("bidSuccess.jsp");
            rd.forward(request, response);
        }
    }
}
