<%@ page import="com.example.exercic1tp3.GestionEtudiants" %>
<%@ page import="com.example.exercic1tp3.Etudiant" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Liste des Etudiants</h1>
<%
    GestionEtudiants gestionEtudiants = (GestionEtudiants) request.getAttribute("GestionEtudiants");
    if (gestionEtudiants != null) {
        List<Etudiant> listeEtudiants = gestionEtudiants.getListeEtudiants();

        for (Etudiant etudiant : listeEtudiants) {
%>
<p>CIN: <%= etudiant.getCin() %>, Nom: <%= etudiant.getNom() %>, Moyenne: <%= etudiant.getMoyenne() %></p>
<%
        }
    } else {
        out.println("L'objet GestionEtudiants est nul.");
    }
%>

</body>
</html>
