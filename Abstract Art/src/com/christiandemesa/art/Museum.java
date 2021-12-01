package com.christiandemesa.art;

import java.util.*;
public class Museum {
	public static void main(String[] args) {
		
		// Member variable
		ArrayList<Art> museum = new ArrayList<Art>();
		
		// Create 3 paintings
		Painting painting1 = new Painting("Happy Family", "James Demesa", "I put it on my fridge", "Crayon");
		Painting painting2 = new Painting("Squiggly Lines", "Mateo Demesa", "It's drying in the kitchen", "Watercolor");
		Painting painting3 = new Painting("Mona Lisa", "Leonardo DaVinci", "It's not as good as the other paintings...", "Oil");
		
		// Create 2 sculptures
		Sculpture sculpture1 = new Sculpture("Fake Breakfast", "James Demesa", "I almost ate it!", "Play-doh");
		Sculpture sculpture2 = new Sculpture("Mud Pie", "Mateo Demesa", "I did eat this one...", "Mud");
		
		// Store paintings and sculptures in the museum array
		museum.add(painting1);
		museum.add(painting2);
		museum.add(painting3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		
		// View all the art in the museum in a random order
		// Import Collections with java.util.Collections or java.util.*
		// shuffle() randomizes the order of the given array (e.g. museum)
		Collections.shuffle(museum);
		
		for(Art a: museum) {
			a.viewArt();
		}
		
	}
}
