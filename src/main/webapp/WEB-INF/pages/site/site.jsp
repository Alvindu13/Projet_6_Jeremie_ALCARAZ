<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sites D'escalade</title>

    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">


</head>

<body>
<jsp:include page="../_menu.jsp" />

<div class ="container">
    <div class="row">
        <section class="col-sm-12">
            <p>Vous êtes sur la fiche d'information du Site d'escalade : <strong> ${site.name} </strong> </p>
            <p> Ce site se situe au location suivant : <strong> ${site.location} </strong> </p>
            <p>Descriptif du site :<strong> ${site.comment} </strong> </p>
            <p>Le site dispose de :
                <a class="nav-link" href="${pageContext.request.contextPath}/secteur?siteId=${site.siteId}">
                    <strong> ${countSect} </strong> secteurs
                </a>
        </section>
    </div>





    <div class="row">
        <jsp:include page="../cmt/addcmtT.jsp" />
    </div>


    <div class="panel-body">
        <table class="table table-bordered table-striped table-condensed">
            <thead>
            <tr>
                <th>Commentaires</th>
                <th>Auteur</th>
            </tr>
            </thead>
            <tbody>
            <c:set var="i" value="1" />
            <c:forEach items="${cmtest}" var="c">
                <tr>
                    <td>${c.content}</td>
                    <td>${pageContext.request.userPrincipal.name}</td>
                </tr>
                <c:set var="i" value="${i+1}" />
            </c:forEach>
            </tbody>
        </table>
    </div>


    <div>
            <section>
                    <ul class="pagination">
                        <li class="page-item"><a class="page-link" href="#">Previous</a></li>

                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>

                        <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/site?siteId=${site.siteId}&user=${pageContext.request.userPrincipal.name}&page=${currentPage+1}">Next</a></li>

                    </ul>
            </section>

        </div>


    </div>

</div>

</body>
</html>
