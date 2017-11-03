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
<form action="/Hibernate/Consultarid" method="post">
<table border="1">
<tr>
		<td align="left">
		Código
		</td>
		<td align="left">
		Nome
		</td>
		<td align="left">
		Endeço
		</td>
		<td align="left">
		Telefone
		</td>
		<td align="left">
		IP
		</td>
		<td align="left">
		Selecione
		</td>
</tr>
<c:forEach items="${listaPessoas.listaPessoas}" var="pessoas" >
	<tr>
		<td align="left">
		<input type="text" value="${pessoas.id}" name="id"/>
		</td>
		<td align="left">
		<input type="text" value="${pessoas.nome}" name="nome"/>
		</td>
		<td align="left">
		<input type="text" value="${pessoas.telefone}" name="telefone"/>
		</td>
		<td align="left">
		<input type="text" value="${pessoas.endereco}" name="endereco"/>
		</td>
		<td align="left">
		<input type="text" value="${pessoas.ip}" name="ip"/>
		</td>
		<td align="left">
		<input type="radio" value="${pessoas.id}" name="idSelecionado">
		</td>
	</tr>
</c:forEach>
</table>

<input type="submit" value="Editar" name="opcao"> <input type="submit" value="Deletar" name="opcao">
</form>
</body>
</html>