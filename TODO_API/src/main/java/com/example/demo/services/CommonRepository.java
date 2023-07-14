package com.example.demo.services;

import java.util.HashSet;

import com.example.demo.model.ToDo;

public interface CommonRepository<T> {
	public HashSet<ToDo> findall();
	public HashSet<ToDo> save(T task);
	public void delete();
	public T findById(String id);
	public void update(T task);
	
}
