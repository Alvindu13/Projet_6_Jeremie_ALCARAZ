<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sites D'escalade</title>

    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />
    <link href="${bootstrap}" rel="stylesheet" />

</head>

<body>

<ul>
    <h1>${cmt.content} </h1>
    <small class="float-right">${pageContext.request.userPrincipal.name}</small><br>
</ul>

</body>
</html>
