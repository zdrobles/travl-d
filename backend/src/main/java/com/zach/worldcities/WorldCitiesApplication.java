package com.zach.worldcities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import com.zach.worldcities.model.City;

import java.util.List;

@SpringBootApplication
public class WorldCitiesApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(WorldCitiesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO users (firstName, lastName, email) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, "Zach", "Robles", "zrobles@gmail.com");
		String sql2 = "SELECT city_ascii, country FROM worldcities WHERE country='Qatar';";
		List<City> cities = jdbcTemplate.query(sql2, (rs, rowNum) -> 
						new City(
								rs.getString("city_ascii"),
								rs.getString("country")
						)
					);
		for (City c : cities){
			System.out.println(String.format("%s, %s", c.name, c.country));
		}
	}
}
