package edu.daniel.lordoftheringsbd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daniel.lordoftheringsbd.entities.Personaje;

public interface IPersonajeRepository extends JpaRepository<Personaje, Integer> {

}
