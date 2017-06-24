/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author T-
 */
@Entity
@Table(name="boleto")
public class Boleto {
    @Id
    @GeneratedValue
    @Column(name="id_boleto")
    private Integer idBoleto;
    //foreign key
    
    @Column(name="sid_sala")
    private Integer sidSala;
    @Column
    private Float costoBoleto;
    
    @ManyToOne
    //foreign key
    @JoinColumn(name="sid_sala")        
    SalaCine salaCine;

    public Boleto(Integer idBoleto, Integer sidSala, Float costoBoleto) {
        this.idBoleto = idBoleto;
        this.sidSala = sidSala;
        this.costoBoleto = costoBoleto;
    }

    public Boleto() {
    }

    public Integer getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Integer getSidSala() {
        return sidSala;
    }

    public void setSidSala(Integer sidSala) {
        this.sidSala = sidSala;
    }

    public Float getCostoBoleto() {
        return costoBoleto;
    }

    public void setCostoBoleto(Float costoBoleto) {
        this.costoBoleto = costoBoleto;
    }
    
    
}
