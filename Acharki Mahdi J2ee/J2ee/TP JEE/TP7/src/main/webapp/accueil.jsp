<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <% String utilisateurConnecte = (String) request.getAttribute("utilisateurConnecte"); %>
  <h2>Bonjour <%= utilisateurConnecte %></h2>
  
</body>
</html>