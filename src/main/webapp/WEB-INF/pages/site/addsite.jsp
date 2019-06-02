<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <meta charset="utf-8">


    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />

    <link href="${bootstrap}" rel="stylesheet" />

    <style type="text/css">
        [class*="col"] { padding-bottom: 20px; }
        h4{
        }
    </style>

</head>
<body>
<jsp:include page="../_menu.jsp" />



<div class = "container-fluid">
    <h1>Vous allez ajouter un site dans la topo suivante : ${topo.name}</h1>
    <div class = "row">
        <div class = "col-lg-5 align-self-center">
                <form class="login-form" name ="f" action="addsite?topoId=${topo.topoId}" method='POST' modelAttribute="site" enctype="multipart/form-data">
                    <h3>Créer Site : </h3>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Le nom de votre Site : </label>
                        <input type='text' placeholder='Nom du Site' name='name' class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="true"/>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">La ville où se trouve votre site : </label>
                        <input type='text' placeholder='Ville où se trouve le Site' name='location' class="form-control" id="exampleInputPassword1" required="true"/>
                    </div>

                    <div class="form-group">
                        <label for="exampleInputPassword1">Nombre de secteurs : </label>
                        <input type='text' placeholder='nb de secteurs' name='nbSector' class="form-control" required="true"/>
                    </div>

                    <div class="form-group">
                        <label for="exampleInputPassword1">Nombre de voies: </label>
                        <input type='text' name='nbWay' class="form-control" required="true"/>
                    </div>

                    <div class="form-group">
                        <label for="exampleInputPassword1">Cotations : </label>
                        <input type='text'name='cotation' class="form-control" required="true"/>
                    </div>

                    <div class="form-group">
                        <label for="exampleInputPassword1">Longueur des voies en mètres : </label>
                        <input type='text' name='waySize' class="form-control"  required="true"/>
                    </div>

                    <div class="form-group">
                        <label for="comment">Description:</label>
                        <textarea class="form-control" rows="5" id="comment" placeholder='Description du site' name='comment' required='true' ></textarea>
                    </div>





                    <!--<h4>Veuillez choisir une image de présentation (dimension de 200x300px) :</h4>
                    <div class="custom-file">
                        <input type="file" class="custom-file-input" id="hFichier" name="image" lang="fr" accept=".jpg,.jpeg,.gif,.png" required="true" />
                        <label class="custom-file-label" for="hFichier">Sélectionner un fichier</label>
                    </div>-->


                    <p>Vous voulez changer de Topo ? : <a href="${pageContext.request.contextPath}/topo">Voir ou créer un Topo</a> <br />

                    <button type="submit" class="btn btn-primary">Submit</button>

                </form>
        </div>
    </div>
</div>


</body>
</html>
