package com.covid.covidDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.covid.covidDemo.model.Person;

@Service
public class CovidService {

	public List<Person> getPerson() {
		// TODO Auto-generated method stub
		Person p1= new Person("XYZ", "1982-07-21", 400037, "Virar");
		Person p2= new Person("ABC", "1982-09-21", 400037, "Virar");
		List <Person> persons= new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		
		return persons;
	}
	

}
