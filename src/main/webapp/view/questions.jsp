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
	<form:form method="POST" class="form-horizontal" action="/finish"
		modelAttribute="question">
		<fieldset>
			<legend>Pytania:</legend>

			<c:forEach items="${questions}" var="question" varStatus="loop">

				<div class="col-md-12">
					<label class="col-md-4 control-label" for="q${loop.count}">
						${question.question} </label>
					<div class="col-md-4">
						<div class="">
							<label class="radio-inline" for="A"> <input type="radio"
								name="q${loop.count}" value="${question.answerA}" required>
								${question.answerA}
							</label> <label class="radio-inline" for="B"> <input type="radio"
								name="q${loop.count}" value="${question.answerB}" required>
								${question.answerB}
							</label>
						</div>
						<div class="">
							<label class="radio-inline" for="C"> <input type="radio"
								name="q${loop.count}" value="${question.answerC}" required>
								${question.answerC}
							</label> <label class="radio-inline" for="D"> <input type="radio"
								name="q${loop.count}" value="${question.answerD}" required>
								${question.answerD}
							</label>
						</div>
						<br>
					</div>
				</div>
				<br>
				<br>
			</c:forEach>
			<div class="col-md-12">
				<label class="col-md-4 control-label" for="submit"></label>
				<div class="col-md-4">
					<input type="submit" class="btn btn-success" value="Wyślij" />
				</div>
			</div>

		</fieldset>
	</form:form>
</body>
</html>
