package com.kosmos.medicina.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosmos.medicina.models.entity.Consultorio;
import com.kosmos.medicina.service.ConsultorioService;

@RestController
@RequestMapping("/consultorios")
public class ConsultorioController {

    private final ConsultorioService consultorioService;

    @Autowired
    public ConsultorioController(ConsultorioService consultorioService) {
        this.consultorioService = consultorioService;
    }

    @GetMapping
    public List<Consultorio> obtenerTodosLosConsultorios() {
        return consultorioService.obtenerTodosLosConsultorios();
    }

    @GetMapping("/{id}")
    public Optional<Consultorio> obtenerConsultorioPorId(@PathVariable Long id) {
        return consultorioService.obtenerConsultorioPorId(id);
    }

    @PostMapping
    public Consultorio crearConsultorio(@RequestBody Consultorio consultorio) {
        return consultorioService.crearConsultorio(consultorio);
    }

    @PutMapping("/{id}")
    public Consultorio actualizarConsultorio(@PathVariable Long id, @RequestBody Consultorio consultorioActualizado) {
        return consultorioService.actualizarConsultorio(id, consultorioActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarConsultorio(@PathVariable Long id) {
        consultorioService.eliminarConsultorio(id);
    }
}