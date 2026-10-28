/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
// import java.io.PrintWriter;
// import javax.servlet.RequestDispatcher;
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
        
        String errorMsg = null;
        
        if (user.isEmpty() && pass.isEmpty())
        {
            request.setAttribute(
                    "alertMsg", 
                    "Try again! Both fields are required!"
            );
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        else
        {
            // 1. Checks if 'user' is empty.
            if (!user.trim().isEmpty())
            {

                // 2. Checks if 'pass' is empty.
                if (!pass.trim().isEmpty())
                {
                    boolean uMatch = user.equals(ctexUser);
                    boolean pMatch = pass.equals(ctexPass);
                    
                    if (uMatch && pMatch)
                    {
                        request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
                    }
                    else // 3. When both provided credentials are incorrect.
                    {
                        // 3.e Update 'errorMsg'
                        errorMsg = "The provided " + (!uMatch ? "username " : "") +             // I don't wanna write a separate 
                                            (!uMatch && !pMatch ? "and " : "") +                // clause. Sorry! :)
                                            (!pMatch ? "password " : "") + "is incorrect!";
                    }

                }
                else
                {
                    // 2.e Update 'errorMsg'
                    errorMsg = "Please enter a password.";
                }

            }
            else
            {
                // 1.e Update 'errorMsg'
                errorMsg = "Please enter a username.";
            }
            
        }
        
        if (errorMsg != null) // Trips error.jsp.
        {
            request.setAttribute("errorMsg", errorMsg);
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
        }
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
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Written by Gabriel. Hi!!! Hello!!!";
    }// </editor-fold>

}
