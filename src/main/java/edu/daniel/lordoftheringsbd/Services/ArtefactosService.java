package edu.daniel.lordoftheringsbd.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daniel.lordoftheringsbd.entities.Artefacto;
import edu.daniel.lordoftheringsbd.repositories.IArtefactoRepository;

@Service
public class ArtefactosService implements IArtefactoService{

    @Autowired // llama a un metodo que no está en esta clase
    IArtefactoRepository artefactoRepo;
    @Override
    public List<Artefacto> getArtefactos(){
        return artefactoRepo.findAll();
    }
    @Override
    public Artefacto findById(Integer id) {
        Optional<Artefacto> optional = artefactoRepo.findById((long)id);
        if (optional.isPresent()) {
            return optional.get();
        }else{
            return null;
        } 
    }
    
}
