package com.nexttech.JAVA;

public class Lec6accessmod 
{

	int num=1;  //used default access modifier=accessable in the any class ofsame package
    public String flower="Rose"; // public access amodifier accessable in any class of any package
	
    //method syntx: acceessmodifier returntype method name(argumen1,arg2){}
    public void fbloging(String email, String PW) {
    	//block of code
    }
    void method() { //if we have data theret is argument, no data no argument
    	//block of code
    	System.out.println("this is a mehtod");
    }
    //protected to access any protected attribute and method we have to use extends keyword
    //means we have to use inheritance concept
    protected int number =10;
    protected void method3() {
    	System.out.println("nexttech"); 
    }
    
	public static void main(String[] args) {
		
	}

}
