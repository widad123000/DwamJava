<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>


script type="text/javascript">
       
        var message = '<%= request.getAttribute("message") %>';
        if (message !== null && message !== '') {
            alert(message);
        }
        </script>
        
        
<form action="saisie" method="Get">
<input type="Number" name="op1">
<input type="Number" name="op2">
<select name="select">
<option value="+">+</option>
<option value="-">-</option>
<option value="*">*</option>
<option value="/">/</option>
</select>
<input= type="submit" name="calcule">
</form>
</body>
</html>