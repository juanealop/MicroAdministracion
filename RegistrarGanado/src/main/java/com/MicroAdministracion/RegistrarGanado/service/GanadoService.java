package com.MicroAdministracion.RegistrarGanado.service;  



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import com.MicroAdministracion.RegistrarGanado.entity.GanadoEntity;
import com.MicroAdministracion.RegistrarGanado.repository.GanadoRepository;  


@Service

public class GanadoService implements IGanadoService {
    


    @Autowired  //inyeccion de dependencias 
    private GanadoRepository repository;       
    
    @Override
    public GanadoEntity findById(Long id){


      return repository.findById(id).orElse(null);
    }

    @Override
    public List<GanadoEntity> findAll() {


       return repository.findAll();

    }     


    @Override
    public void addGanado(GanadoEntity ganado){

       repository.save(ganado);
    }
 
    @Transactional
    @Override
    public void updateGanado(Long id, GanadoEntity nuevoGanado){    



       GanadoEntity ganado = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Ganado no encontrado con ID: " + id));  


              ganado.setPeso(nuevoGanado.getPeso());
              ganado.setFechaIngreso(nuevoGanado.getFechaIngreso());
              ganado.setRaza(nuevoGanado.getRaza());  



              repository.save(ganado);
           


    }    

    @Override public void updateGanado(GanadoEntity ganado) {
        
        repository.save(ganado); 
    
    
    }




    @Override
    public void deleteById(Long id){

     repository.deleteById(id);

    }   


    @Override
    public Long countGanado(){


     return repository.count();

    }


  


}
