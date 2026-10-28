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
        <title>Error</title>
        <link 
            rel="stylesheet" 
            type="text/css" 
            href="${pageContext.request.contextPath}/styles.css"
        />
    </head>
    <body>
        <div class="page-container">
            <%@include file="header.jsp" %>
            <main class="main-content">
                
                <h1>${errorMsg}</h1>
                <a href="${pageContext.request.contextPath}/">
                    <br><p>Return to Login.</p>
                </a>
            </main>
            
                
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
