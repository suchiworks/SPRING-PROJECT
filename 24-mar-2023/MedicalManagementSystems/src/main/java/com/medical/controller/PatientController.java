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

import com.medical.Service.PatientService;
import com.medical.dto.PatientDTO;
import com.medical.entity.Patient;

@RestController
@RequestMapping(value = "/api")
public class PatientController {
	@Autowired
	private PatientService patientservice;

	@GetMapping("/patient/{id}")
	public Patient getPatientById(@PathVariable int id) {
		return patientservice.getPatientById(id);
	}

	@PostMapping("/patient")
	public ResponseEntity<Patient> addNewPatient(@RequestBody @Valid PatientDTO patientdto) {
		return new ResponseEntity<>(patientservice.addNewPatient(patientdto), HttpStatus.CREATED);
	}

	@PutMapping("/patient/{id}")
	public Patient updatePatient(@PathVariable int id, @RequestBody Patient patient) {
		return patientservice.update(patient, id);
	}

	@DeleteMapping("/patient/{id}")
	public String deletePatient(@PathVariable int id) {
		return patientservice.delete(id);
	}
}
