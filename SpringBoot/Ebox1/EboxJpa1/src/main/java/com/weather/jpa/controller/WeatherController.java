package com.weather.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;

@RestController
public class WeatherController {
    
	@Autowired
	private WeatherRepository rep;
	
	@GetMapping("/weatherReport")
	public List<WeatherReport> getData() {
		return rep.findAll();
	}
	
	@PostMapping("/weatherReport")
	public WeatherReport addWeatherReport(@RequestBody WeatherReport cases) {
		return rep.save(cases);
	}
	
	@PutMapping("/weatherReport")
	public WeatherReport updateWeatherReport(@RequestBody WeatherReport cases) {
		return rep.save(cases);
	}
    
    @GetMapping("/weatherReport")
	public Optional<WeatherReport> view(@PathVariable Long id) {
		return rep.findById(id);
	}
	
    @DeleteMapping("/weatherReport")
	public Object deleteUsers(@PathVariable Long id) {
		return rep.deleteById(id);
	}
	
}
