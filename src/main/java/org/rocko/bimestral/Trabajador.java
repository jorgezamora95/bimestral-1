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
public class Trabajador {
  
    private Long id;
    private String nombre;
    private Integer horasLaboradas;

    public Trabajador(Long id, String nombre, Integer horasLaboradas) {
        this.id = id;
        this.nombre = nombre;
        this.horasLaboradas = horasLaboradas;
    }

    public Trabajador() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(Integer horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }
    
}
