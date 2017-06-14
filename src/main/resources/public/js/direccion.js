

$("#guardarDireccion").click(function() {

//aplicamos el metodo POST usando la URI del servicio
var numero=$("#numero").val();
var calle=$("#calle").val();
var cp=$("#cp").val();
var municipio=$("#municipio").val();

$.post("direccion/"+numero+'/'+calle+'/'+cp+'/'+municipio,function(json){
console.log(json.id);
});

});

//buscar por id
$("#buscarPorId").click(function(){
            //Aplicamos el metodo post usando la uri del servicio
            var id=$("#id").val();
      
            
          $.get("direccion/"+id,function(json){
              console.log(json.municipio);
              $("#numero2").val(json.numero);
              $("#calle2").val(json.calle);
              $("#cp2").val(json.cp);
              $("#municipio2").val(json.municipio);
               })  ;
            
           }
        );


//actualizar

$("#actualizar").click(function() {

//aplicamos el metodo PUT usando la URI del servicio
var id=$("#id").val();
var numero=$("#numero").val();
var calle=$("#calle").val();
var cp=$("#cp").val();
var municipio=$("#municipio").val();

$.post("direccion/"+id+'/'+numero+'/'+calle+'/'+cp+'/'+municipio,function(json){

console.log("esta es la nueva direccion "+json.id+" numero: "+json.numero+" calle: "+json.calle+
        " codigo postal: "+json.cp+" municipio "+json.municipio);
});

});



$("#borrar").click(function() {

//aplicamos el metodo DELETE usando la URI del servicio
var id=$("#id").val();
$.delete("direccion/"+id,function(json){
console.log("borro esta direccion "+json.id+" numero: "+json.numero+" calle: "+json.calle+
        " codigo postal: "+json.cp+" municipio "+json.municipio);
});

});