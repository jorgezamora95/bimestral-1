/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import org.springframework.stereotype.Service;

/**
 *
 * @author Sony
 */
@Service
public class servicioNomina {

public Nomina servicioPagarNomina(){
    Nomina n=new trabajadorHonorarios();
    
    return n;
}    
}
