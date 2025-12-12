package com.MicroAdministracion.RegistrarGanado.service;  

import java.util.List;
import com.MicroAdministracion.RegistrarGanado.entity.GanadoEntity;

public interface IGanadoService {  

    public GanadoEntity findById(Long id);
    public List<GanadoEntity> findAll();
    public void addGanado(GanadoEntity ganado);
    public void updateGanado(Long id, GanadoEntity ganado);
    public void updateGanado(GanadoEntity ganado);
    public void deleteById(Long id);
    public Long countGanado();
    
}
