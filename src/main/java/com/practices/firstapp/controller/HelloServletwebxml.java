package com.practices.firstapp.controller;

import dto.Personne;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//path xml
public class HelloServletwebxml extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Personne michaelSchumacher = new Personne("Michael","Schumacher");
        out.print("<HTML><BODY>مرحبا "+michaelSchumacher.getFullName()+" </BODY></HTML>");
    }
}
