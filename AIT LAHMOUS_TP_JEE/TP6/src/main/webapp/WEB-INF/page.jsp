<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 26/11/2023
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page import="mesClasses.Etudiant" %>
<%@ page import="mesClasses.GestionEtudiants" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<Etudiant> liste = GestionEtudiants.getListeEtudiants();
%>
<table border="1">
    <tr>
        <th>Nom</th>
        <th>Moyenne</th>
        <th>Image</th>
    </tr>
    <% for (Etudiant etudiant : liste) { %>
    <tr>
        <td><%= etudiant.getNom() %></td>
        <td><%= etudiant.getMoyenne() %></td>
        <td><img src="images/<%= etudiant.getImage() %>" width="40" height="40"></td>
    </tr>
    <% } %>
</table>


</body>
</html>
