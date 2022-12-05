package com.francisco.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HumanController {

//	@RequestMapping(value="/", method = RequestMethod.GET)
//	public String hello() {
//		return "Hello Human";
//	}
	@GetMapping("/")
	public String hello() {
		return "Hello Human";
	}
	
	@GetMapping("/name")
	public String name(@RequestParam(value="name", required =false) String name, @RequestParam(value="last_name", required =false) String lastName){
		return "Hello " + lastName + "!";
	}

}
