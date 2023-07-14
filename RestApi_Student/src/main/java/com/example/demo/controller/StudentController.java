package com.example.demo.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService stuservice;
	
	@GetMapping("/")
	public HashSet<Student> getall(){
		HashSet<Student> data = stuservice.getallStu();
		return data;
	}
	@PostMapping("/addstudent")
	public void addstu(@RequestBody Student st) {
		stuservice.addStudent(st);
	}
	@PostMapping("/delall")
	public void delall() {
		stuservice.deleteAll();
	}
	@GetMapping("/getsid/{sid}")
	public Student getstid(@PathVariable String sid) {
		return stuservice.getStudent(sid);
	}

}
