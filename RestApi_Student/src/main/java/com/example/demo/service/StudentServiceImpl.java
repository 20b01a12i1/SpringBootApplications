package com.example.demo.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	HashSet<Student> hs=new HashSet();

	@Override
	public HashSet<Student> getallStu() {
		// TODO Auto-generated method stub
		if(!hs.isEmpty()) {
			return hs;
		}
		return null;
	}

	@Override
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		hs.add(st);

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		hs.clear();

	}

//	@Override
//	public void deleteStuid(String sid) {
//		// TODO Auto-generated method stub
//		
//
//	}

	@Override
	public Student getStudent(String sid) {
		// TODO Auto-generated method stub
		Student s=hs.stream().filter((obj)-> obj.getSid().equals(sid)).findAny().orElse(null);
		return s;
	}

}
