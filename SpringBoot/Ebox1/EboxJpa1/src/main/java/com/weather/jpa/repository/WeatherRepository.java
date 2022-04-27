package com.weather.jpa.repository;

import org.springframework.stereotype.Repository;
import com.weather.jpa.domain.WeatherReport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherReport, Long> {

}
