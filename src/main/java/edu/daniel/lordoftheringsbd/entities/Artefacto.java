package edu.daniel.lordoftheringsbd.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.daniel.lordoftheringsbd.entities.enumerated.Tipo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @OneToMany(mappedBy = "idArtefacto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Posesion> listaPosesiones;


    public Artefacto() {
    }


    public Artefacto(Long idArtefacto, String nombre, Tipo tipo) {
        this.idArtefacto = idArtefacto;
        this.nombre = nombre;
        this.tipo = tipo;
    }

       
    public Artefacto(Long idArtefacto, String nombre, Tipo tipo, List<Posesion> listaPosesiones) {
        this.idArtefacto = idArtefacto;
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaPosesiones = listaPosesiones;
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


    public List<Posesion> getListaPosesiones() {
        return listaPosesiones;
    }


    public void setListaPosesiones(List<Posesion> listaPosesiones) {
        this.listaPosesiones = listaPosesiones;
    }


    @Override
    public String toString() {
        return "Artefacto [idArtefacto=" + idArtefacto + ", nombre=" + nombre + ", tipo=" + tipo + "]";
    }

}
