/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import java.util.ArrayList;
import java.util.Date;
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
public class ControladorTarjeta {
    
       //autowired
    @Autowired RepositorioTarjeta repoTarjeta;
    
      /**
     * 
     * @param idTarjeta este parametro es el numero de calle y es de tipo Integer
     * @param tipo  el nombre de la calle, es de tipo String
     * @param saldo     el codigo postal , es de tipo long
     * @param fechaCorte     el codigo postal , es de tipo long

* @return  el tipo de retorno es un objeto Direccion que se guardo e incluye el id generado
     *          
     */
    
    //post o en operaciones crud insert(create)
      @RequestMapping(value="/tarjeta/{tipo}/{saldo}/{fechaCorte}",method=RequestMethod.POST,
            headers={"Accept=application/json"})
    
    public Tarjeta guardarTarjeta (@PathVariable String tipo,@PathVariable Float saldo,@PathVariable Date fechaCorte){
                
                return repoTarjeta.save(new Tarjeta(tipo,saldo,fechaCorte));
            }
    
    
    //metodo GET o en operaciones crud read(select)
      @RequestMapping(value="/tarjeta/{idTarjeta}",method=RequestMethod.GET,
            headers={"Accept=application/json"})
    
    public Tarjeta buscarIdTarjeta (@PathVariable Long idTarjeta){
                
                return repoTarjeta.findOne(idTarjeta);
            }
    
     //metodo PUT o en operaciones crud update(actualizar), aqui ocupamos el constructor con todos los atributos
      @RequestMapping(value="/tarjeta/{idTarjeta}/{tipo}/{saldo}/{fechaCorte}",method=RequestMethod.PUT,
            headers={"Accept=application/json"})
    
    public Tarjeta actualizarTarjeta (@PathVariable Long idTarjeta,@PathVariable String tipo,@PathVariable Float saldo,
            @PathVariable Date fechaCorte){
                System.out.println("actualizacion exitosa");
                return repoTarjeta.save(new Tarjeta(idTarjeta,tipo,saldo,fechaCorte));
            }
    
    
    //metodo para buscar todos , aqui ocupamos el contructor por defecto
    
      @RequestMapping (value="/tarjeta",method=RequestMethod.GET,
                 headers={"Accept=application/json"})
    
    public ArrayList<Tarjeta> buscarTodosTarjeta(){
        return(ArrayList<Tarjeta>) repoTarjeta.findAll();
    }
    
    
}
    
    
    

