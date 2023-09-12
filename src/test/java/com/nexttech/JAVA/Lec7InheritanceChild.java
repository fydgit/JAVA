package com.nexttech.JAVA;

public class Lec7InheritanceChild extends Lec7InheritenceParent {   
/*Inheritance: we have to use "extends" keyword to access the parents class.
	we inherit parents class on c hild class by using extents keyword.*/
	public static void main(String[] args) {
	
		//create object  of child class
		Lec7InheritanceChild obj=new Lec7InheritanceChild();
		//System.out.println(obj.a);
		obj.method1();
		obj.method2();
		obj.method3();

	}

}
