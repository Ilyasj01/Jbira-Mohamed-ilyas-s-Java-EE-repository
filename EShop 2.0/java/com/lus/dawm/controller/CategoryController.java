package com.lus.dawm.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Categorie.php")
public class CategoryController extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		String Id=req.getParameter("id_Cat");
		String designation= req.getParameter("designation_Cat");
		String description = req.getParameter("description");
		PrintWriter printWriter = res.getWriter();
		
		if (Integer.valueOf(Id)<=0) {
			printWriter.println("L id est non valide !");
		}
		else if(designation.isEmpty()||description.isEmpty()||Id.isEmpty()){
			printWriter.println("Remplie tous les champs !");
		}
		else {
			printWriter.println("Votre Categorie est ajoutée avec succes.");
		}
	}
}	
