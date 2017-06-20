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
public class controladorNomina {
    @Autowired servicioNomina ser;
    
        @RequestMapping(value="/nomina",method=RequestMethod.GET,
            headers={"Accept=application/json"})
    
    public Nomina(){
                
                return ser;
            }

    
}
