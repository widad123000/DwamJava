<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Résultat :</h1>
    <p>Le résultat de l'opération est : <%= request.getAttribute("resultat") %></p>
    <% 
    int resultat = (int) request.getAttribute("resultat");
    String operande1 = (String) request.getAttribute("op1");
    String operande2 = (String) request.getAttribute("op2");
    String operation = (String) request.getAttribute("select");
     out.println(request.getParameter("operande1") + " " + request.getParameter("operation") + " " + request.getParameter("operande2") + " = " + resultat);
     %>
     <a href="saisie.jsp">Retour</a>
</body>
</html>