<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<head>
    <title>footer</title>
    <meta charset="utf-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        .footer {
            height: 4em;
            line-height: 4em; /* hauteur de ligne (identique) */
            white-space: nowrap; /* interdiction de passer à la ligne */
            width: 100%;
            background-color: black;
            color: white;
            text-align: center;
        }
        p{
            vertical-align: center;
        }
    </style>
</head>
<body class="d-flex flex-column">
<div class="footer">
    <div class="enfant" > <p>Copyrigth &copy 2019 </p></div>
</div>
</body>