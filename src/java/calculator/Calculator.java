/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 578291
 */
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String opp = request.getParameter("operation");
        boolean finish = false;
        int result = 0;
        String message ="";
        
        if((opp != null && !opp.equals("")) && (first != null && !first.equals("")) && (second != null && !second.equals("")))
        {
            int frstNum = Integer.parseInt(first);
            int scndNum = Integer.parseInt(second);
            char oper = opp.charAt(0);
            switch(oper)
            {
                case '+':
                    result = (frstNum + scndNum);
                    break;
                case '-':
                    result = (frstNum - scndNum);
                    break;
                case '*':
                    result = (frstNum * scndNum);
                    break;
                case '%':
                    result = (frstNum % scndNum);
                    break;
            }
            finish = true;
        }
        else
        {
            message = "Must enter in all feilds.";
        }
        request.setAttribute("message", message);
        request.setAttribute("finish", finish);
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
