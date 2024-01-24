package com.kosmos.medicina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kosmos.medicina.models.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}