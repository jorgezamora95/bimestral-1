/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
public class ControladorDireccion {
    //autowired servicios
    @Autowired RepositorioDireccion repo;
    
    /**
     * 
     * @param numero este parametro es el numero de calle y es de tipo Integer
     * @param calle  el nombre de la calle, es de tipo String
     * @param cp     el codigo postal , es de tipo long
     * @param municipio el municipio es de tipo String
     * @return  el tipo de retorno es un objeto Direccion que se guardo e incluye el id generado
     *          
     */
    @RequestMapping(value="/direccion/{numero}/{calle}/{cp}/{municipio}",method=RequestMethod.POST,
            headers={"Accept=application/json"})
    
    public Direccion guardar (@PathVariable Integer numero,@PathVariable String calle,@PathVariable Long cp,
            @PathVariable String municipio){
                
                return repo.save(new Direccion(numero, calle, cp, municipio));
            }

//get
    @RequestMapping (value="/direccion/{id}",method=RequestMethod.GET,
                 headers={"Accept=application/json"})
    
    public Direccion buscarId (@PathVariable Long id){
        return repo.findOne(id);
    }
    
    //buscar todos
    @RequestMapping (value="/direccion",method=RequestMethod.GET,
                 headers={"Accept=application/json"})
    
    public ArrayList<Direccion> buscarTodos(){
        return(ArrayList<Direccion>) repo.findAll();
    }
    
    
    //put actualizar
    @RequestMapping (value="/direccion/{id}/{numero}/{calle}/{cp}/{municipio}",method=RequestMethod.PUT,
            headers={"Accept=application/json"})
    
    public Direccion actualizar (@PathVariable Long id,@PathVariable Integer numero,
            @PathVariable String calle,@PathVariable Long cp,
            @PathVariable String municipio){
        
        System.out.println("se hizo la actualizacion"); 
        
     return repo.save(new Direccion(id,numero,calle,cp,municipio));
    }
    
    //delete
    @RequestMapping (value="/direccion/{id}",method=RequestMethod.DELETE,
              headers={"Accept=application/json"})
    
    public Estatus borrar(@PathVariable Long id){
        repo.delete(new Direccion(id));
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        return estatus;
    }

    
    
    /*
    @Path("/service/")
    Direccion;
    @Get
    @Produces({MediaType.APPLICATION_JSON})
    Public List<Direccion> get.Direccion(){
        List<Direccion> result=new LinkedList <>();
        result.add(new Direccion(1L,1564,"calle 30",57100L,"Ecatepec"));
        return result;
    }*/
}
