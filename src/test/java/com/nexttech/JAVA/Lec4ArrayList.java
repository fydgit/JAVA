package com.nexttech.JAVA;

import java.util.ArrayList;

public class Lec4ArrayList {

	public static void main(String[] args) {
		
	 //ArrayList <Datatype>Variablename = new ArrayList<Datatype> (); 
		//add 3 cars in arraylist
		 ArrayList <String>cars= new ArrayList<String>(); 
		 cars.add("bmw");    //select add(String e):boolean. arraylist
		 cars.add("nissan");
		 cars.add("honda");
		 
		 System.out.println(cars.get(1)); //how to access value in ArrayList
		
		 System.out.println(cars.set(1, "toyota")); //how to change value in ArrayList
		 System.out.println(cars.get(1));
		 
		 //store any 3 int value by using array list
		 ArrayList<Integer> number= new ArrayList<Integer>();
		 number.add(3);
		 number.add(89);
		 number.add(48);
		 System.out.println(number.get(0));  //how to access value in ArrayList
		 System.out.println("the size of the array is:" + cars.size()); //how to find size in arraylist
	
	}
	

}
