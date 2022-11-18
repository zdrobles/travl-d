package com.zach.worldcities.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
}
