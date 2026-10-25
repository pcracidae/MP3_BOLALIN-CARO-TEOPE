<%-- 
    Document   : success
    Created on : Oct 14, 2026, 12:14:23 PM
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <form action="CharacterCountingServlet" method="post">
            <label for="string">Enter String</label>
            <input type="text" name="string" id="string" required/>
            <button type="submit">Enter</button>
        </form>
        <p>String Length: ${len}</p>
        <p>Number of Digits: ${dcnt}</p>
        <p>Number of Vowels: ${vcnt}</p>
        <p>Number of Consonants: ${ccnt}</p>
        <p>Number of Symbols:  ${scnt}</p>
        <%@include file="footer.jsp" %>
    </body>
</html>
