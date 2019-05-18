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
            <p>Vous êtes sur la fiche d'information du Site d'escalade : <strong> ${site.name} </strong> </p>
            <p> Ce site se situe au lieu suivant : <strong> ${site.location} </strong> </p>
            <p>Descriptif du site :<strong> ${site.comment} </strong> </p>
            <p>Le site dispose de <strong> ${site.nbSector} </strong> secteurs comprenant <strong>
                ${site.nbWay} </strong> sur une longueur de <strong> ${site.waySize} </strong> mètres </p>
            <p>La difficulté des voies est comprise entre les cotations suivantes : <strong> ${site.cotation} </strong> </p>
        </section>
    </div>

    <div class="row">
        <section class="col-sm-12">

            Commentaires

        </section>
    </div>


</div>

</body>
</html>
