<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML>
<html>

<head>
    <title>Réservation</title>

    <meta charset="utf-8">


    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" />


    <style type="text/css">

        [class*="col"] { margin: 10px; }

        img { width: 100%; }

        .container{
            background: whitesmoke;
        }

        div {
            margin: 2em;
        }
    </style>

</head>

<body>

<jsp:include page="../_menu.jsp" />
<div>
    <img class="img-responsive" src="resources/img/topo/aside.jpg" alt="AsideEscalade">
</div>

<div class="container rounded border border-dark">
    <div class="text-center">
        <header class="page-header">
            <h1>Bonjour ${pageContext.request.userPrincipal.name}, vous trouverez sur cette page l'ensemble de vos topos</h1>
        </header>

        <div class = "row">
            <div class = col-lg-10>

                <h2> Mes Topos publiés : </h2>
                <div class="panel-body">
                    <table class="table table-bordered table-striped table-condensed align-content-center">
                        <thead class="thead-dark">
                        <tr>
                            <th> Nom du topo</th>
                            <th> Propriétaire </th>
                            <th> Action </th>

                        </tr>
                        </thead>

                        <tbody>
                        <c:set var = "userName" scope ="session" value = "${pageContext.request.userPrincipal.name}"/>
                        <c:forEach items="${topos}" var="t" varStatus="status">
                            <tr>
                                <td>${t.name}</td>
                                <td>${t.utilisateur.userName}</td>

                                <td>
                                    <form class="login-form" name ="f" action="${pageContext.request.contextPath}/reservetopo?userId=${currentUser.utilisateurId}&topoId=${t.topoId}" method='POST'>
                                        <c:if test="${t.utilisateur.userName != pageContext.request.userPrincipal.name}">
                                            <button  name = "submit" type="submit" class="btn btn-warning">RESERVER</button>
                                        </c:if>
                                        <c:if test="${t.utilisateur.userName eq pageContext.request.userPrincipal.name}">
                                            <button type="button" class="btn btn-secondary btn-lg" disabled>INDISPONIBLE</button>
                                        </c:if>
                                    </form>
                                </td>

                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>



                    <nav aria-label="Page navigation example">
                        <ul class="pagination justify-content-center">
                            <li class="${currentPageTopo == 0 ? 'page-item disabled' : 'page-item'}">
                                <a class="page-link" href="${pageContext.request.contextPath}/displaytopoavailable?user=${pageContext.request.userPrincipal.name}&page=${currentPageTopo-1}" tabindex="-1">Previous</a>
                            </li>
                            <c:set var="k" value="1" />
                            <c:forEach items="${arrayNbPagesTopo}" var="pageTopo" varStatus="loop">
                                <li class="${currentPageTopo==loop.index ? 'page-item active' : 'page-item'}">
                                    <a class="page-link" href="${pageContext.request.contextPath}/displaytopoavailable?user=${pageContext.request.userPrincipal.name}&page=${loop.index}">${loop.index}</a>
                                </li>
                                <c:set var="k" value="${k+1}" />
                            </c:forEach>


                            <li class="${currentPageTopo >= nbPagesTopo-1 ? 'page-item disabled' : 'page-item'}">
                                <a class="page-link" href="${pageContext.request.contextPath}/displaytopoavailable?user=${pageContext.request.userPrincipal.name}&page=${currentPageTopo+1}">Next</a>
                            </li>
                        </ul>
                    </nav>

                </div>
            </div>
        </div>
    </div>
</div>



</body>
</html>
