package com.kosmos.medicina.models.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "consultorio_id", nullable = false)
    private Consultorio consultorio;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @Column(nullable = false)
    private LocalDateTime horarioConsulta;

    @Column(nullable = false)
    private String nombrePaciente;

	public Long getId() {
		return id;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public LocalDateTime getHorarioConsulta() {
		return horarioConsulta;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void setHorarioConsulta(LocalDateTime horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
    
    

}