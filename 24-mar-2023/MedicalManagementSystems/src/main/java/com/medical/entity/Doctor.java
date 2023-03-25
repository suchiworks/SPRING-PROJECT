package com.medical.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "Doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doctor_id")
	private int doctorId;
	@Column(name = "doctor_name")
	private String doctor_name;
	@Column(name = "Specialization")
	private String Specialization;
	@Column(name = "Contact_no")
	private long dcontact_no;

	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<Patient> patient;
}