/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Rohan, Gabriel
 */
public class CharacterCountingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        
        String digits       = getInitParameter("digits");
        String vowels       = getInitParameter("vowels");
        String consonants   = getInitParameter("consonants");
        
        String inputString = request.getParameter("string");
        if (inputString == null)
        {
            // Fixes visiting directly!
            inputString = "";
        }
        
        int dcnt = 0;
        int vcnt = 0;
        int ccnt = 0;
        int scnt = 0;
        
        for (int i = 0; i < inputString.length(); i++) 
        {
            if (digits.indexOf(inputString.charAt(i)) != -1) 
            {
                dcnt++;
            }
            else if (vowels.indexOf(inputString.charAt(i)) != -1) 
            {
                vcnt++;
            }
            else if (consonants.indexOf(inputString.charAt(i)) != -1) 
            {
                ccnt++;
            }
            else if (!Character.isWhitespace(inputString.charAt(i))) 
            {
                scnt++;
            }
        }
        
        // 1. User string
        request.setAttribute("ustr", inputString);
        
        // 2. String Length
        request.setAttribute("len", inputString.length());
        
        // 3. Other Details
        request.setAttribute("dcnt", dcnt);
        request.setAttribute("vcnt", vcnt);
        request.setAttribute("ccnt", ccnt);
        request.setAttribute("scnt", scnt);
        
        // 4. Fwd. Using Our Dispatcher.
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/success.jsp");
        dispatcher.forward(request, response);
    }
}
