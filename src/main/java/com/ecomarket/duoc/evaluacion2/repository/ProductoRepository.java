package com.ecomarket.duoc.evaluacion2.repository;

import com.ecomarket.duoc.evaluacion2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto>findByNombre(String nombre);

    Producto findByMarca(String marca);

    List<Producto>findByNombreyMarca(String nombre,String marca);

}
