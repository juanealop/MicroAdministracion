package com.MicroAdministracion.RegistrarGanado.controller;  


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.MicroAdministracion.RegistrarGanado.entity.GanadoEntity;
import com.MicroAdministracion.RegistrarGanado.service.GanadoService;  



@RestController  
@RequestMapping("/api/ganado")

public class GanadoController {   
    
    
   @Autowired
    private GanadoService service;

    @GetMapping("/{id}")
    public GanadoEntity findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public List<GanadoEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public void addGanado(@RequestBody GanadoEntity ganado){
        service.addGanado(ganado);
    }

    @PutMapping("/{id}")
    public void updateGanado(@PathVariable Long id, @RequestBody GanadoEntity ganado){
        service.updateGanado(id, ganado);
    }

    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping("/count")
    public Long countGanado(){
        return service.countGanado();
    }
    
}
