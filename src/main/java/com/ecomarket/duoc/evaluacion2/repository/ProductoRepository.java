package com.ecomarket.duoc.evaluacion2.repository;

import com.ecomarket.duoc.evaluacion2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query(value = "SELECT p FROM producto Where nombre=:nombre", nativeQuery = true)
    List<Producto>buscarPorMarca(@Param("marca")String marca);

    @Query(value = "SELECT * FROM producto Where marca=:marca",nativeQuery = true)
    Producto buscarPorValor(@Param("marca")String marca);

    List<Producto>buscarPorNombreyMarca(String nombre,String marca);

}
