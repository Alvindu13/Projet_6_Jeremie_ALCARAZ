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
<div class ="container">
    <div class="row">
        <section class="col-sm-12">

            <div class="commentaire">
                <div class="form">
                    <h4>Écrivez votre commentaire : </h4>
                    <form class="login-form" name ="f" action="addcmt" method='POST' modelAttribute="commentaire">
                        <div class="form-group">
                            <label for="comment">Description:</label>
                            <textarea class="form-control" rows="5" id="comment" placeholder='' name='content' ></textarea>
                        </div>
                        <div class="form-group">
                            <label for="user">Utilisateur: </label>
                            <input type='text' placeholder='' name='userName' class="form-control" id="user"/>
                        </div>
                        <input type="hidden" id="siteId" name="siteId" value="${site.siteId}"/>
                        <button type="submit" class="btn btn-primary">Ajouter votre commentaire</button>
                    </form>
                </div>
            </div>
        </section>
    </div>
</div>

</body>
</html>
