package fr.eni.ecole.pokeBattle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// The @Controller annotation explains to Spring that this class is going to manage data between DataBase and Client
@Controller("/")
public class HomeController {

	// The @RequestMapping annotation explains to Spring that this method will be launched upon accessing website.com/*****
	@RequestMapping
	public String welcome() {
		return "home";
	}
}
