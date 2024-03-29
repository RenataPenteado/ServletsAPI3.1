<%-- 
    Document   : index
    Created on : May 8, 2019, 5:42:11 PM
    Author     : Renata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:query var="rs" dataSource="jdbc/TestDB">
    select id, foo, bar from testdata
</sql:query>

<html>
    <head>
        <title>DB Test</title>
    </head>
    <body>

        <h2>Results</h2>

        <c:forEach var="row" items="${rs.rows}">
            Foo ${row.foo}<br/>
            Bar ${row.bar}<br/>
        </c:forEach>

    </body>
</html>
