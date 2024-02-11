package com.practices.firstapp.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet(name = "TestThreadServlet", value = "/testThread")
public class TestThreadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
       String montant= request.getParameter("montant");

       try {
           Thread.sleep(100);
       } catch (InterruptedException ex) {
           Logger.getLogger(TestThreadServlet.class.getName()).log(Level.SEVERE, null, ex);
       }
        PrintWriter out =resp.getWriter();
        out.println("<html><body><a href=\"saisie-montant.html\">Retirer</a><br/>");
        if (montant != null) {
            out.println("<html><boby>Montant retire : "+montant+"</body></html>");
        }
    }
}