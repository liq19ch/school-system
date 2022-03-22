<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>

<head>
<title>Home</title>
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>


<body>

	User:
	<security:authentication property="principal.username" />
	<br>
	<br>
	Role:
	<security:authentication property="principal.authorities" />
	<hr>
	
	<security:authorize access="hasRole('STUDENT')">
		<p>
			<a href="${pageContext.request.contextPath}/students/info"> Personal Info </a>
		</p>
		<p>
			<a href="${pageContext.request.contextPath}/students/courses"> Courses List </a>
		</p>
		<p>
			<a href="${pageContext.request.contextPath}/students/my-courses"> My Courses </a>
		</p>
	</security:authorize>
	
	<security:authorize access="hasRole('TEACHER')">
		<p>
			<a href="${pageContext.request.contextPath}/teachers/courses-list"> Courses List </a>
		</p>
		<p>
			<a href="${pageContext.request.contextPath}/teachers/student-list">Student list</a>
		</p>
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
		<p>
			<a href="${pageContext.request.contextPath}/systems/list">Student list</a>
		</p>
		<p>

			<a href="${pageContext.request.contextPath}/systems"> System </a>
		</p>
	</security:authorize>

	<hr>

	<br>
	<br>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout" class="add-button"/>

	</form:form>

</body>
</html>