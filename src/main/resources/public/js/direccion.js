//hasta arriba haremos el servicio para que la pagina se cree automaticamente
$.ajax({
    url:'direccion',
    type:'get',
    success:function(json){
    console.log("este es el tamaño del arreglo "+json.length);    
    for(var i=0;i<json.length;i++){
       
        $("#tablita").append(("<tr><td>"+json[i].id+"</td> <td>"+json[i].numero+"</td> <td>"+json[i].calle+"</td> <td>"
                +json[i].cp+"</td> <td>"+json[i].municipio+"</td></tr>"));
        
    }
    }
});


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


