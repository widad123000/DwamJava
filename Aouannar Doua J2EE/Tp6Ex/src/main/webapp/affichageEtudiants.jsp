<%@ page import="mesClasses.Etudiant" %>
<%@ page import="mesClasses.GestionEtudiants" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Etudiant> liste = GestionEtudiants.getListeEtudiants();%>
<table border="1">
    <tr>
        <th>Nom</th>
        <th>Image</th>
    </tr>
    <% for (Etudiant etudiant : liste) { %>
        <tr>
            <td><%= etudiant.getNom() %></td>
            <td><%etudiant.getCin(); %></td>
            <td><%etudiant.getMoyenne(); %></td>
            <td><img src="images/<%= etudiant.getImage() %>" alt="Image de <%= etudiant.getNom() %>" width="100" height="100"></td>
        </tr>
    <% } %>
</table>

</body>
</html>