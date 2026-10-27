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
        <link 
            rel="stylesheet" 
            type="text/css" 
            href="${pageContext.request.contextPath}/styles.css"
        />
    </head>
    <body>
        <%@include file="header.jsp" %>
        <form action="LoginServlet" method="POST">
            <fieldset>
                <div class="field-row">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" method="POST" />
                </div>
                
                <div class="field-row">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" method="POST" />
                </div>

                <p style="color:red;">${alertMsg}</p>
                
                <input type ="submit" value="Submit" />
            </fieldset>
            
        </form>
        <%@include file="footer.jsp" %>
    </body>
</html>
