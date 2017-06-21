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
    private Float iva;
    private Float isr;
    
    @Override
    public String pagarNomina(){
        return ("pago de nomina con con iva "+iva+" y con isr "+isr);
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getIsr() {
        return isr;
    }

    public void setIsr(Float isr) {
        this.isr = isr;
    }
    
}
