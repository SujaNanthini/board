package com.board.entity;

import jakarta.annotation.Generated;


public class Board {
	private String brand;
	public Board() { //constructor
		System.out.println("board called");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}


}
