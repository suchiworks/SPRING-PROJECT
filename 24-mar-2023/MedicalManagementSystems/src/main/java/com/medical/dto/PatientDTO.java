package com.medical.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.medical.entity.Doctor;

import lombok.Builder;
import lombok.Data;

@Data

@Builder
public class PatientDTO {
	@NotBlank(message = "Invalid patient Name:Empty name")
	@NotNull(message = "Invalid patient Name:name is null")
	private String patient_name;
	@Size(max = 6, message = "gender should be maximum 6 characters")
	private String gender;
	@Size(max = 3, message = "bloodGroup should be maximum 3 characters")
	private String bloodGroup;
	@NotBlank(message = "Invalid Idnumber:Empty Idnumber")
	@NotNull(message = "Invalid Idnumber:Idnumber is null")
	@Size(min = 12, max = 12, message = "Idnumber should be of 12 characters")
	private String Idnumber;
	private long pcontact_no;
	private int age;
	private String insuranceavailable;
	private Doctor doctor;

}
