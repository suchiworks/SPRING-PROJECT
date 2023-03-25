package com.medical.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.Service.PatientService;
import com.medical.dto.PatientDTO;
import com.medical.entity.Patient;
import com.medical.repository.PatientRepository;

@Service
public class PatientImpl implements PatientService {
	@Autowired
	private PatientRepository patientrepository;

	public Patient addNewPatient(PatientDTO patientdto) {
		Patient patient = Patient.builder().patient_name(patientdto.getPatient_name()).age(patientdto.getAge())
				.bloodGroup(patientdto.getBloodGroup()).gender(patientdto.getGender())
				.pcontact_no(patientdto.getPcontact_no()).Idnumber(patientdto.getIdnumber())
				.insuranceavailable(patientdto.getInsuranceavailable()).doctor(patientdto.getDoctor()).build();
		return patientrepository.save(patient);
	}

	@Override
	public Patient getPatientById(int id) {
		return patientrepository.findById(id).get();
	}

	@Override
	public Patient update(Patient patient, int id) {
		Patient _patient = patientrepository.findById(id).get();
		_patient.setPatient_name(patient.getPatient_name());
		_patient.setAge(patient.getAge());
		_patient.setGender(patient.getGender());
		_patient.setBloodGroup(patient.getBloodGroup());
		_patient.setIdnumber(patient.getIdnumber());
		_patient.setInsuranceavailable(patient.getInsuranceavailable());
		return patientrepository.save(_patient);
	}

	@Override
	public String delete(int id) {
		patientrepository.deleteById(id);
		return "The patient with id " + id + " is deleted!!";
	}
}
