package com.weather.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weather_report")
public class WeatherReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "city")
	private String city;
	@Column(name = "min_temperature")
	private Double minTemperature;
	@Column(name = "max_temperature")
	private Double maxTemperature;
	
	public WeatherReport() {}

	public WeatherReport(Long id, String city, Double minTemperature, Double maxTemperature) {
		super();
		this.id = id;
		this.city = city;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(Double minTemperature) {
		this.minTemperature = minTemperature;
	}

	public Double getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(Double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	
}

