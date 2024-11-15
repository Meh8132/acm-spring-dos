package udistrital.restAPI.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private int anoPublicacion;
    private boolean disponible;
    private String descripcion;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Autor autor;

    @OneToMany(mappedBy = "libro")
    private Set<LibroPrestamo> prestamos;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Set<LibroPrestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<LibroPrestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
