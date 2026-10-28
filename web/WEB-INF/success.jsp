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
                <form action="CharacterCountingServlet">
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
                    <table class="results">
                        <thead>
                            <td colspan="2"><b>Entered</b>: ${ustr}</td>
                        </thead>
                        <tbody>
                            <tr>
                                <td>String Length:</td>
                                <td class="count">${len}</td>
                            </tr>
                            <tr>
                                <td>Number of Digits:</td>
                                <td class="count">${dcnt}</td>
                            </tr>
                            <tr>
                                <td>Number of Vowels:</td>
                                <td class="count">${vcnt}</td>
                            </tr>
                            <tr>
                                <td>Number of Consonants:</td>
                                <td class="count">${ccnt}</td>
                            </tr>
                            <tr>
                                <td>Number of Symbols:</td>
                                <td class="count">${scnt}</td>
                            </tr>
                        </tbody>
                    </table>
                </form>

            </main>
            <%@include file="footer.jsp" %>
        </div>    
    </body>
</html>
