package com.kosmos.medicina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kosmos.medicina.models.entity.Consultorio;

public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {
}