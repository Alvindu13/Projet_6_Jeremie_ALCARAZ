<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE HTML>
<html>

<head>
    <title>Mes topos</title>

    <meta charset="utf-8">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">



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


<section>
    <div>
        <img class="img-responsive" src="resources/img/topo/aside.jpg" alt="AsideEscalade">
    </div>
</section>

<div class="container rounded border border-dark">
    <div class="text-center">
        <header class="page-header">
            <h1>Bonjour ${pageContext.request.userPrincipal.name}, vous trouverez sur cette page l'ensemble de vos topos</h1>
        </header>

        <div class = "row">
            <div class = col-lg-10>

                <h2> Mes Topos publiés : </h2>
                <div class="panel-body">
                    <table class="table table-bordered table-striped table-condensed">
                        <thead class="thead-dark">
                        <tr>
                            <th> Nom du topo</th>
                            <th> Propriétaire </th>
                            <th> Action </th>
                            <th> Upload votre TOPO PDF </th>
                        </tr>
                        </thead>

                        <tbody class="">
                        <c:forEach items="${topos}" var="t" varStatus="status">
                            <tr>
                                <td>${t.name}</td>
                                <td>${pageContext.request.userPrincipal.name}</td>

                                <c:if test="${t.reserve eq false}">
                                    <form class="login-form" name ="f" action="mytopo?user=${pageContext.request.userPrincipal.name}&action=${action}" method="POST" modelAttribue="topo" >
                                        <c:if test="${!t.available}">
                                            <input type="hidden" name="topoId" value="${t.topoId}"/>
                                            <input type="hidden" name="action" value="partager"/>
                                            <td><button  name = "submit" type="submit" class="btn btn-success">PARTAGER</button></td>

                                        </c:if>

                                        <c:if test="${t.available eq true}">
                                            <td><button type="button" class="btn btn-secondary btn-lg" disabled>PARTAGER</button></td>
                                        </c:if>
                                    </form>
                                    <form class="login-form" name ="f" method="post" action="doUpload?user=${pageContext.request.userPrincipal.name}" enctype="multipart/form-data" modelAttribue="files">
                                        <td><input type="file" name="fileUpload" size="50" /></td>
                                        <td><input type="hidden" name="utilisateurId" value="${t.utilisateur.utilisateurId}" /></td>
                                        <td><input type="hidden" name="topoId" value="${t.topoId}" /></td>

                                        <td colspan="2" align="center"><input type="submit" value="Upload" /></td>
                                    </form>
                                </c:if>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>



                    <nav aria-label="Page navigation example">
                        <ul class="pagination justify-content-center">
                            <li class="${currentPageTopo == 0 ? 'page-item disabled' : 'page-item'}">
                                <a class="page-link" href="${pageContext.request.contextPath}/mytopo?user=${pageContext.request.userPrincipal.name}&pageTopo=${currentPageTopo-1}" tabindex="-1">Previous</a>
                            </li>
                            <c:set var="k" value="1" />
                            <c:forEach items="${arrayNbPagesTopo}" var="pageTopo" varStatus="loop">
                                <li class="${currentPageTopo==loop.index ? 'page-item active' : 'page-item'}">
                                    <a class="page-link" href="${pageContext.request.contextPath}/mytopo?user=${pageContext.request.userPrincipal.name}&pageTopo=${loop.index}">${loop.index}</a>
                                </li>
                                <c:set var="k" value="${k+1}" />
                            </c:forEach>


                            <li class="${currentPageTopo >= nbPagesTopo-1 ? 'page-item disabled' : 'page-item'}">
                                <a class="page-link" href="${pageContext.request.contextPath}/mytopo?user=${pageContext.request.userPrincipal.name}&pageTopo=${currentPageTopo+1}">Next</a>
                            </li>
                        </ul>
                    </nav>

                </div>
            </div>
        </div>


        <div class = "row">
            <div class = col-lg-10>
                <h2> Mes Topos empruntés : </h2>
                <div class="panel-body">
                    <table class="table table-bordered table-striped table-condensed">
                        <thead class="thead-dark">
                        <tr>
                            <th> Nom du topo</th>
                            <th> Propriétaire actuel </th>
                            <th> Action </th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${tShare}" var="share" varStatus="status">
                            <tr>
                                <td>${share.name}</td>
                                <td>${pageContext.request.userPrincipal.name}</td>
                                <form class="login-form" name ="f" action="mytopo?user=${pageContext.request.userPrincipal.name}&action=${action}" method="POST" >
                                    <input type="hidden" name="action" value="liberer"/>
                                    <input type="hidden" name="topoId" value="${share.topoId}"/>
                                    <td><button  name = "submit" type="submit" class="btn btn-danger">LIBERER</button></td>
                                </form>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                    <div>


                        <nav aria-label="Page navigation example">
                            <ul class="pagination justify-content-center">
                                <li class="${currentPageTopoShare == 0 ? 'page-item disabled' : 'page-item'}">
                                    <a class="page-link" href="${pageContext.request.contextPath}/mytopo?user=${pageContext.request.userPrincipal.name}&pageTopoShare=${currentPageTopoShare-1}" tabindex="-1">Previous</a>
                                </li>
                                <c:set var="k" value="1" />
                                <c:forEach items="${arrayNbPagesTopoShare}" var="pageTopoShare" varStatus="loop">
                                    <li class="${currentPageTopoShare==loop.index ? 'page-item active' : 'page-item'}">
                                        <a class="page-link" href="${pageContext.request.contextPath}/mytopo?user=${pageContext.request.userPrincipal.name}&pageTopoShare=${loop.index}">${loop.index}</a>
                                    </li>
                                    <c:set var="k" value="${k+1}" />
                                </c:forEach>


                                <li class="${currentPageTopoShare >= nbPagesTopoShare-1 ? 'page-item disabled' : 'page-item'}">
                                    <a class="page-link" href="${pageContext.request.contextPath}/mytopo?user=${pageContext.request.userPrincipal.name}&pageTopoShare=${currentPageTopoShare+1}">Next</a>
                                </li>
                            </ul>
                        </nav>

                    </div>

                </div>
            </div>
        </div>
    </div>
    </div>

</body>
</html>























