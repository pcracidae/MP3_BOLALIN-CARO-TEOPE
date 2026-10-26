<%-- 
    Document   : error
    Created on : Oct 14, 2026, 12:14:10 PM
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>${errorMsg}</h1>
        <%@include file="footer.jsp" %>
    </body>
</html>
