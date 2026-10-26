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
                
                <%
                    String user = request.getParameter("username");
                    String pass = request.getParameter("password");

                    // Check if the field is null or just spaces/empty
                    if ((user == null || user.trim().isEmpty()) && (pass == null || pass.trim().isEmpty())) 
                    {
                %>
                        <p style="color:red;">Both fields cannot be empty!</p>     
                <%
                    }
                %>
                <input type ="submit" value="Submit" />
            </fieldset>
            
        </form>
        <%@include file="footer.jsp" %>
    </body>
</html>
