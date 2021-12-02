package com.caresoft.clinicapp;

import java.util.*;
public class Physician extends User implements HIPAACompliantUser {
    
	// Member variable
    private ArrayList<String> patientNotes = new ArrayList<String>();
	
    // Constructor
    public Physician(int id) {
    	super();
    	this.id = id;
    }
    
    // Interface method signatures
    
    // Pin must be exactly 4 digits, returns false if not
    public boolean assignPin(int pin) {
    	int length = String.valueOf(pin).length();
    	if(length != 4) {
    		System.out.println("Please choose a 4 digit pin number");
    		return false;
    	}
    	else {
    		this.pin = pin;
    		return true;
    	}
    }
    
    // Checks the physician's id against the given id
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(confirmedAuthID == this.id) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
    // Methods
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

}
