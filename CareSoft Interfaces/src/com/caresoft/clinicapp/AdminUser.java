package com.caresoft.clinicapp;

import java.util.*;
public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    
    // Member variables
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // Constructor
    public AdminUser(int employeeID, String role) {
    	super();
    	this.employeeID = employeeID;
    	this.role = role;
    }
    
    // Interface method signatures
    
    // Pin must be exactly 6 digits, returns false if not
    public boolean assignPin(int pin) {
    	int length = String.valueOf(pin).length();
    	if(length < 6) {
    		System.out.println("Please choose a pin number with at least 6 digits");
    		return false;
    	}
    	else {
    		this.pin = pin;
    		return true;
    	}
    }
    
    // Checks the admin user's id against the given id, and return an incident report if false
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(confirmedAuthID == this.employeeID) {
    		return true;
    	}
    	else {
    		authIncident();
    		return false;
    	}
    }
	
    // Returns a list of strings (incidents reported)
    public ArrayList<String> reportSecurityIncidents() {
    	return securityIncidents;
    }
    
    // Methods
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

}
