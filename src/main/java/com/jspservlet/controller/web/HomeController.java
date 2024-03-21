package com.jspservlet.controller.web;

import java.io.IOException;
import java.util.List;

import com.jspservlet.model.ItemModel;
import com.jspservlet.model.UserModel;
import com.jspservlet.service.ItemServiceInterface;
import com.jspservlet.service.implement.ItemService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserModel user = (UserModel) req.getSession().getAttribute("user");

        ItemServiceInterface itemService = new ItemService();
        List<ItemModel> items = itemService.getAll();

		req.setAttribute("user", user);
		req.setAttribute("items", items);

        RequestDispatcher rd = req.getRequestDispatcher("views/web/home.jsp");
        rd.forward(req, resp);
    }
}
