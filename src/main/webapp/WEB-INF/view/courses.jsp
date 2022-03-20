<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
<title>Courses List</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Courses List</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">

			<form:form action="search" method="GET">
				Search: <input type="text" name="searchName" />
				<input type="submit" value="Search" class="add-button" />
			</form:form>



			<table>
				<tr>
					<th>Course id</th>
					<th>Name</th>
					<th>Teacher</th>
					<th>Time</th>
					<th>Credit</th>
					<th>Action</th>
				</tr>

			</table>
			<p>
				<a href="${pageContext.request.contextPath}">Back to Home</a>
			</p>

		</div>
	</div>
</body>

</html>