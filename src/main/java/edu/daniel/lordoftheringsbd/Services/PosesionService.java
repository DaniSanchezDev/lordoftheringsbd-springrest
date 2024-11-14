package edu.daniel.lordoftheringsbd.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daniel.lordoftheringsbd.entities.Posesion;
import edu.daniel.lordoftheringsbd.repositories.IPosesionRepository;

@Service
public class PosesionService implements IPosesionService {
    @Autowired
    IPosesionRepository posesionRepo;

    @Override
    public List<Posesion> buscarTodos() {
        return posesionRepo.findAll();
    }
    
    @Override
    public Posesion findById(Integer id) {
        Optional<Posesion> optional = posesionRepo.findById((long)id);
        if (optional.isPresent()) {
            return optional.get();
        }else{
            return null;
        } 
    }


    
    

}