package com.practices.firstapp.controller;

import com.itextpdf.text.pdf.PdfWriter;
import dto.Livre;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

@WebServlet(name = "SelectionLivreServlet", value = "/selection-livre")
public class SelectionLivreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String numeroSession=session.getId();
        String identifiantLivre=request.getParameter("id");

        List<Livre> liste=(List<Livre>)session.getAttribute("listLivres");

        if(liste==null){
            liste=new ArrayList<>();
            session.setAttribute("listeLivre", liste);
        }

        Livre livre=new Livre();
        livre.setNumeroLivre(Integer.parseInt((identifiantLivre)));
        liste.add(livre);
        PrintWriter out=resp.getWriter();
        out.println("<html><body>Merci d'avoir choisi le livre "+identifiantLivre+"<br/>");
        out.println("<a href=\"choix-du-livre.html\"> Cliquez ici pour ajouter un autre livre</a><br/>");
        out.println("<a href=\"payer-livre.html\">Cliquez ici pour regler</a></body></html><br/>");

    }
}