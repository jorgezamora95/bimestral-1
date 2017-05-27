/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

/**
 *
 * @author T-
 */
public class Usuario {
    
    private String nombre;
    private String paterno;
    private Integer edad;

    public Usuario(String nombre, String paterno, Integer edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.edad = edad;
    }
    
    public Usuario(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
            
    
}
