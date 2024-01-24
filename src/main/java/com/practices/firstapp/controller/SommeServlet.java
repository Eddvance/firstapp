package com.practices.firstapp.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SommeServlet", value = "/somme")
public class SommeServlet extends HttpServlet {

    /**
     * @param request  an {@link HttpServletRequest} object that
     *                 contains the request the client has made
     *                 of the servlet
     * @param response an {@link HttpServletResponse} object that
     *                 contains the response the servlet sends
     *                 to the client
     * @throws IOException      if an input or output error is
     *                          detected when the servlet handles
     *                          the GET request
     * @throws ServletException if the request for the GET
     *                          could not be handled
     * @see ServletResponse#setContentType
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String nombre1 = request.getParameter("nombre1");
            String nombre2 = request.getParameter("nombre2");
            int total = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);
            out.print("<HTML><BODY>La somme des 2 nombres fournis est : " + total + "</BODY></HTML>");





    }
}
