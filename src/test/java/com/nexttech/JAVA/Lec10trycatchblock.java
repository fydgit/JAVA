 package com.nexttech.JAVA;

public class Lec10trycatchblock {
	//exeption in java: exception means code error. to handle exception we use try and catch block
	
	
	public static void main(String[] args) {
		
		try {
			//block of code
			int[]numbers= {1,2,3};
			System.out.println(numbers[7]);
		}
	catch(Exception e) {
		//we handle the exception, we write a message here(customized)
		System.out.println("code in array fail");
		
	}	
	}

}


	
	
		
	


