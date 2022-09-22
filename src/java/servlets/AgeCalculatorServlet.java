/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author musta
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(req, resp);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        RequestDispatcher rd = ctx.getRequestDispatcher("/WEB-INF/agecalculator.jsp");
        String age = req.getParameter("age");
        
        if(age == null || age.equals("")) {
            req.setAttribute("msg", "You must give your current age");
            rd.forward(req, resp);
            return;
        }
        
        try {
            int n_age = Integer.parseInt(age) + 1;
            req.setAttribute("msg", "Your age next birthday will be " + n_age);
            rd.forward(req, resp);
            return;
        } catch(NumberFormatException e) {
            req.setAttribute("msg", "You must enter a number");
            rd.forward(req, resp);
            return;
        }
    }
    
    
}