<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p> test
<c:set var="i" value="1" />
<c:forEach items="${list}" var="u">
    <tr>
        <td>${i}</td>
        <td>${u.name}</td>
        <td>${u.nbSector}</td>
        <td>${u.nbSector}</td>
        <td>${u.nbSite}</td>
    </tr>
    <c:set var="i" value="${i+1}" />
</c:forEach>

</p>

</body>
</html>
