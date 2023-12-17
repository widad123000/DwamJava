<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exemple 2</title>
</head>
<body>
<h1>Affichage avec des expressions:</h1><br>
Protocol : <%= request.getProtocol() %><br>
Scheme : <%= request.getScheme() %><br>
ServerName : <%= request.getServerName() %><br>
ServerPort : <%= request.getServerPort() %><br>
RemoteAddr : <%= request.getRemoteAddr() %><br>
RemoteHost : <%= request.getRemoteHost() %><br>

<h1>Affichage avec des scriptlets: </h1><br>
Protocol : <% out.println(request.getProtocol()); %><br>
Scheme : <% out.println(request.getScheme()); %><br>
ServerName : <% out.println(request.getServerName()); %><br>
ServerPort : <% out.println(request.getServerPort()); %><br>
RemoteAddr : <% out.println(request.getRemoteAddr()); %><br>
RemoteHost : <% out.println(request.getRemoteHost()); %><br>
</body>
</html>
