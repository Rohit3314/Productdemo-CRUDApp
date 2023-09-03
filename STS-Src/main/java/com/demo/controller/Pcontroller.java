package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.repository.Prespository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Pcontroller
{

	@Autowired
	private Prespository prepo;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertrecord")
	public Product insertrecord(@RequestBody Product p1)
	{
		return this.prepo.save(p1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updaterecord")
	public Product updaterecord(@RequestBody Product p1)
	{
		return this.prepo.save(p1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/deleterecord")
	public void deleterecord(@RequestBody Product p1)
	{
		this.prepo.delete(p1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/viewrecord")
	public List<Product> viewrecord()
	{
		return this.prepo.findAll();
	}	
	
}
