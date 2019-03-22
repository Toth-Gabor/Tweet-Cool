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
                    <option value="2">2</option>
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
                    <button class="send-button" type="submit" class="btn">Send</button>
                </select>
            </form>
        </div>
        <div class="tweets">
            <h2>Tweets</h2>
            <table border="1">
                <tr>
                    <th>Id</th>
                    <th>Poster</th>
                    <th>Tweet</th>
                    <th>Date</th>
                </tr>
                    <c:forEach var="t" items="${tweets}">
                        <tr>
                        <td>${t.getId()}"</td>
                        <td>${t.getName()}</td>
                        <td>${t.getComment()}"</td>
                        <td>${t.getDate().toString()}</td>
                        </tr>
                    </c:forEach>
            </table>
        </div>
    </body>
</html>
