package com.medical.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.Service.DoctorService;
import com.medical.dto.DoctorDTO;
import com.medical.entity.Doctor;

@RestController
@RequestMapping(value = "/doctordetails")
public class DoctorController {
	@Autowired
	private DoctorService doctorservice;

	@GetMapping("/doctor/{id}")
	public Doctor getDoctorById(@PathVariable int id) {
		return doctorservice.getDoctorById(id);
	}

	@PostMapping("/doctor")
	public ResponseEntity<Doctor> addDoctor(@RequestBody @Valid DoctorDTO doctordto) {
		return new ResponseEntity<>(doctorservice.addDoctor(doctordto), HttpStatus.CREATED);
	}

	@PutMapping("/doctor/{id}")
	public Doctor updateDoctor(@PathVariable int id, @RequestBody Doctor doctor) {
		return doctorservice.update(doctor, id);
	}

	@DeleteMapping("/doctor/{id}")
	public String deleteDoctor(@PathVariable int id) {
		return doctorservice.delete(id);
	}
}
