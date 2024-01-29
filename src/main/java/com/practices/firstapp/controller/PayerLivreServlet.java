package com.practices.firstapp.controller;

import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PayerLivreServlet", value = "/payer-livre")
public class PayerLivreServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numeroCarte=req.getParameter("numeroCarte");
        PrintWriter out=resp.getWriter();
        out.println("<html><body>Paiement effectue avec le numero de carte suivant : "+numeroCarte+"</body></html><br/>");

    }
}
