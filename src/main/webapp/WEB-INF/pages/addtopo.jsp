<%--
  Created by IntelliJ IDEA.
  User: jeremie
  Date: 2019-05-02
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form name='f' action="addtopo" method='POST' modelAttribute="topo">
    <table>


        <tr>
            <td>Propriétaire:</td>
            <td><input type='text' name='userName' value=''></td>
        </tr>
        <tr>
            <td>Nom du TOPO:</td>
            <td><input type='text' name='name' value=''></td>
        </tr>

        <tr>
            <td>Nombre de Site(s):</td>
            <td><input type='text' name='nbSite' value=''></td>
        </tr>

        <tr>
            <td>Nombre de Secteur(s):</td>
            <td><input type='text' name='nbSecteur' value=''></td>
        </tr>

        <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
</form>

</body>
</html>
