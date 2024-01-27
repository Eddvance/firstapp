package com.practices.firstapp.controller;

import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SelectionLivreServlet", value = "/selectionLivre")
public class SelectionLivreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String identifiantlivre=req.getParameter("id");
        PrintWriter out=resp.getWriter();
        out.println("<html><body><a href=\"choix-du-livre.html\">Cliquez ici pour choisir votre livre</a><br/>");
        //out.println("Merci d'avoir choisi le livre "+identifiantlivre+"<br/>");
        out.println("<a href=\"payer-livre.html\">Cliquez ici pour regler</a></body></html><br/>");
    }
}