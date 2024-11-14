package edu.daniel.lordoftheringsbd.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.daniel.lordoftheringsbd.Services.IPersonajesService;
import edu.daniel.lordoftheringsbd.entities.Personaje;

@RestController
@RequestMapping("/personajes")
public class PersonajeController {
@Autowired
IPersonajesService personajeServ;
@GetMapping("/all")
public List<Personaje> getPersonajes() {
    return personajeServ.conseguirPersonajes();
}

@GetMapping("/{id}")
public Personaje getPersonajeId(@PathVariable("id") Integer idUrl) {
    return personajeServ.conseguirPersonaje(idUrl);
}

@DeleteMapping("/{id}")
public String deletePersonajeId(@PathVariable("id") Integer idUrl) {
    personajeServ.borrarPersonaje(idUrl);
    return "AGENTE BORRADO";
}

@PostMapping("/guardar")
public Personaje guardarPersonaje(@RequestBody Personaje per) {
    
    return personajeServ.guardarPersonaje(per);
}

@PutMapping("/actualizar")
public Personaje actualizarPersonaje(@RequestBody Personaje per) {
    
    return personajeServ.guardarPersonaje(per);
}


}

