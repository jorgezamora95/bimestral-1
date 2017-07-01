/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
public class ControladorCliente {
    //autowired
    @Autowired RepositorioCliente repoCliente;
    
      /**
     * 
     * @param idCliente este parametro es el numero de calle y es de tipo Integer
     * @param IdTarjeta  el nombre de la calle, es de tipo String
     * @param nombre     el codigo postal , es de tipo long
     * @return  el tipo de retorno es un objeto Direccion que se guardo e incluye el id generado
     *          
     */
    
    //post o en operaciones crud insert(create)
      @RequestMapping(value="/cliente/{idTarjeta}/{nombre}",method=RequestMethod.POST,
            headers={"Accept=application/json"})
    
    public Cliente guardarCliente (@PathVariable Long idTarjeta,@PathVariable String nombre){
                
                return repoCliente.save(new Cliente(idTarjeta, nombre));
            }
    
    
    //metodo GET o en operaciones crud read(select)
      @RequestMapping(value="/cliente/{idCliente}",method=RequestMethod.GET,
            headers={"Accept=application/json"})
    
    public Cliente buscarIdCliente (@PathVariable Long idCliente){
                
                return repoCliente.findOne(idCliente);
            }
    
     //metodo PUT o en operaciones crud update(actualizar), aqui ocupamos el constructor con todos los atributos
      @RequestMapping(value="/cliente/{idCliente}/{idTarjeta}/{nombre}",method=RequestMethod.PUT,
            headers={"Accept=application/json"})
    
    public Cliente actualizarCliente (@PathVariable Long idCliente,@PathVariable Long idTarjeta,@PathVariable String nombre){
                System.out.println("actualizacion exitosa");
                return repoCliente.save(new Cliente(idCliente,idTarjeta,nombre));
            }
    
    
    //metodo para buscar todos , aqui ocupamos el contructor por defecto
    
      @RequestMapping (value="/cliente",method=RequestMethod.GET,
                 headers={"Accept=application/json"})
    
    public ArrayList<Cliente> buscarTodosCliente(){
        return(ArrayList<Cliente>) repoCliente.findAll();
    }
    
    
}
