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
                <legend>Pour lister les Utilisateurs</legend>
                <p>
            <c:if test="${! empty requestScope.listUsers  }" var="test" scope="session">
               <c:out value="${listUsers[0].name}"/>
				
              <c:forEach items="${requestScope.listUsers}" var="users">
                  <div class="users">
                    <div class="nameUsers">
                      <c:out value="${users['name']}" />
                    </div> 
                    <div class="twitterNickname">
                      <c:out value="${requestScope.users['twitterNickname']}" />
                    </div>
                    <div class="joinedDate">
                      <c:out value="${requestScope.users['joinedDate']}" />
                    </div>
                  </div>
               </c:forEach>
               </c:if>
               </p>
                <input type="submit" value="Go!" class="sansLabel" />
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