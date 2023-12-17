<%@ page import="com.example.exercice3.HelloServlet" %>
<% HelloServlet.creditModel mdel = (HelloServlet.creditModel) request.getAttribute("creditModel"); %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <meta charset="utf-8">

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        div {
            margin: 20px;
        }

        form {
            border: 1px solid #ccc;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
        }

        table {
            width: 100%;
        }

        td {
            padding: 10px;
        }

        button {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }

        /* Ajoutez d'autres styles selon vos besoins */
    </style>
</head>
<body>
<div>
    <form action="calculerMesualite.do" method="post">
        <table>
            <tr>
                <td>Montant :</td>
                <td><input name="montant" type="text"></td>
                <td>DH</td>
            </tr>
            <tr>
                <td>Taux :</td>
                <td><input name="taux" type="text"></td>
                <td>%</td>
            </tr>
            <tr>
                <td>Duree :</td>
                <td><input name="duree" type="text"></td>
                <td>mois</td>
            </tr>
        </table>
        <button type="submit">Calculer</button>
    </form>
</div>
<div>
    <%
        if (mdel != null) {
            // Utilisez mdel.getResultat() en toute sécurité ici
            double mentionalite = mdel.getResultat();
            out.println("Mentionalite = " + mentionalite);
        } else {
            out.println("L'objet mdel est null.");
        }
    %>
</div>
</body>
</html>
