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
                <form action="CharacterCountingServlet" method="post" class="char-count">
                    <fieldset class="field-box">
                        <legend>Character Counting</legend>
                        <div class="field-row">
                            <input 
                                type="text" 
                                name="string" 
                                id="string" 
                                required
                                placeholder="Enter a string..."
                            />
                            <button type="submit">Go</button>
                        </div>
                        
                    </fieldset>
                    <div class="results">
                        <p style="font-weight: bold;">Entered: ${ustr}</p>
                        <p>String Length: ${len}</p>
                        <p>Number of Digits: ${dcnt}</p>
                        <p>Number of Vowels: ${vcnt}</p>
                        <p>Number of Consonants: ${ccnt}</p>
                        <p>Number of Symbols:  ${scnt}</p>
                    </div>
                </form>

            </main>
            <%@include file="footer.jsp" %>
        </div>    
    </body>
</html>
