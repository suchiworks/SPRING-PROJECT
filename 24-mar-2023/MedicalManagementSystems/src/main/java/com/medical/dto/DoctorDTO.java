package com.medical.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.medical.entity.Patient;

import lombok.Builder;
import lombok.Data;

@Data

@Builder
public class DoctorDTO {
	@NotBlank(message = "Invalid Doctor Name:Empty name")
	@NotNull(message = "Invalid doctor Name:name is null")
	private String doctor_name;
	@NotBlank(message = "Invalid specialization:Empty name")
	@NotNull(message = "Invalid specialization:name is null")
	private String Specialization;
	private long dcontact_no;
	private List<Patient> patient;

}
