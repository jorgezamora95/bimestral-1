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
import javax.persistence.Table;

/**
 *
 * @author T-
 */
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue
    @Column
    
    private Long idCliente;
    @Column
    private Long idTarjeta;
    @Column
    private String Nombre;

    public Cliente(Long idCliente, Long idTarjeta, String Nombre) {
        this.idCliente = idCliente;
        this.idTarjeta = idTarjeta;
        this.Nombre = Nombre;
    }

    public Cliente(Long idTarjeta, String Nombre) {
        this.idTarjeta = idTarjeta;
        this.Nombre = Nombre;
    }

    public Cliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
