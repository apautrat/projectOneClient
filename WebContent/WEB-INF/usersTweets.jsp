<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users and tweets</title>
</head>
<body>
	<br />
	<c:forEach var="currentUser" items="${listUsers}">
		<div class="users">
				<c:out value="${currentUser.name}"> No name </c:out>
				<c:out value="${currentUser.twitterNickname}"> No twitterNickname </c:out>
		</div>
		
		<c:forEach var="currentTweet" items="${listTweets}">
			<c:if test="${currentUser.id == currentTweet.authorId }">
				<c:out value="${currentTweet.message}"> No tweet </c:out>
				<br />
			</c:if>
		</c:forEach>
		<br />
		<br />
		<br />
		<br />
	</c:forEach>
</body>
</html>