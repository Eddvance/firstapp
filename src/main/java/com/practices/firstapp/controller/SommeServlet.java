package com.practices.firstapp.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Produit;
import dto.Somme;
import dto.SommeEtProduit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "SommeServlet", value = "/somme")
public class SommeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");


            int sommeNumerique=Integer.parseInt(nombre1) + Integer.parseInt(nombre2);
            int produitNumerique=Integer.parseInt(nombre1)*Integer.parseInt(nombre2);
            String format = request.getParameter("format");

            if (format != null && format.equals("pdf")) {
                request.setAttribute("somme", sommeNumerique); RequestDispatcher disp = request.getRequestDispatcher("/pdf");
                disp.forward(request, response);
            } else {
                response.setContentType("application/json");
                PrintWriter out=response.getWriter();
                ObjectMapper objectMapper=new ObjectMapper();
                SommeEtProduit sommeEtProduit = new SommeEtProduit();
                Somme somme=new Somme();
                somme.setNumerique(sommeNumerique);
                somme.setTexte("pas de code javaScript pour ca");
                Produit produit=new Produit();
                produit.setNumerique(produitNumerique);
                produit.setTexte("pas de code javaScript pour ca");
                sommeEtProduit.setSomme(somme);
                sommeEtProduit.setProduit(produit);

                /*List list=new ArrayList();
                list.add(somme);
                list.add(produit);

                Somme somme2=new Somme();
                somme2.setNumerique(sommeNumerique);
                somme2.setTexte("toujours pas");
                list.add(somme2);

                Produit produit2=new Produit();
                produit2.setNumerique(produitNumerique);
                produit2.setTexte("rien d'autre");
                list.add(produit2);*/

                objectMapper.writeValue(out,sommeEtProduit);

                //objectMapper.writeValue(out,list);
                //String messageJSON="{\"somme\" : { \"numerique\":"+somme+", \"texte\": \"douze\"},"+"\"produit\" : { \"numerique\":"+produit+",\"texte\":\"trente-six\"}}";
                //out.println(messageJSON);
            }

            RequestDispatcher disp = request.getRequestDispatcher("/unexpected-error.html");
        }
    }