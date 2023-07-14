package com.example.demo.services;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.example.demo.model.ToDo;

@Service
public class ToDoRepository implements CommonRepository<ToDo> {

	HashSet<ToDo> hs=new HashSet();
	
	@Override
	public HashSet<ToDo> findall() {
		// TODO Auto-generated method stub
		if(hs.isEmpty()) {
			return null;
		}
		return hs;
	}
	
	@Override
	public HashSet<ToDo> save(ToDo task) {
		// TODO Auto-generated method stub
		hs.add(task);
		return hs;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		hs.clear();
		
	}

	@Override
	public ToDo findById(String id) {
		// TODO Auto-generated method stub
		ToDo t=hs.stream().filter((obj)-> obj.getId().equals(id)).findAny().orElse(null);
		return t;
	}

	@Override
	public void update(ToDo task) {
		// TODO Auto-generated method stub
		ToDo old = hs.stream().filter((obj)-> obj.getId().equals(task.getId())).findAny().orElse(null);		
		if(old!=null) {
			old.setDescription(task.getDescription());
			old.setCompleted(task.getCompleted());
			old.setCreated(task.getCreated());
		}
	}

	

}
