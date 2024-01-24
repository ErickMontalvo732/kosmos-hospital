package com.kosmos.medicina.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.medicina.models.entity.Doctor;
import com.kosmos.medicina.repository.DoctorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> obtenerTodosLosDoctores() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> obtenerDoctorPorId(Long id) {
        return doctorRepository.findById(id);
    }

    public Doctor crearDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor actualizarDoctor(Long id, Doctor doctorActualizado) {
        Optional<Doctor> doctorExistente = doctorRepository.findById(id);
        
        if (doctorExistente.isPresent()) {
            Doctor doctor = doctorExistente.get();
            doctor.setNombre(doctorActualizado.getNombre());
            doctor.setApellidoPaterno(doctorActualizado.getApellidoPaterno());
            doctor.setApellidoMaterno(doctorActualizado.getApellidoMaterno());
            doctor.setEspecialidad(doctorActualizado.getEspecialidad());
            return doctorRepository.save(doctor);
        } else {
            return null;
        }
    }

    public void eliminarDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}