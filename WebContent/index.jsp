<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ejemplo Servlet</h1>
	<form action="${pageContext.request.contextPath}/AnotacionServlet" method="post">
		
		<label>Ingrese Usuario: </label><input name="user" type="text">
		<label>Ingrese Clave: </label><input name="pass" type="password">
		<input type="submit" value="Validar">
	</form>
</body>
</html>