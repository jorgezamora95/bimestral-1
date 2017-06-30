/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sony
 */
@RestController
public class ControladorSalaCine {
//Autowired servicios
@Autowired RepositorioSalaCine repoSalaCine;
    /**
     * 
     * @param tituloPelicula este parametro es el titulo y es de tipo String
     * @param clasificacion  clasificacion string
     * @param numeroAsientos     numero asientos Integer
     * @return  el tipo de retorno es un objeto SalaCine que se guardo e incluye el id generado
     *          
     */

 @RequestMapping(value="/salacine/{tituloPelicula}/{clasificacion}/{numeroAsientos}",method=RequestMethod.POST,
            headers={"Accept=application/json"})
    
    public SalaCine guardar (@PathVariable String tituloPelicula,@PathVariable String clasificacion,
                             @PathVariable Integer numeroAsientos){
                
                return repoSalaCine.save(new SalaCine(tituloPelicula, clasificacion, numeroAsientos));
            }
    

}
