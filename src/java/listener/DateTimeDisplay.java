package listener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.servlet.*;
import java.util.*;


/**
 *
 * @author User
 */
public class DateTimeDisplay implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        ctx.setAttribute("DateTime", new Date());
        ctx.setAttribute("MP", "MP3");
        ctx.setAttribute("Header", "ICS2608 | 2CSA | BOLALIN - CARO - TEOPE");
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {}
}
