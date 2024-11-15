package udistrital.restAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private LocalDateTime fechaInicioPrestamo;
    private LocalDateTime fechaFinPrestamo;

    @OneToMany(mappedBy = "prestamo")
    private Set<LibroPrestamo> libros;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public LocalDateTime getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }
    public void setFechaInicioPrestamo(LocalDateTime fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }
    public LocalDateTime getFechaFinPrestamo() {
        return fechaFinPrestamo;
    }
    public void setFechaFinPrestamo(LocalDateTime fechaFinPrestamo) {
        this.fechaFinPrestamo = fechaFinPrestamo;
    }
    public Set<LibroPrestamo> getLibros() {
        return libros;
    }
    public void setLibros(Set<LibroPrestamo> libros) {
        this.libros = libros;
    }
}
