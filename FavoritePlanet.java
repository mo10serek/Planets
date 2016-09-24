/*
* Created by: Michael balcerzak
* Created on: 23-Sep-2016
* Created for: ICS3U
* Daily Assignment – Unit#1-10
* This program lists the planets and the user can pick one of the planets
*/ 	

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavoritePlanet {

	public enum PlanetsEnums { 
		  mercury("mercury"),
		  venus("venus"),
		  earth("earth"),
		  mars("mars"),
		  jupiter("jupiter"),
		  saturn("saturn"),
		  uranus("uranus"),
		  neptune("neptune");
		  
		  private final String planet;
		  
		  PlanetsEnums(String planet){
			  this.planet = planet;
		  }
		 
		  public String setPlanet(){
			  return this.planet;
		  }
	}
	
	public static void main(String[] args) throws IOException {
		// Create scanner object
        InputStreamReader r = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r); 
		
		String usersFavoritePlanet;
		PlanetsEnums planetsList;

		System.out.println("write your favorite planet");

		usersFavoritePlanet = br.readLine(); 
		
		planetsList = PlanetsEnums.valueOf(usersFavoritePlanet);
		System.out.println("Your favorite planet is: " + planetsList.planet + ".");

	}
}
