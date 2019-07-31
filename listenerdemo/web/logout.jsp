<%-- 
    Document   : logout
    Created on : Apr 25, 2019, 2:30:32 PM
    Author     : Renata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
            request.getSession().invalidate();
        %>
    </body>
</html>
