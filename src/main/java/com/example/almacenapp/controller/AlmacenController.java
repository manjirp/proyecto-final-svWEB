package com.example.almacenapp.controller;

import com.example.almacenapp.model.Almacen;
import com.example.almacenapp.service.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/almacenes")
public class AlmacenController {

    @Autowired
    private AlmacenService almacenService;

    // Obtener todos los almacenes
    @GetMapping
    public List<Almacen> getAllAlmacenes() {
        return almacenService.findAll();
    }

    // Obtener un almacén por ID
    @GetMapping("/{id}")
    public ResponseEntity<Almacen> getAlmacenById(@PathVariable Long id) {
        Optional<Almacen> almacen = almacenService.findById(id);
        if (almacen.isPresent()) {
            return ResponseEntity.ok(almacen.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear un nuevo almacén
    @PostMapping
    public Almacen createAlmacen(@RequestBody Almacen almacen) {
        return almacenService.save(almacen);
    }

    // Actualizar un almacén existente
    @PutMapping("/{id}")
    public ResponseEntity<Almacen> updateAlmacen(@PathVariable Long id, @RequestBody Almacen almacenDetails) {
        Optional<Almacen> existingAlmacen = almacenService.findById(id);
        if (existingAlmacen.isPresent()) {
            Almacen updatedAlmacen = existingAlmacen.get();
            updatedAlmacen.setNombre(almacenDetails.getNombre());
            updatedAlmacen.setDomicilio(almacenDetails.getDomicilio());
            updatedAlmacen.setLatitud(almacenDetails.getLatitud());
            updatedAlmacen.setLongitud(almacenDetails.getLongitud());
            updatedAlmacen.setCamaraRefrigeracion(almacenDetails.getCamaraRefrigeracion());
            updatedAlmacen.setCapacidadM2(almacenDetails.getCapacidadM2());
            updatedAlmacen.setCapacidadM3(almacenDetails.getCapacidadM3());
            updatedAlmacen.setPosicionesCarga(almacenDetails.getPosicionesCarga());
            updatedAlmacen.setTipoVehiculo(almacenDetails.getTipoVehiculo());
            return ResponseEntity.ok(almacenService.save(updatedAlmacen));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un almacén por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlmacen(@PathVariable Long id) {
        if (almacenService.findById(id).isPresent()) {
            almacenService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
