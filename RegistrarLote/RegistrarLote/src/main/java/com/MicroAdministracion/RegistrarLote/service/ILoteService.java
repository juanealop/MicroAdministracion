package com.MicroAdministracion.RegistrarLote.service;  


import java.util.List;
import com.MicroAdministracion.RegistrarLote.entity.LoteEntity;
  
public interface ILoteService {
 public LoteEntity findById(Long id);
    public List<LoteEntity> findAll();
    public void addLote(LoteEntity lote);
    //public void updateLote(Long id, LoteEntity lote);
   // public void updateLote(LoteEntity lote);
    public void deleteById(Long id);
    public Long countLotes();
    
} 
