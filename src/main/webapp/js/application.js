$(document).ready(function(){
    $('input').last().on('click',function(){
        $.ajax({
          url: "rest/calculation/sommeetproduit",
          data: $("form").serialize(),
          success: function(resultObject) {
              var message="<p>La somme des deux nombres fournis est <strong>"+resultObject.somme.numerique+"-"+resultObject.somme.texte+"</strong></p>";
              message=message.concat("<p>Le produit des deux nombres fournis est <strong>"+resultObject.produit.numerique+"-"+resultObject.produit.texte+"</strong></p>");
              $("form").after(message);
          }
        });
    });
});