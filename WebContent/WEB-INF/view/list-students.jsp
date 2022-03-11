<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<title>List Students</title>
	
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Student List Management</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
		
			<input type="button" value="Add"
					onclick="window.location.href='addForm'; return false;"
					class="add-button" />
		
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Grade</th>
					<th>Enroll year</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempStudent" items="${students}">
				
				<c:url var="updateLink" value="/student/updateForm">
					<c:param name="studentId" value="${tempStudent.id}" />
				</c:url>
				<c:url var="deleteLink" value="/student/delete">
					<c:param name="studentId" value="${tempStudent.id}" />
				</c:url>
				
					<tr>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.email}</td>
						<td>${tempStudent.grade}</td>
						<td>${tempStudent.enrollmentYear}</td>
						<td>
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if(!(confirm('are you sure you want to delete this student?'))) return false">Delete</a>
						</td>
					</tr>
				
				</c:forEach>
					
			</table>
			<p>
				<a href="${pageContext.request.contextPath}">Back to Home</a>
			</p>
		
		</div>
	</div>
</body>

</html>