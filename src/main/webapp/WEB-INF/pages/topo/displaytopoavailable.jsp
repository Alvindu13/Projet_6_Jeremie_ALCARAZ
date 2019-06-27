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

        [class*="col"] { margin: 10px; }

        img { width: 100%; }


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

        #t3{
            border: 1Px dotted darkred;
            padding: 10px;
            margin: 10px;
            align-content: center;
            text-align: center;
        }
    </style>

</head>

<body>

<jsp:include page="../_menu.jsp" />

<div class="container">
    <div id="tt">
        <img class="img-responsive" src="resources/img/topo/aside.jpg" alt="AsideEscalade">
    </div>

    <div class="row">


        <div id = "t1" class = "col-12 col-lg-3"> Nom du Topo </div>
        <div id = "t1" class = "col-12 col-lg-3"> Nom du propriétaire </div>

        <c:set var = "userName" scope ="session" value = "${pageContext.request.userPrincipal.name}"/>

        <span class="w-100"></span>

        <c:forEach items="${topos}" var="t">
            <div id = "t2" class = "col-12 col-lg-3">${t.name}</div>
            <div id = "t2" class = "col-12 col-lg-3">${t.utilisateur.userName}</div>
            <div id = "t3" class = "col-12 col-lg-3" >


                <form class="login-form" name ="f" action="${pageContext.request.contextPath}/reservetopo?userId=${currentUser.utilisateurId}&topoId=${t.topoId}" method='POST'>
                    <c:if test="${t.utilisateur.userName != pageContext.request.userPrincipal.name}">
                        <button  name = "submit" type="submit" class="btn btn-warning">RESERVER</button>
                    </c:if>
                    <c:if test="${t.utilisateur.userName eq pageContext.request.userPrincipal.name}">
                        <button type="button" class="btn btn-secondary btn-lg" disabled>INDISPONIBLE</button>
                    </c:if>
                </form>
            </div>
        </c:forEach>



    </div>
</div>



</body>
</html>
