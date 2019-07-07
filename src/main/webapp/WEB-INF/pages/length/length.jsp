<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<head>
    <title>Les longueurs</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />

    <link href="${bootstrap}" rel="stylesheet" />

    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



    <style type="text/css">
        body { background-color: #1c7430  ; }
        img { width: 100%; }
        .well {
            background-color:#CCC;
            padding: 20px;
        }

        section {
            margin: 2em;
        }

        .container{
            background: whitesmoke;
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
            <h1>Voici toutes les longueurs de cette voie</h1>
        </header>

        <div class="row">
            <div class="col-sm-12">
                <div class ="row justify-content-center align-content-center">
                    <section class = "col-sm-8">
                        <form class = "well">
                            <h4>Souhaitez-vous ajouter votre propre Longueur ?</h4>
                            <fieldset>
                                <a href="${pageContext.request.contextPath}/addlength?wayId=${wayId}" class="btn btn-primary js-scroll-trigger">Afficher le formulaire</a>
                            </fieldset>
                        </form>
                    </section>
                </div>

                <table class="table table-bordered table-striped table-condensed">
                    <thead>
                    <tr>
                        <th>Nom du relais</th>
                        <th>Nombre de pts ancrage</th>
                        <th>Longueur</th>
                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${lengths}" var="l">
                        <tr>
                            <td>${l.relayName}</td>
                            <td>${l.size}</td>
                            <td>${l.nbAnchor}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>

                <nav aria-label="Page navigation example">
                    <ul class="pagination justify-content-center">
                        <li class="${currentPageLength == 0 ? 'page-item disabled' : 'page-item'}">
                            <a class="page-link" href="${pageContext.request.contextPath}/length?wayId=${wayId}&page=${currentPageLength-1}" tabindex="-1">Previous</a>
                        </li>
                        <c:set var="k" value="1" />
                        <c:forEach items="${arrayNbPagesLength}" var="pageTopo" varStatus="loop">
                            <li class="${currentPageLength==loop.index ? 'page-item active' : 'page-item'}">
                                <a class="page-link" href="${pageContext.request.contextPath}/length?wayId=${wayId}&page=${loop.index}">${loop.index}</a>
                            </li>
                            <c:set var="k" value="${k+1}" />
                        </c:forEach>
                        <li class="${currentPageLength >= nbPagesLength-1 ? 'page-item disabled' : 'page-item'}">
                            <a class="page-link" href="${pageContext.request.contextPath}/length?wayId=${wayIdc}&page=${currentPageLength+1}">Next</a>
                        </li>
                    </ul>
                </nav>



            </div>
        </div>



    </div>
</div>
</body>
</html>
