package com.nexttech.JAVA;

import java.util.HashMap; // Import the HashMap class

public class Lec5Hashmap {

	public static void main(String[] args) {
		//HasMap<datatype,datatype> variable name=new HashMap<datatype.datatype>();

		//Store 3 city name of TX state
		
		HashMap<String,String> capital= new HashMap<String,String>();
	 capital.put("TX","PLANO");
	 capital.put("TX", "MURPHY");
	 capital.put("TX", "DALLAS");
	// capital.put("NY", "Queens");
	// capital.put("NY", "Brooklyn");
	 System.out.println(capital);
	 
	 //ACCESS
	 capital.get("TX");capital.get("NY");
   System.out.println(capital.get("NY"));
	
	 
	 //REMOVE
	 capital.remove("capital");  // remove all TX key with value
	 System.out.println(capital);
	
	// print 4 student name and id with hashmap
	// Create a HashMap object called students
	 HashMap<String,Integer> students= new HashMap<String,Integer>();
	 students.put("JOE", 1518);
	 students.put("LOU", 1501);
	 students.put("DON", 1520); 
	 students.put("BOB", 1509);
	
	System.out.println(students);
	 
	 
	 //CITY NAME WITH Zipcode
	 HashMap<String,Integer> address= new HashMap<String,Integer>();
	 address.put("southfield", 73328);
	 address.put("murphy", 84897);
	 address.put("plano", 94732);
	 
	 for(String z : address.keySet())
	 {
		 
	 System.out.println("key: " + z + " value: " + address.get(z)); 
	 }
		
	}

}
