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
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");

        try {
            int somme = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);
            String format = request.getParameter("format");
            request.setAttribute("somme", somme);
            if (format != null && format.equals("pdf")) {
                RequestDispatcher disp = request.getRequestDispatcher("/pdf");
                disp.forward(request, resp);
            } else {
                RequestDispatcher disp = request.getRequestDispatcher("/affichage-somme.jsp");
                disp.forward(request, resp);
            }
        } catch (NumberFormatException nfe) {
            RequestDispatcher disp = request.getRequestDispatcher("/unexpected-error.html");
        }
    }
}