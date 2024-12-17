package com.example.almacenapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Almacen")
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String domicilio;
    private Double latitud;
    private Double longitud;
    private Boolean camaraRefrigeracion;
    private Double capacidadM2;
    private Double capacidadM3;
    private Integer posicionesCarga;
    private String tipoVehiculo;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Boolean getCamaraRefrigeracion() {
        return camaraRefrigeracion;
    }

    public void setCamaraRefrigeracion(Boolean camaraRefrigeracion) {
        this.camaraRefrigeracion = camaraRefrigeracion;
    }

    public Double getCapacidadM2() {
        return capacidadM2;
    }

    public void setCapacidadM2(Double capacidadM2) {
        this.capacidadM2 = capacidadM2;
    }

    public Double getCapacidadM3() {
        return capacidadM3;
    }

    public void setCapacidadM3(Double capacidadM3) {
        this.capacidadM3 = capacidadM3;
    }

    public Integer getPosicionesCarga() {
        return posicionesCarga;
    }

    public void setPosicionesCarga(Integer posicionesCarga) {
        this.posicionesCarga = posicionesCarga;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}


