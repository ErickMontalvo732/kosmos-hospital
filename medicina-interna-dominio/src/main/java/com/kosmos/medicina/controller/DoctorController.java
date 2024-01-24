package com.kosmos.medicina.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kosmos.medicina.models.entity.Doctor;
import com.kosmos.medicina.service.DoctorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctores")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<Doctor> obtenerTodosLosDoctores() {
        return doctorService.obtenerTodosLosDoctores();
    }

    @GetMapping("/{id}")
    public Optional<Doctor> obtenerDoctorPorId(@PathVariable Long id) {
        return doctorService.obtenerDoctorPorId(id);
    }

    @PostMapping
    public Doctor crearDoctor(@RequestBody Doctor doctor) {
        return doctorService.crearDoctor(doctor);
    }

    @PutMapping("/{id}")
    public Doctor actualizarDoctor(@PathVariable Long id, @RequestBody Doctor doctorActualizado) {
        return doctorService.actualizarDoctor(id, doctorActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarDoctor(@PathVariable Long id) {
        doctorService.eliminarDoctor(id);
    }
}
