package com.practices.firstapp.controller;

import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SelectionLivreServlet", value = "/selection-livre")
public class SelectionLivreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String numeroSession=session.getId();
        String identifiantlivre=req.getParameter("id");
        session.setAttribute("identifiantLivre", identifiantlivre);
        PrintWriter out=resp.getWriter();
        out.println("<html><body>Merci d'avoir choisi le livre "+identifiantlivre+"<br/>");
        out.println("Votre numero de session est : "+numeroSession+".<br/>");
        out.println("<a href=\"payer-livre.html\">Cliquez ici pour regler</a></body></html><br/>");


        //out.println("<html><body><a href=\"choix-du-livre.html\">Cliquez ici pour choisir votre livre</a><br/>");
        //out.println("Merci d'avoir choisi le livre "+identifiantlivre+"<br/>");

    }
}