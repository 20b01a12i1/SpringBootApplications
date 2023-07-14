package com.example.faculty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.faculty.model.Faculty;


public interface FacultyService {
	public void createFaculty(Faculty f);
	public void deleteFaculty(String id);
	public Optional<Faculty> getFacultyById(String id);
	public List<Faculty> getAll();
}
