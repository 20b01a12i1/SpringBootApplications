package com.example.faculty.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.faculty.model.Faculty;
import com.example.faculty.service.FacultyServiceImpl;

@RestController
public class FacultyController {

	@Autowired
	FacultyServiceImpl facultyservice;
	
	@PostMapping("/add")
	public String addFaculty(@RequestBody Faculty f) {
		facultyservice.createFaculty(f);
		return "Added Successfully!";
	}
	@DeleteMapping("/del/{id}")
	public String removeFaculty(@PathVariable String id) {
		facultyservice.deleteFaculty(id);
		return "Deleted successfully";
	}
	@GetMapping("/get/{id}")
	public Optional<Faculty> findFaculty(@PathVariable String id){
		return facultyservice.getFacultyById(id);
	}
	@GetMapping("/")
	public List<Faculty> findall(){
		return facultyservice.getAll();
	}
}
