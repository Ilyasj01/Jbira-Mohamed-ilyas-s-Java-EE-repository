<!DOCTYPE html>
<%@page import="classes.Produit"%>
<%@page import="classes.BD"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% for( Produit p: BD.produit ) { %>
	<b>Description</b>
	<%= p.getDescription() %><br>
	<b>Designation</b>
	<%= p.getDesignation() %><br>
	<b>Quantitee</b>
	<%= p.getQte() %>
	<% } %>
</body>
</html>