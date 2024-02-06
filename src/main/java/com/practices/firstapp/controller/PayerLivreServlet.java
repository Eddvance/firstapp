package com.practices.firstapp.controller;

import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PayerLivreServlet", value = "/payer-livre")
public class PayerLivreServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession();
        String numeroSession=session.getId();
        String numeroCarte=req.getParameter("numeroCarte");
        String identifiantlivre=(String) session.getAttribute("identifiantLivre");
        //session.setAttribute("identifiantLivre", null);
        //ou bien : session.removeAttribute("identifiantLivre");
        //encore : session.invalidate(); lors d'une deconnexion (logOut)
        PrintWriter out=resp.getWriter();
        out.println("<html><body>Paiement effectue avec le numero de carte suivant : "+numeroCarte+"<br/>");
        out.println("Le livre paye est le livre numero : "+identifiantlivre+".<br/>");
        out.println("Votre numero de session est : "+numeroSession+".</body></html><br/>");

    }
}
