<%@ page import="mesClasses.Etudiant, mesClasses.GestionEtudiants" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Affichage des Étudiants</title>
</head>
<body>
    <%-- Déclaration de la variable liste --%>
    <% ArrayList<Etudiant> liste = GestionEtudiants.getListeEtudiants(); %>

    <h2>Liste des Étudiants</h2>
    
    <%-- Affichage des noms des étudiants dans un tableau --%>
    <table border="1">
        <thead>
            <tr>
                <th>Nom</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
            <% for (Etudiant etudiant : liste) { %>
                <tr>
                    <td><%= etudiant.getNom() %></td>
                    <td><img src="images/<%= etudiant.getImage() %>" alt="<%= etudiant.getNom() %>"></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
