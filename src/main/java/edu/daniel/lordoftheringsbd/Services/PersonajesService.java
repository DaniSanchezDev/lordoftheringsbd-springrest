package edu.daniel.lordoftheringsbd.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daniel.lordoftheringsbd.entities.Personaje;
import edu.daniel.lordoftheringsbd.repositories.IPersonajeRepository;

@Service
public class PersonajesService implements IPersonajesService{
@Autowired
IPersonajeRepository personajesRepo;
    @Override
    public List<Personaje> conseguirPersonajes() {
       return personajesRepo.findAll();
    }

    @Override
    public Personaje conseguirPersonaje(Integer id) {
        Optional<Personaje> pe = personajesRepo.findById((int) id);
        if(pe.isPresent()){
            return pe.get();
        }
        return null;
    }

    @Override
    public void borrarPersonaje(Integer id) {
        personajesRepo.deleteById((int) id);
        System.out.println("Personaje eliminado.");
    }

    @Override
    public Personaje guardarPersonaje(Personaje per) {
       return personajesRepo.save(per);
    }

    
    

}
