package edu.daniel.lordoftheringsbd.Services;

import java.util.List;

import edu.daniel.lordoftheringsbd.entities.Personaje;
import edu.daniel.lordoftheringsbd.entities.Posesion;

public interface IPosesionService {
    public List<Posesion> buscarTodos();

    public Posesion findById(Integer id);

    public void borrarPosesion(Integer id);

    public Posesion guardarPosesion(Posesion pos);

}
