<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="cache-control" content="no-cache" />
        <link rel="stylesheet" href="style.css">
        <title>Twee Board</title>
    </head>
    <body>
        <div class="settings">
            <form class="input" action="tweets" method="post">
                <select class="number" name="limit">
                    <option value="10">10</option>
                    <option value="15">15</option>
                    <option value="20">20</option>
                    <option value="25">25</option>
                </select>
                <select class="skip" name="skip">
                    <option value="0">0</option>
                    <option value="2">2</option>
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <input class="date" type="datetime-local" placeholder="Date" name="date" value="date">
                    <input class="date" type="text" placeholder="Name" name="name" value="name">
                </select>

            </form>

        </div>
        <div class="tweets">
            <c:forEach var="t" items="${tweets}">
                <p>Name: <c:out value="${t.getName()}"/> Tweet: <c:out value="${t.getComment()}"/></p>
                <p><c:out value="${t.getDate().toString()}"/></p>
            </c:forEach>
        </div>

    </body>
</html>
