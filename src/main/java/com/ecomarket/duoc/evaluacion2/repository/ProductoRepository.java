package com.ecomarket.duoc.evaluacion2.repository;

import com.ecomarket.duoc.evaluacion2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Usando JPQL
    @Query("SELECT p FROM Producto p WHERE p.nombre = :nombre")
    List<Producto> buscarPorNombre(@Param("nombre") String nombre);

    // Usando SQL nativo
    @Query(value = "SELECT * FROM producto WHERE marca = :marca", nativeQuery = true)
    List<Producto> buscarPorMarca(@Param("marca") String marca);

    // Consulta derivada
    List<Producto> findByNombreAndMarca(String nombre, String marca);
}

