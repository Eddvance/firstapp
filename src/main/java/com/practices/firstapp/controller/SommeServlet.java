package com.practices.firstapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SommeServlet", value = "/somme")
public class SommeServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String nombre1 = req.getParameter("nombre1");
        String nombre2 = req.getParameter("nombre2");

        try {
            int somme = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);

            String format = req.getParameter("format");
            if (format != null && format.equals("pdf")) {
                req.setAttribute("somme", somme);
                RequestDispatcher disp = req.getRequestDispatcher("/pdf");
                disp.forward(req, resp);
            } else {
                resp.setContentType("text/html;charset=UTF-8");
                PrintWriter out = resp.getWriter();
                out.println("<html><body><a href=\"saisie-nombre.html\">Cliquez ici pour effectuer un nouveau calcul</a><br/>");
                out.print("La somme des 2 nombres fournis est : " + somme + "</body></html>");
            }
        }
            catch (NumberFormatException nfe) {
                RequestDispatcher disp = req.getRequestDispatcher("/unexpected-error.html");
            }

    }
}






