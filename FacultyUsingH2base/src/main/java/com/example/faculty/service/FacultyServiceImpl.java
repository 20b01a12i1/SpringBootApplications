package com.example.faculty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.faculty.model.Faculty;
import com.example.faculty.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	FacultyRepository facultyrepo;

	@Override
	public void createFaculty(Faculty f) {
		// TODO Auto-generated method stub
		facultyrepo.save(f);

	}

	@Override
	public void deleteFaculty(String id) {
		// TODO Auto-generated method stub
		facultyrepo.deleteById(Long.parseLong(id));

	}

	@Override
	public Optional<Faculty> getFacultyById(String id) {
		// TODO Auto-generated method stub
		return facultyrepo.findById(Long.parseLong(id));
	}

	@Override
	public List<Faculty> getAll() {
		// TODO Auto-generated method stub
		return facultyrepo.findAll();
	}

}
