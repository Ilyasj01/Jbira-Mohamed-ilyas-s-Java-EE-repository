package com.lus.dawm.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Categorie.php")
public class ProductController extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		String Id=req.getParameter("id_Pro");
		String designation= req.getParameter("designation_Pro");
		String quantite = req.getParameter("quantite");
		PrintWriter printWriter = res.getWriter();
		
		if (Integer.valueOf(Id)<=0) {
			printWriter.println("L id est non valide !");
		}
		else if(Integer.valueOf(quantite)<=0) {
			printWriter.println("La quantitée est non valide !");
		}
		else if(designation.isEmpty()||Id.isEmpty()||quantite.isEmpty()){
			printWriter.println("Remplie tous les champs !");
		}
		else {
			printWriter.println("Votre Produit est ajoutée avec succes.");
		}
	}
}	
