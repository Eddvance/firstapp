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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String login=req.getParameter("login");
        String password=req.getParameter("password");
        PrintWriter out=resp.getWriter();
        out.println("<html><body>Authentifie avec les identifiants : "+login+"/"+password+"</body></html>");
    }
}
