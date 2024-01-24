package com.kosmos.medicina.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consultorio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer numeroConsultorio;

    @Column(nullable = false)
    private Integer piso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(Integer numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}
    
    
}
