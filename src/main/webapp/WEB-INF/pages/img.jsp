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

<jsp:include page="_menu.jsp" />

<div class = "row">
    <c:set var="i" value="1" />
    <c:forEach items="${images}" var="img">
        <div class="col-xs-4">
            <div class="col-xs-12 col-sm-12 col-md-12"><img src="data:image/jpeg;base64,${img.imgDataS}" alt="..." width="200" height="200">`
            </div>
        <c:set var="i" value="${i+1}" />
    </c:forEach>
    </section>
</div>




</div>




<!--<tbody>

</tbody>-->

</body>
</html>
