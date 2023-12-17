<%@ page import="java.util.ArrayList" %>
<%@ page import="mesClasses.Etudients" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Affichage des étudiants</title>
</head>
<body>

<h2>Liste des étudiants</h2>

<table border="1">
    <thead>
        <tr>
            <th>Nom</th>
            <th>CIN</th>
        </tr>
    </thead>
    <tbody>
        <% List<Etudients> liste = Etudients.getListeEtudiants(); %>
        <% for (Etudients etudiant : liste) { %>
            <tr>
                <td><%= etudiant.getNom() %></td>
                <td><%= etudiant.getCin() %></td>
                <td><img src="images/Welcome.png"></td>
            </tr>
        <% } %>
    </tbody>
</table>

</body>
</html>