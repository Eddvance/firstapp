
package com.practices.firstapp.controller;


import dto.Personne;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Personne michaelSchumacher = new Personne("Michael","Schumacher");
        out.print("<HTML><BODY>مرحبا  "+michaelSchumacher.getFullName());
        out.println("<a href=\"somme\">   - Accès au test somme</a>");
        out.println("<a href=\"login\">  -  Accès identification</a>");
        out.println("</BODY></HTML>");
    }
}