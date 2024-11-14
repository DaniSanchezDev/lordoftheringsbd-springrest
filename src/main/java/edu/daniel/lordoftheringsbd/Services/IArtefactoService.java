package edu.daniel.lordoftheringsbd.Services;

import java.util.List;

import edu.daniel.lordoftheringsbd.entities.Artefacto;

public interface IArtefactoService {
    public List<Artefacto> getArtefactos();

    public Artefacto findById(Integer id);
}
