

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
var numero=$("#numero2").val();
var calle=$("#calle2").val();
var cp=$("#cp2").val();
var municipio=$("#municipio2").val();

$.ajax ({
type:'PUT',
url:"direccion/"+id+'/'+numero+'/'+calle+'/'+cp+'/'+municipio,
success:function(json){
alert(json.municipio);

console.log(json.municipio);
$("#numero2").val(json.numero);
$("#calle2").val(json.calle);
$("#cp2").val(json.cp);
$("#municipio2").val(json.municipio);
}
  });
});



$("#borrar").click(function() {

//aplicamos el metodo DELETE usando la URI del servicio
var id=$("#id").val();
$.ajax({
type:'delete',
url:"direccion/"+id,
success:function(json){
    alert(json.success);

        }
});

});


//buscar Todos
 $("#buscarTodos".click=function(){
        
           //metodo get
        $.get("direccion",function(){
            var todos=$.get.direccion.length;

            console.log("tamano:"+todos);
           var primero= $.get.direccion[0];
            console.log(primero.id+" "+primero.numero+" "+primero.calle+" "+primero.cp+" "+primero.municipio);
        });

    
});