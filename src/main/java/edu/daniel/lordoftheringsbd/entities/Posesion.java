package edu.daniel.lordoftheringsbd.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posesion")
public class Posesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosesion;
    private Long idPersonaje;
    private Long idArtefacto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    
}
