package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Cruddao {
@Autowired
Crudrepo cr;
//create
public String post(List<Cruds> a) {
	cr.saveAll(a);
	return "saved";
}
//read
public List<Cruds> get(){
	return cr.findAll();
}
//update
public String put(int a,Cruds c) {
	Cruds c1=cr.findById(a).get();
	c1.setName(c.getName());
	cr.save(c1);
	return "updated";
}
//delete
public String delete(Cruds c) {
	cr.deleteAll();
	return "deleted";
}
}
