<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculatrice - Saisie</title>
    <script>
        
        function afficherMessageErreur() {
            var messageErreur = '<%= request.getAttribute("message") %>';
            if (messageErreur !== null && messageErreur !== '') {
                alert(messageErreur);
            }
        }
    </script>
</head>
<body onload="afficherMessageErreur();">

    <h2>Calculatrice</h2>

    <form action="Calcul" method="post">
        <label for="operande1">Operand 1:</label>
        <input type="text" name="operande1" required>
        <br>
        <label for="operande2">Operand 2:</label>
        <input type="text" name="operande2" required>
        <br>
        <label for="operation">Operation:</label>
        <select name="operation" required>
            <option value="addition">Addition</option>
            <option value="soustraction">Soustraction</option>
            <option value="multiplication">Multiplication</option>
            <option value="division">Division</option>
        </select>
        <br>
        <input type="submit" value="Calculer">
    </form>

</body>
</html>
