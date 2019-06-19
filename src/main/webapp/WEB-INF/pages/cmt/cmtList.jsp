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

<c:set var="i" value="1" />
<c:forEach items="${cmtTest}" var="cmt">
    <tr>
        <td>${cmt.content}</td>
        <td>${cmt.userName}</td>
    </tr>
    <c:set var="i" value="${i+1}" />
</c:forEach>

</body>
</html>
