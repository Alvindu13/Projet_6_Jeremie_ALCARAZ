<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<head>
    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />
    <link href="${bootstrap}" rel="stylesheet" />
    <style type="text/css">
        body { background-color:#DDD; }
        [class*="col"] { margin-bottom: 20px; }
        img { width: 100%; }
        .well {
            background-color:#CCC;
            padding: 20px;
        }
        #test{}
    </style>
</head>

<body>
<jsp:include page="_menu.jsp" />
<div class="container">
    <header class="page-header">
        <h1>Les topos du coin</h1>
    </header>
    <section class="row">
        <div class="col-xs-12">
            <p>
                Je suis passionné par <strong>l'escalade</strong> depuis très longtemps. Ce site a été construit <em>  pour les grimpeurs...</em><br>
                Vous trouverez sur ce site des topos d'escalade pouvant être réservés par les membres enregistrés.<br>
                Vous avez également un espace d'échange sur notre forum.<br>
                Vous pouvez commenter les topos afin que chacun puisse améliorer ses topos et les rendre les plus qualitatifs possibles.
            </p>
        </div>
    </section>
    <section id = "test" class="row">
        <div class="col-xs-12 col-sm-12 col-md-12"><img src="resources/img/topo/aside.jpg" alt="AsideEscalade"></div>
    </section>
    <div class="row">
        <section class="col-sm-4">
            <h5>Voici les sous-espèces des tigres :</h5>
            <br>
            <ul>
                <li>Tigre de Sibérie</li>
                <li>Tigre de Chine méridionale</li>
                <li>Tigre de Bali</li>
                <li>Tigre de d'Indochine</li>
                <li>Tigre de Malaisie</li>
                <li>Tigre de Java</li>
                <li>Tigre de Sumatra</li>
                <li>Tigre du Bengale</li>
                <li>Tigre de la Caspienne</li>
            </ul>
        </section>
    </div>
    <div class="row">
        <section class="col-sm-12">
            <table class="table table-bordered table-striped table-condensed">
                <caption>
                    <h4>Les menaces pour les tigres</h4>
                </caption>
                <thead>
                <tr>
                    <th>Lieu</th>
                    <th>Menace</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Grand Mekong</td>
                    <td>Demande croissante de certaines parties de l’animal pour la médecine chinoise traditionnelle et fragmentation des habitats du fait du développement non durable d’infrastructures</td>
                </tr>
                <tr>
                    <td>Île de Sumatra</td>
                    <td>Production d’huile de palme et de pâtes à papiers</td>
                </tr>
                <tr>
                    <td>Indonésie et Malaisie</td>
                    <td>Pâte à papier, l’huile de palme et le caoutchouc</td>
                </tr>
                <tr>
                    <td>États-Unis</td>
                    <td>Les tigres captifs représentent un danger pour les tigres sauvages</td>
                </tr>
                <tr>
                    <td>Europe</td>
                    <td>Gros appétit pour l’huile de palme</td>
                </tr>
                <tr>
                    <td>Népal</td>
                    <td>Commerce illégal de produits dérivés de tigres</td>
                </tr>
                </tbody>
            </table>
        </section>
    </div>
    <div class="row">
        <section class="col-sm-8">
            <form class="well">
                <legend>Si vous voulez me laisser un message</legend>
                <h4>Comment m'avez-vous trouvé ?</h4>
                <fieldset>
                    <div class="radio">
                        <label for="ami" class="radio">
                            <input type="radio" name="origine" value="ami" id="ami">
                            Par un ami
                        </label>
                    </div>
                    <div class="radio">
                        <label for="web" class="radio">
                            <input type="radio" name="origine" value="web" id="web">
                            Sur le web
                        </label>
                    </div>
                    <div class="radio">
                        <label for="hasard" class="radio">
                            <input type="radio" name="origine" value="hasard" id="hasard">
                            Par hasard
                        </label>
                    </div>
                    <div class="radio">
                        <label for="autre" class="radio">
                            <input type="radio" name="origine" value="autre" id="autre">
                            Autre...
                        </label>
                    </div>
                    <label for="textarea">Votre message :</label>
                    <textarea id="textarea" class="form-control" rows="4"></textarea>
                    <p class="help-block">Vous pouvez agrandir la fenêtre</p>
                    <button class="btn btn-primary" type="submit">Envoyer</button>
                </fieldset>
            </form>
        </section>
        <section class="col-sm-4">
            <address>
                <p>Vous pouvez me contacter à cette adresse :</p>
                <strong>Tigrou Alfred</strong><br>
                Allée des fauves<br>
                28645 Félins-sur-Loire<br>
            </address>
        </section>
    </div>
</div>
</body>
</html>
