package com.kosmos.medicina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kosmos.medicina.models.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long> {
}