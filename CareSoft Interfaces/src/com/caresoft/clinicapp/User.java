package com.caresoft.clinicapp;

public class User {
	
	// Member variables
    protected Integer id;
    protected int pin;
    
    // Constructor
    public User() {
    }
    
    // Overloaded constructor
    public User(int id) {
    	this.id = id;
    }
    
    // id getter
    public int getId() {
    	return id;
    }
    
    // id setter
    public void setId() {
    	this.id = id;
    }
    
    // pin getter
    public int getPin() {
    	return pin;
    }
    
    // pin setter
    public void setPin() {
    	this.pin = pin;
    }
}