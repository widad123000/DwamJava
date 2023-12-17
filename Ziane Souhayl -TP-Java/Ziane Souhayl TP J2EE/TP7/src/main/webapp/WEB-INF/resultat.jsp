<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculatrice - Résultat</title>
</head>
<body>

    <h2>Résultat de l'opération</h2>

    <%-- Afficher le résultat --%>
    <p><%= request.getAttribute("resultat") %></p>

</body>
</html>
