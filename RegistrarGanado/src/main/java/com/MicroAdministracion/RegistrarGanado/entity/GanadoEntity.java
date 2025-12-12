package com.MicroAdministracion.RegistrarGanado.entity; 


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class GanadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String peso;
    private String raza;
    private String fechaIngreso;  

    

    //por el jpa
    public GanadoEntity(){}
              

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
