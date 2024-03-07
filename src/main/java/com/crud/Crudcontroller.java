package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Crudcontroller {
	@Autowired
	//create
	Crudservice cs;
	@PostMapping(value="/post")
	public String post(@RequestBody List<Cruds> a) {
		return cs.post(a);
	}
   //read
	@GetMapping(value="/get")
	public List<Cruds> get(){
		return cs.get();
	}
	//update
	@PutMapping(value="/put/{a}")
	public String put(@PathVariable int a,@RequestBody Cruds c) {
		return cs.put(a,c);
	}
	//delete
	@DeleteMapping(value="/delete")
	public String  delete(@RequestBody Cruds c) {
		return cs.delete(c);
	}
}
