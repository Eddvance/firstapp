package resources;

import dto.Produit;
import dto.Somme;
import dto.SommeEtProduit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calculation")
public class CalculationResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/somme-et-produit")
    public SommeEtProduit sommeEtProduit(@QueryParam("nombre1") int nombre1,@QueryParam("nombre2") int nombre2){

        int sommeNumerique=nombre1+nombre2;
        int produitNumerique=nombre1*nombre2;

        SommeEtProduit sommeEtProduit = new SommeEtProduit();
        Somme somme=new Somme();
        somme.setNumerique(sommeNumerique);
        somme.setTexte("pas de code javaScript pour ca");
        Produit produit=new Produit();
        produit.setNumerique(produitNumerique);
        produit.setTexte("pas de code javaScript pour ca");
        sommeEtProduit.setSomme(somme);
        sommeEtProduit.setProduit(produit);

        return sommeEtProduit;
    }
}
