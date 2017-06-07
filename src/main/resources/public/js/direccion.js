

$("#guardarDireccion").click(function() {

//aplicamos el metodo POST usando la URI del servicio

$.post("direccion/12/calle 13/55130/ecatepec",function(json){
console.log(json.id);
});

});
