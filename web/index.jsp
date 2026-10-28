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
        <div class="page-container">
            <%@include file="WEB-INF/header.jsp" %>
            <main class="main-content">
                <form action="LoginServlet" method="POST">
                    <fieldset class="field-box">
                        <legend>Sign In</legend>
                        <div class="field-row">
                            <label for="username">Username:</label>
                            <input type="text" id="username" name="username" />
                        </div>

                        <div class="field-row">
                            <label for="password">Password:</label>
                            <input type="password" id="password" name="password" />
                        </div>

                        <p style="color:red;">${alertMsg}</p>

                        <div class="form-submit">
                            <input type ="submit" value="Submit" />
                        </div>
                    </fieldset>
                </form>
            </main>
            <%@include file="WEB-INF/footer.jsp" %>
        </div>
    </body>
</html>
