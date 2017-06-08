

$("#guardarDireccion").click(function() {

//aplicamos el metodo POST usando la URI del servicio

$.post("direccion/12/calle 13/55130/ecatepec",function(json){
console.log(json.id);
});

});


$("#buscarPorId").click(function() {

//aplicamos el metodo GET usando la URI del servicio

$.get("direccion/1",function(json){
console.log("esta es la direccion buscada "+json.id);
});

});


$("#actualizar").click(function() {

//aplicamos el metodo PUT usando la URI del servicio

$.put("direccion/1/12/calle 13/55130/ecatepec",function(json){
console.log("esta es la nueva direccion "+json.id);
});

});

$("#borrar").click(function() {

//aplicamos el metodo DELETE usando la URI del servicio

$.delete("direccion/1",function(json){
console.log("borro esta direccion "+json.id);
});

});