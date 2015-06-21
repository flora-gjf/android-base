package com.example.fruit;

public class Fruit {
	
	String name ;
	String color;
	String taste;
	
	public Fruit(String name, String color, String taste) {
		super();
		this.name = name;
		this.color = color;
		this.taste = taste;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	@Override
	public String toString() {

		return name;
	}
	

}
