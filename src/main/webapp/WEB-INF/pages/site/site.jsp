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
<jsp:include page="../_menu.jsp" />

<div id = "ok" class = "row">
    <div id = "try" class="col-ls-8">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/addsite?topoId=${topo.topoId}" role="button">Ajouter votre Site</a>
    </div>
</div>

<div class ="container">
    <div class="row">
        <section class="col-sm-12">


                    <tr>
                        <td>Nom du site : ${site.name}</td>
                    </tr>


        </section>
    </div>
</div>

</body>
</html>
