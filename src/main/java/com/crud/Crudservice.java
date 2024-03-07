package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Crudservice {
@Autowired
Cruddao cd;
//create
public String post(List<Cruds> a) {
	return cd.post(a);
}
//read
public List<Cruds> get(){
	return cd.get();
}
//update
public String put(int a,Cruds c) {
	return cd.put(a,c);
}
//delete
public String delete(Cruds c) {
	return cd.delete(c);
}
}
