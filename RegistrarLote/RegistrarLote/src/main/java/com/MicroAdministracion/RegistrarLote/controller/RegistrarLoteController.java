package com.MicroAdministracion.RegistrarLote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.MicroAdministracion.RegistrarLote.entity.LoteEntity;
import com.MicroAdministracion.RegistrarLote.service.LoteService;

@RestController
@RequestMapping("/api/lotes")
public class RegistrarLoteController {

    @Autowired
    private LoteService service;

    // Obtener todos los lotes
    @GetMapping
    public List<LoteEntity> findAll() {
        return service.findAll();
    }

    // Obtener lote por ID
    @GetMapping("/{id}")
    public LoteEntity findById(@PathVariable Long id) {
        return service.findById(id);
    }

    // Crear lote
    @PostMapping
    public void addLote(@RequestBody LoteEntity lote) {
        service.addLote(lote);
    }

    

    // Eliminar lote por ID
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
