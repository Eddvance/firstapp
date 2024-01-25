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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String montant= req.getParameter("montant");

       try {
           Thread.sleep(10000);
       } catch (InterruptedException ex) {
           Logger.getLogger(TestThreadServlet.class.getName()).log(Level.SEVERE, null, ex);
       }
        PrintWriter out =resp.getWriter();
       out.println("<html><body>Vous avez retire "+montant+" euros</body></html>");
    }
}
