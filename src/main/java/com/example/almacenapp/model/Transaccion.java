package com.example.almacenapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transaccion")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "almacen_id")
    private Almacen almacen;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private String motivo;
    private LocalDateTime fechaHora;
    private Integer cantidad;

    @Enumerated(EnumType.STRING)
    private TipoTransaccion tipoTransaccion;

    private Long destinoOrigenId; 
    private Long empleadoId;

    
    public enum TipoTransaccion {
        ENTRADA, SALIDA
    }

   
}
