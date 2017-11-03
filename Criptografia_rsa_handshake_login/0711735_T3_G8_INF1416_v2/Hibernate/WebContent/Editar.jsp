<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Hibernate/Editar" method="post">
<table border="1">
<tr>
		<td align="left">
		Código
		</td>
		<td align="left">
		Nome
		</td>
		<td align="left">
		Telefone 
		</td>
		<td align="left">
		Endereço
		</td>
		<td align="left">
		IP
		</td>
</tr>
<c:forEach items="${listaPessoas.listaPessoas}" var="pessoas" >
	<tr>
		<td align="left">
		<c:out value="${pessoas.id}"/>
		</td>
		<td align="left">
		<c:out value="${pessoas.nome}"/>
		</td>
		<td align="left">
		<c:out value="${pessoas.telefone}"/>
		</td>
		<td align="left">
		<c:out value="${pessoas.endereco}"/>
		</td>
		<td align="left">
		<c:out value="${pessoas.ip}"/>
		</td>
		<td align="left">
		<input type="radio" name="idSelecionado" value="${pessoas.id}">
		</td>
	</tr>
</c:forEach>
</table>
<input type="submit" value="Editar">
</form>
</body>
</html>