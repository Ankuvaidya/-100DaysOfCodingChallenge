package com.covid.covidDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private String name;
	private String dob;
	private int zipcode;
	private String location;

}
