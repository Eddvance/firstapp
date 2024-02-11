package com.practices.firstapp.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginFirstAppServlet", value = "/loginFirstApp")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        out.println("<html><body><a href=\"loginFirstApp.html\">Authentifiez vous</a><br/>");
        //
        // out.println("<a href=\"hello\"> Bienvenue</a></body></html>");
    }
}
