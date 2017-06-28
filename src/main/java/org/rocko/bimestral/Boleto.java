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
    private Long idBoleto;
    //foreign key
    
    @Column(name="sid_sala")
    private Long sidSala;
    @Column
    private Float costoBoleto;
    
    @ManyToOne
    //foreign key uniones
    @JoinColumn(name="sid_sala")        
    SalaCine salaCine;

    public Boleto(Long idBoleto, Long sidSala, Float costoBoleto) {
        this.idBoleto = idBoleto;
        this.sidSala = sidSala;
        this.costoBoleto = costoBoleto;
    }

    public Boleto() {
    }

    @Override
    public String toString() {
        return "Boleto{" + "idBoleto=" + idBoleto + ", sidSala=" + sidSala + ", costoBoleto=" + costoBoleto + ", salaCine=" + salaCine + '}';
    }

    public Long getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Long idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Long getSidSala() {
        return sidSala;
    }

    public void setSidSala(Long sidSala) {
        this.sidSala = sidSala;
    }

    public Float getCostoBoleto() {
        return costoBoleto;
    }

    public void setCostoBoleto(Float costoBoleto) {
        this.costoBoleto = costoBoleto;
    }
    
    
}
