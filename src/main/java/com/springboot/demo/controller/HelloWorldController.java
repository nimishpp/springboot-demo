package com.springboot.demo.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.City;
import com.springboot.demo.repository.CityRepository;



@RestController
public class HelloWorldController {

	@Autowired
	CityRepository cityRepository;
	
	  	@GetMapping("/test")
	    public List<City> sayHello() {
	  		 List<City> city = cityRepository.findAll();
	  		 for (Iterator iterator = city.iterator(); iterator.hasNext();) {
				City city2 = (City) iterator.next();
				System.out.println(city2.getName());
				
			}
	        return city;
	    }
}
