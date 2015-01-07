<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users and tweets</title>
</head>
<body>
	<table style="border: 2px solid black; border-collapse: collapse">
		<tr>
			<th style="border: 1px solid gray">User</th>
			<th style="border: 1px solid gray">Tweets</th>
		</tr>
		<c:forEach var="currentUser" items="${listUsers}">
			<tr>
				<td style="border: 1px solid gray"><c:out
						value="${currentUser.name}"> No name </c:out> <c:out
						value="${currentUser.twitterNickname}"> No twitterNickname </c:out>
				</td>
				<td style="border: 1px solid gray">
					<ul>
						<c:forEach var="currentTweet" items="${listTweets}">
							<c:if test="${currentUser.id == currentTweet.authorId }">
								<li><c:out value="${currentTweet.message}"> No tweet </c:out></li>
								<br />
							</c:if>
						</c:forEach>
					</ul>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>