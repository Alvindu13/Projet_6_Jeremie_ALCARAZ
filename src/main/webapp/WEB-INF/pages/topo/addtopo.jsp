<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <meta charset="utf-8">
    <spring:url value="resources/css/addTopo.css" var="topoStyle" />

    <link href="${topoStyle}" rel="stylesheet" />

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>




    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

</head>
<body>
<jsp:include page="../_menu.jsp" />

    <div class="login-page">
        <div class="form">
            <h4>Veuillez créer votre TOPO : </h4>
            <form class="login-form" name ="f" action="addtopo" method='POST' modelAttribute="topo" />

                <input type="text" readonly class="form-control-plaintext" id="staticUser" value="${pageContext.request.userPrincipal.name}"/>
                <input type='text' placeholder='Nom du Topo' name='name'/>
                <input type='hidden' name = 'available' value = "${false}">
                <input type='hidden' name = 'reserve' value = "${false}">
                <input type='hidden' name = 'utilisateur.utilisateurId' value = "${currentUser.utilisateurId}">

            <button  name = "submit" type="submit" class="btn btn-danger">CREER TOPO</button>

            </form>
        </div>
    </div>


<!--<div class="container">
        <div class="row">

            <div class="col-md-8">
                <form name='f' action="addtopo" method='POST' modelAttribute="topo">
                    <div id="contact-form" class="form-container" dataOLD-form-container style="color: rgb(46, 125, 50); background: rgb(200, 230, 201);">
                        <div class="row">
                            <div class="form-title">
                                <span> Create Topo </span>
                            </div>
                        </div>
                        <div class="input-container">
                            <div class="row">
                                <span class="req-input valid" >
                                    <span class="input-status" dataOLD-toggle="tooltip" dataOLD-placement="top" title="Input your post title."> </span>
                                    <input type="text" dataOLD-min-length="8" placeholder="Post Title" value="testing post">
                                </span>
                            </div>

                            <div class="row">
                                <span class="req-input message-box valid">
                                    <span class="input-status" dataOLD-toggle="tooltip" dataOLD-placement="top" title="Post Contents."> </span>
                                    <textarea type="textarea" dataOLD-min-length="10" placeholder="Post Contents">Valid contents </textarea>
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
