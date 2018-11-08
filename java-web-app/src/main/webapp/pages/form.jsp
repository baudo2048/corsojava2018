<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/MainServlet" method="POST">
		Nome: <input name="nome" type="text"><br/>
		Cognome: <input name="cognome" type="text"><br/>
		<input type="submit" value="Conferma">
	</form>
</body>
</html>