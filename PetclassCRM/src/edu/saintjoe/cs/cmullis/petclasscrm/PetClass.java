package edu.saintjoe.cs.cmullis.petclasscrm;

// Coded by Collin Mullis 5/ 4/ 2015

// Class for Capouch's Pet
public class PetClass {
	
	private String name;
	private int birthYear;
	private int petClass; // 1 = dog 2 = cat 3 = parakeet, etc.
	private String favoriteTrick;
	
/*------------------------------------------------------------------------*/
	
	
	public PetClass() {
	
		name = "None";
		birthYear = 0;
		favoriteTrick = "None";
	}
	
	public PetClass(String thisName, int thisYear, String thisTrick) {
		
		name = thisName;
		birthYear = thisYear;
		favoriteTrick = thisTrick;
	}
	
	public PetClass(String thisName, int thisYear) {
		this();
		name = thisName;
		birthYear = thisYear;
	}
	
	public PetClass(String thisName) {
		this();
		name = thisName;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return birthYear;
	}
	
	public String getTrick() {
		return favoriteTrick;
	}
	
	public String setTrick(String newTrick) {
		String oldTrick = favoriteTrick;
		favoriteTrick = newTrick;
		return oldTrick;
	}

	public String toString() {
		return "Name: " + name + " Birth Year: " + birthYear + " Favorite Trick: " + favoriteTrick;
	}
}
