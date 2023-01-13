package com.zach.worldcities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
	public String name;
	private int latitude;
	private int longitude;
	public String country;
	private int population;
	private int id;
	
	public City(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
}
