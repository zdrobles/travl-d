package com.zach.worldcities.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityVisit {
	@Id
	private int id;
	private int userId;
	private int locationId;
}
