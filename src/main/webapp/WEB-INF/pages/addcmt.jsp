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

<form name='f' action="addcmt" method='POST' modelAttribute="commentaire">
    <table>


        <tr>
            <td>User:</td>
            <td><input type='text' name='userName' value=''></td>
        </tr>
        <tr>
            <td>Content:</td>
            <td><input type='text' name='content' value=''></td>
        </tr>

        <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
</form>

</body>
</html>
