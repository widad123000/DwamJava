<%@ page contentType="text/html" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Accueil</title>
</head>
<body>
    <h1>Bonjour <%= request.getAttribute("utilisateur_connecte") %></h1>
</body>
</html>
