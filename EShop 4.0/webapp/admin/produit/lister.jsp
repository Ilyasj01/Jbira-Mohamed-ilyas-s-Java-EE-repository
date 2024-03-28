<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Produits:</h1>
<c:forEach var="produit" items="${MySqlDB.produits}">	
	<b>id:</b>
    <c:out value="${produit.id}" /><br>
	<b>id Categorie:</b>
    <c:out value="${produit.id_Cat}" /><br>
	<b>Description:</b>
    <c:out value="${produit.description}" /><br>
    <b>Designation:</b>
    <c:out value="${produit.designation}" /><br>
    <b>Quantite:</b>
    <c:out value="${produit.qte}" /><br>
    <b>Prix:</b>
    <c:out value="${produit.prix}" /><br>
    </c:forEach>
</body>
</html>
	