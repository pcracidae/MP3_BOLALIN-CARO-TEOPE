/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupfourservlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Gabriel
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user_string = request.getParameter("string");
        String digits = getInitParameter("digits");
        String vowels = getInitParameter("vowels");
        String consonants = getInitParameter("consonants");
        int dcnt = 0;
        int vcnt = 0;
        int ccnt = 0;
        int scnt = 0;
        for (int i = 0; i < user_string.length(); i++) {
            if (digits.indexOf(user_string.charAt(i)) != -1) {
                dcnt++;
            }
            else if (vowels.indexOf(user_string.charAt(i)) != -1) {
                vcnt++;
            }
            else if (consonants.indexOf(user_string.charAt(i)) != -1) {
                ccnt++;
            }
            else if (!Character.isWhitespace(user_string.charAt(i))) {
                scnt++;
            }
        }
        request.setAttribute("len", user_string.length());
        request.setAttribute("ustr", user_string);
        request.setAttribute("dcnt", dcnt);
        request.setAttribute("vcnt", vcnt);
        request.setAttribute("ccnt", ccnt);
        request.setAttribute("scnt", scnt);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/success.jsp");
        dispatcher.forward(request, response);
    }
}
