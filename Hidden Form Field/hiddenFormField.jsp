<%-- 
    Document   : hiddenFormField
    Created on : 07-May-2021, 11:25:17
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Login</h3>
        <form action="hiddenFormFieldSer1" method="post" >
            <input type="text" name="name" placeholder="Enter name" style="width: 50%"/><br><br>
        <input type="mail" name="mail" placeholder="Enter email id" style="width: 50%"/><br>
        <br><input type="submit" value="Login"/>
        </form>
    </body>
</html>
