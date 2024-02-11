
package com.practices.firstapp.controller;


import dto.Personne;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HelloServlet", value = "/hello", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

Date dateInitialisation;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        dateInitialisation=new Date();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Personne michaelSchumacher = new Personne("Michael","Schumacher");
        out.print("<HTML><BODY>مرحبا " +michaelSchumacher.getFullName()+"<br/><br/>");
        out.println("<a href=\"loginFirstApp\">--Identifiez-vous--</a><br/><br/>");
        out.println("<a href=\"saisie-nombre.html\">--Test calcul--</a><br/><br/>");
        out.println("<a href=\"testThread\">--Retrait Especes--</a><br/><br/>");
        out.println("<a href=\"choix-du-livre.html\">--Achat de livre--</a><br/><br/>");
        out.println("<a href=\"google-index.jsp\">--Google page demo jsp--</a><br/><br/>");
        out.println("<a href=\"helloworld.jsp\">--helloworld jsp--</a><br/><br/>");
        out.println("Ce resultat vous est servi par une servlet instanciee le "+dateInitialisation);
        out.println("</BODY></HTML>");
    }
}