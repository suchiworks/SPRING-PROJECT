package com.medical.Service;

import com.medical.dto.PatientDTO;
import com.medical.entity.Patient;

public interface PatientService {
	Patient addNewPatient(PatientDTO patientdto);

	Patient getPatientById(int id);

	Patient update(Patient patient, int id);

	String delete(int id);

}
