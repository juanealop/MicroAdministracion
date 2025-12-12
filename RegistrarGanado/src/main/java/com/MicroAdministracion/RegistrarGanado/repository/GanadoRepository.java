package com.MicroAdministracion.RegistrarGanado.repository;  

import org.springframework.data.jpa.repository.JpaRepository; 
import com.MicroAdministracion.RegistrarGanado.entity.GanadoEntity;


public interface GanadoRepository extends JpaRepository<GanadoEntity, Long> {

    //metodos por defecto
}
