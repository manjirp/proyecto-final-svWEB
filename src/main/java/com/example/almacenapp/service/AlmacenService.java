package com.example.almacenapp.service;

import com.example.almacenapp.model.Almacen;
import com.example.almacenapp.repository.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlmacenService {

    @Autowired
    private AlmacenRepository almacenRepository;

    // Obtener todos los almacenes
    public List<Almacen> findAll() {
        return almacenRepository.findAll();
    }

    // Obtener un almacén por ID
    public Optional<Almacen> findById(Long id) {
        return almacenRepository.findById(id);
    }

    // Guardar o actualizar un almacén
    public Almacen save(Almacen almacen) {
        return almacenRepository.save(almacen);
    }

    // Eliminar un almacén por ID (eliminación lógica)
    public void deleteById(Long id) {
        almacenRepository.deleteById(id);
    }
}

