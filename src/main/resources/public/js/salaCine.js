//hasta arriba haremos el servicio para que la pagina se cree automaticamente
$.ajax({
    url:'salacine',
    type:'get',
    success:function(json){
    console.log("este es el tamaño del arreglo "+json.length);    
    for(var j=0;j<json.length;j++){
       
        $("#tablita").append(("<tr><td>"+json[j].idSala+"</td> <td>"+json[j].tituloPelicula+"</td> <td>"+json[j].clasificacion+
                "</td> <td>"
                +json[j].numeroAsientos+"</td></tr>"));
        
    }
    }
});


$("#guardarDireccion").click(function() {

//aplicamos el metodo POST usando la URI del servicio
var tituloPelicula=$("#tituloPelicula").val();
var clasificacion=$("#clasificacion").val();
var numeroAsientos=$("#numeroAsientos").val();

$.post("salacine/"+tituloPelicula+'/'+clasificacion+'/'+numeroAsientos,function(json){
console.log(json.idSala);
});

});

//buscar por id
$("#buscarPorId").click(function(){
            //Aplicamos el metodo post usando la uri del servicio
            var idSala=$("#idSala").val();
      
            
          $.get("direccion/"+idSala,function(json){
              console.log(json.tituloPelicula);
              $("#tituloPelicula2").val(json.tituloPelicula);
              $("#clasificacion2").val(json.clasificacion);
              $("#numeroAsientos2").val(json.numeroAsientos);
              
               })  ;
            
           }
        );


//actualizar

$("#actualizar").click(function() {

//aplicamos el metodo PUT usando la URI del servicio
var idSala=$("#idSala").val();
var tituloPelicula=$("#tituloPelicula2").val();
var clasificacion=$("#clasificacion2").val();
var numeroAsientos=$("#numeroAsientos2").val();

$.ajax ({
type:'PUT',
url:"salacine/"+idSala+'/'+tituloPelicula+'/'+clasificacion+'/'+numeroAsientos,
success:function(json){
alert(json.tituloPelicula);

console.log(json.tituloPelicula);
$("#tituloPelicula2").val(json.tituloPelicula);
$("#clasificacion2").val(json.clasificacion);
$("#numeroAsientos2").val(json.numeroAsientos);

}
  });
});



$("#borrar").click(function() {

//aplicamos el metodo DELETE usando la URI del servicio
var idSala=$("#idSala").val();
$.ajax({
type:'delete',
url:"salacine/"+idSala,
success:function(json){
    alert(json.success);

        }
});

});



