<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>
	<br />
	<c:forEach var="currentUser" items="${listUsers}">
		<div class="users">
			<div class="nameUsers">
				<c:out value="${currentUser.name}"> No name </c:out>
			</div>
			<div class="twitterNickname">
				<c:out value="${currentUser.twitterNickname}"> No twitterNickname </c:out>
			</div>
			<div class="joinedDate">
				<c:out value="${currentUser.joinedDate}"> No joinedDate </c:out>
			</div>
		</div>
		<br />
	</c:forEach>
</body>
</html>