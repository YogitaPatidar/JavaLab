<%-- 
    Document   : FibbonaciJSP
    Created on : 04-Apr-2021, 21:48:46
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
        <form   action="FibbonaciServlet" method="post">
            <input type="text" name="num" placeholder="Enter a number"/><br><br>
            <input type="submit" name="btn" value="Fibbonaci_Series"/><br><br>
        </form>
        <p><%
        if(request.getParameter("q")!=null){
                out.print(request.getParameter("q"));
        }
        %></p>
    </body>
</html>
