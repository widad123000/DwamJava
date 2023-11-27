<%@ page contentType="text/html" %>
<!DOCTYPE html>
<html>
<head>
    <title>Résultat</title>
</head>
<body>
    <h1>Résultat : <%= request.getAttribute("resultat") %></h1>
    <a href="saisie.jsp">Retour à la saisie</a>
</body>
</html>
