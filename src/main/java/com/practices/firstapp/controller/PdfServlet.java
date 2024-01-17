package com.practices.firstapp.controller;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pdfServlet", value = "/pdf")
public class PdfServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/pdf");

        try{
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            document.add(new Paragraph("Hello world en pdf"));
            document.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
