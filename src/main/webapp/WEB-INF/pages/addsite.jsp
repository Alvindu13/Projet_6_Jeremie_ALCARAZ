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

    </style>

</head>
<body>
<jsp:include page="_menu.jsp" />



<div class = "container-fluid">
    <div class = "row">
        <div class = "col-lg-5 align-self-center">
                <form class="login-form" name ="f" action="addsite" method='POST' modelAttribute="site">
                    <h3>Créer Site : </h3>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Le nom de votre Site : </label>
                        <input type='text' placeholder='Nom du Site' name='name' class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">La ville où se trouve votre site : </label>
                        <input type='text' placeholder='Ville où se trouve le Site' name='location' class="form-control" id="exampleInputPassword1">
                    </div>

                    <div class="form-group">
                        <label for="comment">Description:</label>
                        <textarea class="form-control" rows="5" id="comment" placeholder='Description du site' name='comment' ></textarea>
                    </div>

                    <div class="custom-file">
                        <input type="file" class="custom-file-input" id="hFichier" name="hFichier" lang="fr" accept=".jpg,.jpeg,.gif,.png" />
                        <label class="custom-file-label" for="hFichier">Sélectionner un fichier</label>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
        </div>
    </div>
</div>





       <!-- <form class="login-form" name ="f" action="addsite" method='POST' modelAttribute="site">
            <input type='text' placeholder='Nom du Site' name='name'/>
            <input type='text' placeholder='Ville où se trouve le Site' name='location'/>
            <input type='text' placeholder='Description du site' name='comment'  value=''/>

            <input type='text' placeholder='Pseudo de l'utilisateur (mais rencupérer en param c'mieux) -> grâce à une serssion ?' name='comment'  value=''/>
            <input type='text' placeholder='Téléchargement d'une image' name='comment'  value=''/>




            <button>Créer Topo</button>
        </form>-->



<!--<div class="container">
        <div class="row">

            <div class="col-md-8">
                <form name='f' action="addtopo" method='POST' modelAttribute="topo">
                    <div id="contact-form" class="form-container" data-form-container style="color: rgb(46, 125, 50); background: rgb(200, 230, 201);">
                        <div class="row">
                            <div class="form-title">
                                <span> Create Topo </span>
                            </div>
                        </div>
                        <div class="input-container">
                            <div class="row">
                                <span class="req-input valid" >
                                    <span class="input-status" data-toggle="tooltip" data-placement="top" title="Input your post title."> </span>
                                    <input type="text" data-min-length="8" placeholder="Post Title" value="testing post">
                                </span>
                            </div>

                            <div class="row">
                                <span class="req-input message-box valid">
                                    <span class="input-status" data-toggle="tooltip" data-placement="top" title="Post Contents."> </span>
                                    <textarea type="textarea" data-min-length="10" placeholder="Post Contents">Valid contents </textarea>
                                </span>
                            </div>
                            <div class="row submit-row">
                                <button type="button" class="btn btn-block submit-form valid">Submit</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>-->


</body>
</html>
