<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>

<head>
	<title>Home</title>
</head>


<body>
	<a href="student/list">Student list</a>
	
	<hr>
		User: <security:authentication property = "principal.username" />
		<br>
		<br>
		Role: <security:authentication property = "principal.authorities" />
	<hr>
	
		<a href ="${pageContext.request.contextPath}/courses"> Courses List </a>
	
	<hr>
	
	<br>
	<br>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout" />
	
	</form:form>
	
</body>
</html>