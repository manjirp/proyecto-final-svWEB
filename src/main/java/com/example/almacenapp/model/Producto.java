package com.example.almacenapp.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String upc; // Código Universal del Producto

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private BigDecimal ultimoCosto;

    @Column(nullable = false)
    private BigDecimal ultimoPrecio;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getUltimoCosto() {
        return ultimoCosto;
    }

    public void setUltimoCosto(BigDecimal ultimoCosto) {
        this.ultimoCosto = ultimoCosto;
    }

    public BigDecimal getUltimoPrecio() {
        return ultimoPrecio;
    }

    public void setUltimoPrecio(BigDecimal ultimoPrecio) {
        this.ultimoPrecio = ultimoPrecio;
    }
}

