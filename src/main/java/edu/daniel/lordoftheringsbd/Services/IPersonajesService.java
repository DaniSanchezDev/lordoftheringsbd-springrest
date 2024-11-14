package edu.daniel.lordoftheringsbd.Services;

import java.util.List;

import edu.daniel.lordoftheringsbd.entities.Personaje;

public interface IPersonajesService {

    public List<Personaje> conseguirPersonajes();
    public Personaje conseguirPersonaje(Integer id);
    public void borrarPersonaje(Integer id);
    public Personaje guardarPersonaje(Personaje per);
    
    }
    