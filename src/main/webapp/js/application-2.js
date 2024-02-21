$(document).ready(function(){
    $('input').last().on('click',function(){
        if ($("input[name=format]").prop( "checked")===true){
            $("form").submit();
        }
        else{
            $.ajax({
              url: "somme",
              data: $("form").serialize(),
              success: function(result) {
                  $("p").remove();
                  $("form").after("<p>La somme des 2 nombres fournis est "+result+"</p>");
              }
            });
        }
    });
});