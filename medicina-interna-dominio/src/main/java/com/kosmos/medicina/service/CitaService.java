package com.kosmos.medicina.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.medicina.models.entity.Cita;
import com.kosmos.medicina.repository.CitaRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CitaService {

    private final CitaRepository citaRepository;

    @Autowired
    public CitaService(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public List<Cita> obtenerTodasLasCitas() {
        return citaRepository.findAll();
    }

    public Optional<Cita> obtenerCitaPorId(Long id) {
        return citaRepository.findById(id);
    }

    public Cita crearCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public Cita actualizarCita(Long id, Cita citaActualizada) {
        Optional<Cita> citaExistente = citaRepository.findById(id);
        
        if (citaExistente.isPresent()) {
            Cita cita = citaExistente.get();
            cita.setConsultorio(citaActualizada.getConsultorio());
            cita.setDoctor(citaActualizada.getDoctor());
            cita.setHorarioConsulta(citaActualizada.getHorarioConsulta());
            cita.setNombrePaciente(citaActualizada.getNombrePaciente());
            return citaRepository.save(cita);
        } else {
            return null;
        }
    }

    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }
}