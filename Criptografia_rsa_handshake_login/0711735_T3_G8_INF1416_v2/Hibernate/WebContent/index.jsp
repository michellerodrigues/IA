<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Hibernate/Inserir" method="post">
Nome: <input type="text" name="nome">
Endere�o: <input type="text" name="endereco">
Telefone: <input type="text" name="telefone">
IP: <input type="text" name="ip" value="${pageContext.request.remoteAddr}"><input type="submit" value="Incluir">


</form>
</body>
</html>