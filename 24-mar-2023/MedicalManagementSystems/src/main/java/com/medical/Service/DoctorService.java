package com.medical.Service;

import com.medical.dto.DoctorDTO;
import com.medical.entity.Doctor;

public interface DoctorService {
	Doctor addDoctor(DoctorDTO doctordto);

	Doctor getDoctorById(int id);

	Doctor update(Doctor doctor, int id);

	String delete(int id);
}
