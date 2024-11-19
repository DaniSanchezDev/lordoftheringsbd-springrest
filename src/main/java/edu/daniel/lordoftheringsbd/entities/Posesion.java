package edu.daniel.lordoftheringsbd.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "posesion")
public class Posesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosesion;

    @ManyToOne
    @JoinColumn(name = "idPersonaje")
    private Personaje idPersonaje;

    @ManyToOne
    @JoinColumn(name = "idArtefacto")
    private Artefacto idArtefacto;

    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Column(nullable = true)
    private LocalDate fechaFin;

    public Posesion() {
    }

    public Posesion(Personaje idPersonaje, Artefacto idArtefacto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idPersonaje = idPersonaje;
        this.idArtefacto = idArtefacto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Posesion(Long idPosesion, Personaje idPersonaje, Artefacto idArtefacto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idPosesion = idPosesion;
        this.idPersonaje = idPersonaje;
        this.idArtefacto = idArtefacto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getIdPosesion() {
        return idPosesion;
    }

    public void setIdPosesion(Long idPosesion) {
        this.idPosesion = idPosesion;
    }


    public Personaje getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Personaje idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public Artefacto getIdArtefacto() {
        return idArtefacto;
    }

    public void setIdArtefacto(Artefacto idArtefacto) {
        this.idArtefacto = idArtefacto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Posesion [idPosesion=" + idPosesion + ", idPersonaje=" + idPersonaje + ", idArtefacto=" + idArtefacto
                + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }

    
}
