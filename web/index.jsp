<%-- 
    Document   : index
    Created on : Oct 14, 2026, 12:09:00 PM
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <form>
            <input type="text" method="POST"/>
            <input type="password" method="POST" />
        </form>
        <%@include file="footer.jsp" %>
    </body>
</html>
