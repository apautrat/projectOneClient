<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>
	<table style="border: 2px solid black; border-collapse: collapse">
		<tr>
			<th style="border: 1px solid gray">Name</th>
			<th style="border: 1px solid gray">Twitter Nickname</th>
			<th style="border: 1px solid gray">Joined Date</th>
		</tr>
		<c:forEach var="currentUser" items="${listUsers}">
			<tr>
				<td style="border: 1px solid gray"><c:out value="${currentUser.name}"> No name </c:out></td>
				<td style="border: 1px solid gray"><c:out value="${currentUser.twitterNickname}"> No twitterNickname </c:out></td>
				<td style="border: 1px solid gray"><c:out value="${currentUser.joinedDate}"> No joinedDate </c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>