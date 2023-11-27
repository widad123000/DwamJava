<%@ page contentType="text/html" import="java.util.ArrayList, tp6.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Affichage des Étudiants</title>
</head>
<body>
    <h1>Liste des Étudiants</h1>

    <%-- Déclaration et initialisation de la liste d'étudiants --%>
    <% ArrayList<Etudiant> liste = GestionEtudiants.getListeEtudiants(); %>

    <%-- Affichage des étudiants dans un tableau --%>
    <table border="1">
        <thead>
            <tr>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
            <% for (Etudiant etudiant : liste) { %>
                <tr>
                    <td><%= etudiant.getNom() %></td>
                    <td><%= etudiant.getPrenom() %></td>
                    <td><img src="<%= request.getContextPath() %>/images/<%= etudiant.getImage() %>" alt="Image"></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
