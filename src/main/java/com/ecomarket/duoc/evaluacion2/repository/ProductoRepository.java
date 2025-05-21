package com.ecomarket.duoc.evaluacion2.repository;

import com.ecomarket.duoc.evaluacion2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
