<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Sites D'escalade</title>

        <meta charset="utf-8">
        <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />

        <link href="${bootstrap}" rel="stylesheet" />


        <style type="text/css">
            body { background-color: #1c7430  ; }
            [class*="col"] { margin-bottom: 20px; }
            img { width: 100%; }
            .well {
                background-color:#CCC;
                padding: 20px;
            }

            #ok{
                background: #b8daff;
                padding-top: 20px;
                padding-bottom: 15px;
            }

            #try{
                display: block;
                margin: auto;
            }

            .btn-primary, .btn-primary:hover, .btn-primary:active, .btn-primary:visited {
                background-color: #8064A2 !important;
            }


            div {
                margin: 2em;
            }
            .container{
                background: whitesmoke;
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
            <h2> Voici tous les sites correspondant au topo sélectionné</h2>
            <h3 style = color:red >Pour plus d'informations sur un site, veuillez cliquer sur son nom</h3>
            <div id = "ok" class = "row">
                <div id = "try" class="col-ls-8">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/addsite?topoId=${site.topoId}" role="button">Ajouter votre Site</a>
                </div>
            </div>

            <div class="row">
                <section class="col-sm-12">
                    <table class="table table-bordered table-striped table-condensed">
                        <thead>
                        <tr>
                            <th>Nom</th>
                            <th>Localisation</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:set var="i" value="1" />
                        <c:forEach items="${sites}" var="s">
                            <tr>
                                <td><a class="nav-link" href="${pageContext.request.contextPath}/site?siteId=${s.siteId}&user=${pageContext.request.userPrincipal.name}">${s.name}</td>
                                <td>${s.location}</td>
                            </tr>
                            <c:set var="i" value="${i+1}" />
                        </c:forEach>
                        </tbody>
                    </table>

                    <nav aria-label="Page navigation example">
                        <ul class="pagination justify-content-center">
                            <li class="${currentPageSite == 0 ? 'page-item disabled' : 'page-item'}">
                                <a class="page-link" href="${pageContext.request.contextPath}/sites?topoId=${topoId}&page=${currentPageSite-1}" tabindex="-1">Previous</a>
                            </li>
                            <c:set var="k" value="1" />
                            <c:forEach items="${arrayNbPagesSite}" var="pageTopo" varStatus="loop">
                                <li class="${currentPageSite==loop.index ? 'page-item active' : 'page-item'}">
                                    <a class="page-link" href="${pageContext.request.contextPath}/sites?topoId=${topoId}&page=${loop.index}">${loop.index}</a>
                                </li>
                                <c:set var="k" value="${k+1}" />
                            </c:forEach>
                            <li class="${currentPageSite >= nbPagesSite-1 ? 'page-item disabled' : 'page-item'}">
                                <a class="page-link" href="${pageContext.request.contextPath}/sites?topoId=${topoId}&page=${currentPageSite+1}">Next</a>
                            </li>
                        </ul>
                    </nav>
                </section>
            </div>
        </div>
    </div>





    </body>
</html>
