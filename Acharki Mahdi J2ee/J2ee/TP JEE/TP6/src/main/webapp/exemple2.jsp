<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Affichage avec des expressions:</h1><br> 

Protocol : <%= request.getProtocol() %><br> 
Scheme :   <%= request.getScheme()   %><br>

ServerName:  <%= request.getServerName() %><br>
ServerPort:  <%= request.getServerPort() %><br>

RemoteAddr: <%= request.getRemoteAddr() %><br>
RemoteHost: <%= request.getRemoteHost() %><br>

Method : <%= request.getMethod() %><br>

<h1>Affichage avec des scriptlets: </h1> <br>

Protocol : <%out.println(request.getProtocol()); %><br>
Scheme :   <%out.println(request.getScheme());   %><br>

ServerName: <%out.println(request.getServerName()); %><br>
ServerPort: <%out.println(request.getServerPort());%><br>

RemoteAddr: <%out.println(request.getRemoteAddr());%><br>
RemoteHost<% out.println(request.getRemoteHost()); %><br>

</body>
</html>