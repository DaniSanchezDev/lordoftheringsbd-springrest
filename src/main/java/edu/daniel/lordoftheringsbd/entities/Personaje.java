package edu.daniel.lordoftheringsbd.entities;

import edu.daniel.lordoftheringsbd.entities.enumerated.Alianza;
import edu.daniel.lordoftheringsbd.entities.enumerated.Raza;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonaje;
    @Column(length = 75, nullable = false, unique = true)
    private String nombre;
    @Column(nullable = false)
    private Raza raza;
    @Column(nullable = false)
    private Alianza alianza;


    
    public Personaje() {
    }


    
    public Personaje(Long idPersonaje, String nombre, Raza raza, Alianza alianza) {
        this.idPersonaje = idPersonaje;
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



    @Override
    public String toString() {
        return "Personaje [idPersonaje=" + idPersonaje + ", nombre=" + nombre + ", raza=" + raza + ", alianza="
                + alianza + "]";
    }


    

}
