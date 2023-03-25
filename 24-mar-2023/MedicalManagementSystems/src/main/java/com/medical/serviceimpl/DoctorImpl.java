package com.medical.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.Service.DoctorService;
import com.medical.dto.DoctorDTO;
import com.medical.entity.Doctor;
import com.medical.repository.DoctorRepository;

@Service
public class DoctorImpl implements DoctorService {
	@Autowired
	private DoctorRepository doctorrepository;

	public Doctor addDoctor(DoctorDTO doctordto) {
		Doctor doctor = Doctor.builder().doctor_name(doctordto.getDoctor_name())
				.Specialization(doctordto.getSpecialization()).dcontact_no(doctordto.getDcontact_no())
				.patient(doctordto.getPatient()).build();
		return doctorrepository.save(doctor);
	}

	@Override
	public Doctor getDoctorById(int id) {
		return doctorrepository.findById(id).get();
	}

	@Override
	public Doctor update(Doctor doctor, int id) {
		Doctor _doctor = doctorrepository.findById(id).get();
		_doctor.setDoctor_name(doctor.getDoctor_name());
		_doctor.setSpecialization(doctor.getSpecialization());
		_doctor.setDcontact_no(doctor.getDcontact_no());
		return doctorrepository.save(_doctor);
	}

	@Override
	public String delete(int id) {
		doctorrepository.deleteById(id);
		return "The doctor with id " + id + " has left!!";
	}
}
