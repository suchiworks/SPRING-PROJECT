package com.medical;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medical.entity.Doctor;
import com.medical.entity.Patient;
import com.medical.repository.DoctorRepository;
import com.medical.repository.PatientRepository;

@SpringBootApplication
public class MedicalManagementSystemsApplication implements CommandLineRunner {
	@Autowired
	private DoctorRepository doctorrepository;
	@Autowired
	private PatientRepository patientrepository;

	public static void main(String[] args) {
		SpringApplication.run(MedicalManagementSystemsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Doctor Object 1.
		Doctor d1 = Doctor.builder().doctor_name("Chirag Basu").Specialization("Psychiatist").dcontact_no(7865432198l)
				.build();
		Patient p1 = Patient.builder().patient_name("Shivam Roy").age(21).gender("male").bloodGroup("o+")
				.pcontact_no(6543218765l).Idnumber("231454362187").insuranceavailable("yes").doctor(d1).build();

		Patient p2 = Patient.builder().patient_name("Shivam Das").age(21).gender("male").bloodGroup("A+")
				.pcontact_no(7893218765l).Idnumber("891454362187").insuranceavailable("yes").doctor(d1).build();

		d1.setPatient(Arrays.asList(p1, p2));
		doctorrepository.save(d1);

		// patientrepository.save(p1);
		// patientrepository.save(p2);
		System.out.println("-----All saved-----");

	}

}
