package com.zach.worldcities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

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
	}
}
