<%-- 
    Document   : Welcome
    Created on : Sep 2, 2015, 4:24:16 PM
    Author     : user test
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
    </head>
    <body>
        <form id="form1" name="form1" method="POST" action="WelcomeController">
            Name: <input type="text" name="name">
            <input type="submit" value="Greet">
        </form>
        <p>${welcomeMsg}</p>
    </body>
</html>
