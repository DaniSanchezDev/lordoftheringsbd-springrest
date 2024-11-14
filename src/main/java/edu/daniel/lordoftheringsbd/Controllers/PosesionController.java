package edu.daniel.lordoftheringsbd.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.daniel.lordoftheringsbd.Services.PosesionService;
import edu.daniel.lordoftheringsbd.entities.Posesion;

import org.springframework.web.bind.annotation.GetMapping;


@RestController // se indica que esto es un controlador
@RequestMapping("/posesiones")
public class PosesionController {
    @Autowired
    PosesionService posesionServ;
    @GetMapping("/all")
    public List<Posesion> getPosesiones() {
        return posesionServ.buscarTodos();
    }
    
}
