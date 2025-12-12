package com.MicroAdministracion.RegistrarLote.dto;


import jakarta.persistence.Embeddable;

@Embeddable
public class GanadoDto {


     private Long id;
    private String peso;
    private String raza;
    private String fechaIngreso; 


    public GanadoDto(){}


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    
}
