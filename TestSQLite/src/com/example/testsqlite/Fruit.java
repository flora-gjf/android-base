package com.example.testsqlite;

public class Fruit {
	
	private int id;
	private String name ;
	private String color;
	private String taste;
	
	public Fruit() {
		super();

	}
	
	public Fruit(int id, String name, String color, String taste) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.taste = taste;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
