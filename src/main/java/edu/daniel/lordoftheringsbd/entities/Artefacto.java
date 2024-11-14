package edu.daniel.lordoftheringsbd.entities;

import edu.daniel.lordoftheringsbd.entities.enumerated.Tipo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artefactos")
public class Artefacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArtefacto;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING) // para guardar un enumerado como string
    private Tipo tipo;

    
    public Artefacto() {
    }


    public Artefacto(Long idArtefacto, String nombre, Tipo tipo) {
        this.idArtefacto = idArtefacto;
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public Long getIdArtefacto() {
        return idArtefacto;
    }


    public void setIdArtefacto(Long idArtefacto) {
        this.idArtefacto = idArtefacto;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Tipo getTipo() {
        return tipo;
    }


    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Artefacto [idArtefacto=" + idArtefacto + ", nombre=" + nombre + ", tipo=" + tipo + "]";
    }

    

}
