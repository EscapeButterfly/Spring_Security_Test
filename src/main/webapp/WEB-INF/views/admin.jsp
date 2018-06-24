<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Simple jsp page for testing spring">
    <meta name="author" content="Vitalii Gorovoii">

    <title>Admin</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
</head>

<body>

    <div class="container">
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <form id="logoutForm" method="post" action="${contextPath}/logout">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
            <h2>Admin Page ${pageContext.request.userPrincipal.name}
                | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </h2>
        </c:if>
    </div>

    <table class="users-table">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Role</th>
        </tr>

        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.roles}</td>
                <%-- <td><a href="visitors/delete?lname=${guest.lname}"><img src="minus.png"/></a></td> --%>
            </tr>
        </c:forEach>
    </table>

    <%-- <form action = "/visitors" method="post">
        <p><b>City:</b><br>
            <select name="city">
                <c:forEach items="${cities}" var="city">
                    <option value="${city}">
                            ${city}
                    </option>
                </c:forEach>
            </select>
        </p>
        <button name="filter" type="submit">SUBMIT</button>
    </form>
    --%>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>