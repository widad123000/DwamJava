<%@page import="ma.est.entities.Etudiant"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% List<Etudiant> listEtudiant = (List<Etudiant>) request.getAttribute("lc"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addEtudiant" method="POST">
	CIN : <input type="text" name="numC">
	<br>
	Nom :  <input type="text" name="solde">
	<br>
	Moyenne : <input type="text" name="etat">
	<br>
	<input type="submit" value="Envoyer">
</form>
<h3>Liste des etudiants : </h3>
<table border="2">
	<tr>
	<td>CIN</td>
	<td>Nom</td>
	<td>Moyenne</td>
	</tr>
	<%
	for(Etudiant e : listEtudiant) { %>
		<tr>
			<td> <%=e.getCin() %> </td>
			<td> <%=e.getNom() %> </td>
			<td> <%=e.getMoyenne() %> </td>
			<td> <a href="Supprimer?cmp=<%=e.getCin() %>">Supprimer</a></td>
		</tr>
	<%
	}
	%>
</table>


</body>
</html>