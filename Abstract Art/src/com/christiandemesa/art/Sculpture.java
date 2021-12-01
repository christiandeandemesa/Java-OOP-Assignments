package com.christiandemesa.art;

public class Sculpture extends Art {

	// Member variable
	private String material;
		
	// Constructor
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	// Abstract Method
	public void viewArt() {
		String sculpture = "";
		sculpture += String.format("Title: %s\n", getTitle());
		sculpture += String.format("Author: %s\n", getAuthor());
		sculpture += String.format("Description: %s\n", getDescription());
		sculpture += String.format("Material: %s\n", getMaterial());
		System.out.println(sculpture);
	}
		
	// material getter
	public String getMaterial() {
		return material;
	}
		
	// material setter
	public void setMaterial() {
		this.material = material;
	}
	
}
