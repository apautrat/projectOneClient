<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css"/>" />
    </head>
    <body>
        <form method="post" action="<c:url value="/users" />">
            <fieldset>
                <legend>List User</legend>
                <p>List User 
               <c:out value="${listUsers[0].name}"/>
				</p>

                <input type="submit" value="ListUser" class="sansLabel" />
                <br />
                
             
            </fieldset>
        </form>
               <form method="post" action="<c:url value="/tweetsid" />">
            <fieldset>
        <legend>List Tweets</legend>
                <p>List TweetsId
               <c:out value="${listTweets[0].message}"/>
				</p>
  				<input type="text" name="tweetid" class="sansLabel" />
                <input type="submit" value="ListTweetId" class="sansLabel" />
                <br />
                
             
            </fieldset>
        </form>
    </body>
</html>