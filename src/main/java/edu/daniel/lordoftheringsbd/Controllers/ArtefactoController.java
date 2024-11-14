package edu.daniel.lordoftheringsbd.Controllers;

import org.springframework.web.bind.annotation.RestController;

import edu.daniel.lordoftheringsbd.Services.IArtefactoService;
import edu.daniel.lordoftheringsbd.entities.Artefacto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/artefactos") // al pedir todos ponemos request mapping para indicar artefactos
public class ArtefactoController {
    @Autowired
    IArtefactoService artefactoServ;
    @GetMapping("/all")
    public List<Artefacto> getArtefactos() {
        return artefactoServ.getArtefactos();
    }

    @GetMapping("/{id}")
    public Artefacto getArtefactoById(@PathVariable("id") Integer id){
        return artefactoServ.findById(id);
    }



    
    

    

}
