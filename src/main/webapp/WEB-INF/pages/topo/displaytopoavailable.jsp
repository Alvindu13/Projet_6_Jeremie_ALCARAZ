<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML>
<html>

<head>
    <title>Nos Topos</title>

    <meta charset="utf-8">


    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" />


    <style type="text/css">
        div{
            border: 1Px dotted gray;
            padding: 10px 10px 10px 100px;
            margin: 10px;
        }

        #t1{
            border: 1Px dotted gray;
            padding: 10px;
            margin: 10px;
            background: pink;
            align-content: center;
            text-align: center;
        }

        #t2{
            border: 1Px dotted gray;
            padding: 10px;
            margin: 10px;
            background: lightblue;
            align-content: center;
            text-align: center;
        }

        #d{
            ;
        }
    </style>

</head>

<body>
<jsp:include page="../_menu.jsp" />


<div class="row">
    <div class="col"><img class="img-responsive center-block" src="resources/img/topo/aside.jpg" alt="AsideEscalade"></div>
</div>
<header class="page-header text-center">
        <h1>Voici les résultats de votre recherche</h1>
</header>


<div class="row">

    <div id = "t1" class = "col-12 col-lg-3"> Nom du Topo </div>
    <div id = "t1" class = "col-12 col-lg-3"> Nom du propriétaire </div>

    <span class="w-100"></span>

    <c:forEach items="${topos}" var="t">
        <div id = "t2" class = "col-12 col-lg-3">${t.name}</div>
        <div id = "t2" class = "col-12 col-lg-3">${t.utilisateur.userName}</div>
        <div id = "t2" class = "col-12 col-lg-3" ><a href="${pageContext.request.contextPath}/reserveTopo?user=${pageContext.request.userPrincipal.name}&topoId=${t.topoId}">Réserver</a></div>
    </c:forEach>
</div>


</body>
</html>
