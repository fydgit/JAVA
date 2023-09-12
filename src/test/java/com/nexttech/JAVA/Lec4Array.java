package com.nexttech.JAVA;

public class Lec4Array {

	public static void main(String[] args) {
		
		//store single data in single variable
   //datatype variable = value;
		int num = 1;
		
		//array; store multiple data in single variable
//for String,datatype [] variable = {"value", "value1", "value2"};	
		     String [] cars = {"bmw", "nissan","honda"};
		System.out.println(cars[0]);
		/*gytitiuu
		 * 
		 */
	     	//store 5 flowers name by using array
	    	String [] flowers = {"lily","rose","marygold","orchid","jasmin"};
		System.out.println(flowers[1]);
		
	    	//store 5 state name by using array
		    String [] states = {"tx","fl","oh","ny","nc"};
		System.out.println(states[2]);
		
		   //store 5 whole number by using array
//for int, Datatype [] variable={value, value1,,,,,,value n}
		   int[]numbers = {12,23,34,45,56};
		System.out.println(numbers[3]);
		
		   //store 5 decimal number by using array
        	double[] dacimal = {1.2, 2.3, 3.4, 4.5, 5.6};
	    System.out.println(dacimal[4]);
	    
	      //store month
        	String[] months= {"jan", "feb", "march", "apr", "may"};
        System.out.println(months[0]);
        
        //how to change an array element
        String[] month= {"jan", "feb", "march", "apr", "may"};
        month[2]="dec";
        System.out.println(month[2]);
        System.out.println(month.length); //how to check length
        
      //store 5 state name by using array
	    String [] state = {"tx","fl","oh","ny","nc"};
        System.out.println(state[0]="IL"); // change array element
	}
	
	

}
