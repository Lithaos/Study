<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<c:set var="user" value="${user}" scope="session" />
<body>
	<div class="container-fluid bg-2 text-center">
		<h3>Linia 0</h3>
		<p>Artykuł 1</p>
		<a href="/article2" class="btn btn-default btn-lg">Następna strona</a>
	</div>
</body>
</html>


