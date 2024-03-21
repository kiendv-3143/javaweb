package com.jspservlet.controller.web;

import com.jspservlet.model.UserModel;
import com.jspservlet.service.UserInterfaceService;
import com.jspservlet.service.implement.UserService;
import com.jspservlet.utils.FormUtil;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;


@WebServlet(urlPatterns = { "/login", "/logout" })
public class AuthenticationController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if (uri.contains("/login")) {
			RequestDispatcher rd = req.getRequestDispatcher("views/web/login.jsp");
			rd.forward(req, resp);
		}
		else if (uri.contains("/logout")) {
			req.getSession().removeAttribute("user");
			resp.sendRedirect(req.getContextPath() + "/home");
		} else {
			resp.sendRedirect(req.getContextPath() + "/home");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
			UserModel userModel = FormUtil.toModel(UserModel.class, req);
			UserInterfaceService userService = new UserService();
			UserModel user = userService.findUserByUserName(userModel.getUserName());
			boolean passwordMatch = BCrypt.checkpw(userModel.getPassword(), user.getPassword());
			if (!passwordMatch) {
				resp.sendRedirect(req.getContextPath() + "/login?message=username_password_invalid&alert=danger");
			} else {
				req.getSession().setAttribute("user", user);
				resp.sendRedirect(req.getContextPath() + "/home");
			}
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}

}
