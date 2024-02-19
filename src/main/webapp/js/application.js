$(document).ready(function(){
    $('input').last().on('click',function(){
        $.ajax({
          url: "somme",
          data: $("form").serialize(),
          success: function(result) {
              $("form").after(result);
          }
        });
    });
});