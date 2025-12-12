package com.MicroAdministracion.RegistrarLote.repository;  

import org.springframework.data.jpa.repository.JpaRepository;   

import com.MicroAdministracion.RegistrarLote.entity.LoteEntity;


public interface LoteRepository extends JpaRepository<LoteEntity,Long>{

    
}
