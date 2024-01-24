package com.kosmos.medicina.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.medicina.models.entity.Consultorio;
import com.kosmos.medicina.repository.ConsultorioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultorioService {

    private final ConsultorioRepository consultorioRepository;

    @Autowired
    public ConsultorioService(ConsultorioRepository consultorioRepository) {
        this.consultorioRepository = consultorioRepository;
    }

    public List<Consultorio> obtenerTodosLosConsultorios() {
        return consultorioRepository.findAll();
    }

    public Optional<Consultorio> obtenerConsultorioPorId(Long id) {
        return consultorioRepository.findById(id);
    }

    public Consultorio crearConsultorio(Consultorio consultorio) {
        return consultorioRepository.save(consultorio);
    }

    public Consultorio actualizarConsultorio(Long id, Consultorio consultorioActualizado) {
        Optional<Consultorio> consultorioExistente = consultorioRepository.findById(id);
        
        if (consultorioExistente.isPresent()) {
            Consultorio consultorio = consultorioExistente.get();
            consultorio.setNumeroConsultorio(consultorioActualizado.getNumeroConsultorio());
            consultorio.setPiso(consultorioActualizado.getPiso());
            return consultorioRepository.save(consultorio);
        } else {
            return null;
        }
    }

    public void eliminarConsultorio(Long id) {
        consultorioRepository.deleteById(id);
    }

}