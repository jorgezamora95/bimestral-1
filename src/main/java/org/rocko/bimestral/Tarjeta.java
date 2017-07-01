/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import java.util.Date;
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
@Table(name="tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue
    @Column
   private Long idTarjeta;
    @Column
   private String tipo;
    @Column
   private Float saldo;
    @Column
   private Date fechaCorte;
    
    @ManyToOne
    //foreign key uniones
    @JoinColumn(name="idCliente")        
    Cliente cliente;
    

    @Override
    public String toString() {
        return "Tarjeta{" + "idTarjeta=" + idTarjeta + ", tipo=" + tipo + ", saldo=" + saldo + ", fechaCorte=" + fechaCorte + '}';
    }

    public Tarjeta(Long idTarjeta, String tipo, Float saldo, Date fechaCorte) {
        this.idTarjeta = idTarjeta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechaCorte = fechaCorte;
    }

    public Tarjeta(String tipo, Float saldo, Date fechaCorte) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechaCorte = fechaCorte;
    }

    public Tarjeta(Long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Tarjeta() {
    }

    public Long getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }
   
    
}
