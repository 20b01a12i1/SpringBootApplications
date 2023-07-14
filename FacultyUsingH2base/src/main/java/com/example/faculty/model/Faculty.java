package com.example.faculty.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Faculty {
	
	@Id
	@GeneratedValue
	long fid;
	String fname;
	String branch;

}
