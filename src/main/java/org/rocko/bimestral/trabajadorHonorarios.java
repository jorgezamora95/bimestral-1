/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

/**
 *
 * @author Sony
 */
public class trabajadorHonorarios extends Trabajador implements Nomina {
    Float iva;
    Float isr;
    
    @Override
    public String pagarNomina(){
        return ("nomina con con iva"+iva+"y con isr"+isr);
    }
    
}
