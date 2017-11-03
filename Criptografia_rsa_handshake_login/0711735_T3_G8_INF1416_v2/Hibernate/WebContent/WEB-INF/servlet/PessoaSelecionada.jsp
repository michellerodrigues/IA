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
Pessoa selecionada para edição!

<form action="/Hibernate/Editar" method="post">
id:<input type="text" value="${pessoa.id}" name="id"/> <br/>
<input type="text" value="${pessoa.nome}" name="nome"/> <br/>
<input type="text" value="${pessoa.telefone}" name="telefone"/> <br/>
<input type="text" value="${pessoa.endereco}" name="endereco"/> <br/>
<input type="text" value="${pessoa.ip}" name="ip"/> <br/>
<input type="submit" value="Salvar"/> <br/>
</form>
</body>
</html>