package com.MicroAdministracion.RegistrarLote.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.MicroAdministracion.RegistrarLote.entity.LoteEntity;
import com.MicroAdministracion.RegistrarLote.repository.LoteRepository;

@Service
public class LoteService implements ILoteService {

    @Autowired
    private LoteRepository repository;

    @Override
    public LoteEntity findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<LoteEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void addLote(LoteEntity lote) {
        repository.save(lote);
    }

   

    

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Long countLotes() {
        return repository.count();
    } 

}
