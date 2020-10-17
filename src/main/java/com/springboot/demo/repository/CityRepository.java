package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	 


}
