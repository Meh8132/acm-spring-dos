package udistrital.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udistrital.restAPI.model.Autor;
import udistrital.restAPI.model.Categoria;
import udistrital.restAPI.model.Libro;
import udistrital.restAPI.model.Prestamo;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByCategoria(Categoria categoria);

    List<Libro> findByAutor(Autor autor);

    List<Libro> findByPrestamos_Prestamo(Prestamo prestamo);
}
