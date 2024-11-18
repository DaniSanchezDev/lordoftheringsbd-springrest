package edu.daniel.lordoftheringsbd.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.daniel.lordoftheringsbd.Services.PosesionService;
import edu.daniel.lordoftheringsbd.entities.Posesion;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController // se indica que esto es un controlador
@RequestMapping("/posesiones") //ponemos la ruta que va a salir en el navegador
public class PosesionController {
    @Autowired
    PosesionService posesionServ;
    @GetMapping("/all")
    public List<Posesion> getPosesiones() {
        return posesionServ.buscarTodos();
    }
// Metodo para buscar por id variable
    @GetMapping("/{id}")
    public Posesion getPosesionById(@PathVariable("id") Integer id) {
       return posesionServ.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePosesionId(@PathVariable("id") Long idUrl) {
        posesionServ.borrarPosesion(idUrl);
        return "Posesión borrada";
    }

    @PostMapping("/guardar")
    public Posesion guardarPosesion(@RequestBody Posesion pos){
        return posesionServ.guardarPosesion(pos);
    }
    
    
}
