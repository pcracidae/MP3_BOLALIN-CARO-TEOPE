/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupfourservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // Fetch & Compare Request's Credentials
        String user = request.getParameter("username");
        String ctexUser = getInitParameter("username");
        String pass = request.getParameter("password");
        String ctexPass = getInitParameter("password");
        
        /* > If both fields are empty, the application should display an 
         * appropriate message indicating that both fields are required.
         * Both fields empty. Show appr. msg.
         */
        
        if (user.isEmpty() && pass.isEmpty())
        {
            return;
        }
        else
        {
            // 1. Checks if 'user' is empty.
            if (!user.isEmpty())
            {

                // 2. Checks if 'pass' is empty.
                if (!pass.isEmpty())
                {
                    if (user.equals(ctexUser) && pass.equals(ctexPass))
                    {
                        request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
                        return;
                    }
                    else
                    {
                        // Wouldn't it be safer this way?
                        // LMK if you guys want to change
                        request.setAttribute(
                                "errorMsg", 
                                "The provided username or password is incorrect!"
                        );
                        request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
                        return;
                    }

                }
                else
                {
                    // 2.e Forward to error.jsp
                    request.setAttribute(
                            "errorMsg", 
                            "Please enter a password."
                    );
                    request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
                    return;
                }

            }
            else
            {
                // 1.e Forward to error.jsp
                request.setAttribute(
                        "errorMsg", 
                        "Please enter a username."
                );
                request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
                return;
            }
        
        }
        // Success (Req. Credentials match Context's)
        
        // On success, forward to success.jsp
        // Check request's account and password fields.
        // If 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
