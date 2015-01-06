<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Tweets by userId</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/inc/style.css"/>" />
</head>
<body>
	<form method="post" action="<c:url value="/tweetsid" />">
		<fieldset>
		
			<legend>List Tweets by userId</legend>
			<p>Show the list of tweets for a specific user regarding his id</p>
			
			<input type="text" name="tweetid" class="sansLabel" /> 
			<input type="submit" value="Validate" class="sansLabel" />
			
			<p> Tweets retrieved: </p>
				<c:forEach var="currentTweet" items="${listTweets}">
					<p>
						<c:out value="${currentTweet.message}" />
					</p>
				</c:forEach>
			<br />
			
		</fieldset>
	</form>
</body>
</html>