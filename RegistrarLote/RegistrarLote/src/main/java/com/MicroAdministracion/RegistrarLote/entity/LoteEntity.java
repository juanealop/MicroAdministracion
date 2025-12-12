package com.MicroAdministracion.RegistrarLote.entity;  


import java.util.List; 
import com.MicroAdministracion.RegistrarLote.dto.GanadoDto;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;





@Entity
public class LoteEntity {



    @Id 
     @GeneratedValue(strategy = GenerationType.IDENTITY) 

     private long id; 
     private String nombre_lote; 

     @ElementCollection
     private List<GanadoDto> ganado;  




     public LoteEntity(){}   


     public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreLote() {
        return nombre_lote;
    }
    public void setNombreLote(String nombreLote) {
        this.nombre_lote = nombreLote;
    }

    public List<GanadoDto> getGanado() {
        return ganado;
    }
    public void setGanado(List<GanadoDto> ganado) {
        this.ganado = ganado;
    } 
    
    public List<Long> getIdsGanado() {
    if (ganado == null) {
        return List.of(); // lista vacía
    }

    return ganado.stream()
                 .map(GanadoDto::getId)
                 .toList();
}


     

     


    
}
