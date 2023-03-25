package com.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
