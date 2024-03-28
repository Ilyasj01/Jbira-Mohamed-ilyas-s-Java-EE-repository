package com.lus.dawm.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login.php")
public class LoginController extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		String email= req.getParameter("email");
		String passWord = req.getParameter("password");
		PrintWriter printWriter = res.getWriter();
		if ("admin".equals(email) && "root".equals(passWord)) {
			printWriter.println("bienvenue");
		}
		else {
			printWriter.println("Login ou mot de passe incorrects !");
		}
	}
}	
//yassine.aithsain@uit.ac.ma
