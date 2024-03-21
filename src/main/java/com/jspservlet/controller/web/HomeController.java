package com.jspservlet.controller.web;

import java.io.IOException;

import com.jspservlet.model.UserModel;
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
        RequestDispatcher rd = req.getRequestDispatcher("views/web/home.jsp");
        UserModel user = (UserModel) req.getSession().getAttribute("user");
		req.setAttribute("user", user);
        rd.forward(req, resp);
    }
}
