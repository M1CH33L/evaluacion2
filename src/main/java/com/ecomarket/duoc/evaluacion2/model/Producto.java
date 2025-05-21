package com.ecomarket.duoc.evaluacion2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name= "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private Integer cantidad;
}
