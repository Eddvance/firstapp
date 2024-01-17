
package com.practices.firstapp.controller;


import dto.Personne;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Personne michaelSchumacher = new Personne("Michael","Schumacher");
        out.print("<HTML><BODY>Bonjour "+michaelSchumacher.getFullName()+" </BODY></HTML>");
    }
}