package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.entity.Board;

@RestController
public class BoardController {
	@Autowired
	ApplicationContext ap;
	@GetMapping("/msg")
	public String getMsg() {
		Board b1 = ap.getBean(Board.class);
		b1.setBrand("Camel");
		System.out.println(b1.getBrand());
		Board b2 = ap.getBean(Board.class);
		System.out.println(b2.getBrand());
		Board b3 = ap.getBean(Board.class);
		b3.setBrand("Camelin");
		System.out.println(b3.getBrand());
		return "Done";
	}
	@Bean
    @Scope("prototype")  // prototypeku endpointya ovaru timeum 
	Board allowBoard() {
		return new Board();
	}

}
