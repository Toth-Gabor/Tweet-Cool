<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="cache-control" content="no-cache" />
        <title>Welcome</title>
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <form action="new-tweet" style="max-width:500px;margin:auto" method="post">
          <h2>Create a tweet</h2>
          <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="Name" name="name">
          </div>

          <div class="input-container">
            <i class="fa fa-envelope icon"></i>
            <input class="input-field" type="text" placeholder="Tweet" name="comment">
          </div>

          <button type="submit" class="btn">Send</button>
      </form>
      <div class="link" style="max-width:500px;margin:auto">
          <a href="tweets"><button type="submit" class="btn">See Tweets</button></a>
      </div>
    </body>
</html>
