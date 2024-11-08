package edu.daniel.lordoftheringsbd.entities;

import edu.daniel.lordoftheringsbd.entities.enumerated.Alianza;
import edu.daniel.lordoftheringsbd.entities.enumerated.Raza;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonaje;
    private String nombre;
    private Raza raza;
    private Alianza alianza;


    

}
