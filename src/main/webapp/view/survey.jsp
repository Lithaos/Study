<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>

<body>
 <form:form method="POST" class="form-horizontal"
          action="/survey" modelAttribute="user">
		<fieldset>

			<!-- Form Name -->
			<legend>Formularz</legend>

			<!-- Name input -->
			

			<!-- Age input -->
			<div class="form-group">
				<form:label class="col-md-4 control-label" path="age" for="age">Wiek:</form:label>
				<div class="col-md-4">
					<form:input id="age" path="age" name="age" type="number"
						placeholder="Enter your age" class="form-control input-md"
						required=""/>

				</div>
			</div>

			<!-- Sex select -->
			<div class="form-group">
				<form:label class="col-md-4 control-label" path="sex" for="sex">Płeć</form:label>
				<div class="col-md-4">
					<div class="radio">
					
						<form:label path="sex" for="sex-0"> <form:radiobutton path="sex" value="Male"/>Mężczyzna
						</form:label>
					</div>
					<div class="radio">
						<form:label path="sex" for="sex-1"> <form:radiobutton path="sex" value="Female"/>Kobieta
						</form:label>
					</div>
					<div class="radio">
						<form:label path="sex" for="sex-2"> <form:radiobutton path="sex" value="Other"/>Inna
						</form:label>
					</div>
				</div>
			</div>

			<!-- Submit button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="submit"></label>
				<div class="col-md-4">
				<input type="submit" class="btn btn-success" value="Wyślij"/>
				</div>
			</div>

		</fieldset>
	</form:form>
</body>
</html>
