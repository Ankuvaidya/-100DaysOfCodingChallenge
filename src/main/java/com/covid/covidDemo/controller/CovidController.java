package com.covid.covidDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.covidDemo.model.Person;
import com.covid.covidDemo.service.CovidService;

@RestController

public class CovidController {
	@Autowired
	CovidService covidService;

	@GetMapping("/v1/api/covidcases")
	public List<Person> getPerson() {
		List<Person> person = covidService.getPerson();
		return person;

	}

	@GetMapping("/all")
	public String test() {
		return "welcome";
	}

}
