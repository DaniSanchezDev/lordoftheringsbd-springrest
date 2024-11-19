package edu.daniel.lordoftheringsbd.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.daniel.lordoftheringsbd.entities.enumerated.Alianza;
import edu.daniel.lordoftheringsbd.entities.enumerated.Raza;
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
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonaje;
    @Column(length = 50, nullable = false, unique = true)
    private String nombre;
    @Column(nullable = false, columnDefinition = "Enum('HUMANO', 'MAIA', 'HOBBIT', 'ELFO', 'ORCO')")
    @Enumerated(EnumType.STRING)
    private Raza raza;
    @Column(nullable = false, columnDefinition = "Enum('LA_COMUNIDAD', 'MORDOR', 'ISENGARD', 'AVENTURERO')")
    @Enumerated(EnumType.STRING)
    private Alianza alianza;
    @OneToMany(mappedBy = "idPersonaje", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Posesion> listaPosesiones;
    

    public Personaje() {
    }
    
    public Personaje(Long idPersonaje, String nombre, Raza raza, Alianza alianza, List<Posesion> listaPosesiones) {
        this.idPersonaje = idPersonaje;
        this.nombre = nombre;
        this.raza = raza;
        this.alianza = alianza;
        this.listaPosesiones = listaPosesiones;
    }

    public Personaje(Long idPersonaje, String nombre, Raza raza, Alianza alianza) {
        this.idPersonaje = idPersonaje;
        this.nombre = nombre;
        this.raza = raza;
        this.alianza = alianza;
    }

    public Personaje(String nombre, Raza raza, Alianza alianza) {
        this.nombre = nombre;
        this.raza = raza;
        this.alianza = alianza;
    }



    public Long getIdPersonaje() {
        return idPersonaje;
    }
    public void setIdPersonaje(Long idPersonaje) {
        this.idPersonaje = idPersonaje;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Raza getRaza() {
        return raza;
    }
    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    public Alianza getAlianza() {
        return alianza;
    }
    public void setAlianza(Alianza alianza) {
        this.alianza = alianza;
    }

    public List<Posesion> getListaPosesiones() {
        return listaPosesiones;
    }

    public void setListaPosesiones(List<Posesion> listaPosesiones) {
        this.listaPosesiones = listaPosesiones;
    }


    @Override
    public String toString() {
        return "Personaje [idPersonaje=" + idPersonaje + ", nombre=" + nombre + ", raza=" + raza + ", alianza="
                + alianza + "]";
    }

    


    

}
