/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author musta
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(req, resp);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp");
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        String operation = req.getParameter("operation");
        req.setAttribute("first", first);
        req.setAttribute("second", second);
        
        if(first == null || first.equals("") || second == null || second.equals("")) {
            req.setAttribute("result", "invalid");
            rd.forward(req, resp);
            return;
        }
        
        try {
            int n_first = Integer.parseInt(first);
            int n_second = Integer.parseInt(second);
            if (operation.equals("+"))
                req.setAttribute("result", n_first + n_second);
            else if (operation.equals("-"))
                req.setAttribute("result", n_first - n_second);
            else if (operation.equals("*"))
                req.setAttribute("result", n_first * n_second);
            else if (operation.equals("%"))
                req.setAttribute("result", n_first % n_second);
            else
                req.setAttribute("result", "invalid");
            rd.forward(req, resp);
            return;
        } catch(NumberFormatException e) {
            req.setAttribute("result", "invalid");
            rd.forward(req, resp);
            return;
        } catch (ArithmeticException e) {
            req.setAttribute("result", "invalid");
            rd.forward(req, resp);
            return;
        }
    }
}