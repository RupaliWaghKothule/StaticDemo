package com.staticdemo.practice;

import java.util.Scanner;

import com.staticdemo.practice.StaticDemo.Student.Conditioncheck;

public class StaticDemo {
 static String requiredcity ;
  static class Student{
	    private  void getUserData( String fname,String Lname,String city,long number) {
	    	  
	    	  System.out.println("Student Firstname is>>" +fname);
	    	  System.out.println("Student last name is>>" +Lname);
	    	  System.out.println("Student City name is>>" +city);
	    	  System.out.println("Student Mobile number is>> +number");
	    	  
	      }
	  static class Conditioncheck{
		  void checkCondition() {
		  
		     Scanner scanner=new Scanner(System.in);
		   
		    System.out.println("Enter student City name" );
		String city  =  scanner.next();
		System.out.println("Student city is>> " +city);
		System.out.println("Enter sutdent Firstname");
	String fname=scanner.next();
	System.out.println("Enter Student Ladst name");
	String Lname=scanner.next();
	System.out.println("Enter student number");
	Long number=scanner.nextLong();
		Student student=new Student();
			if(requiredcity.equals(city)) {
				System.out.println("enter in if loop");
				student.getUserData(fname,Lname,city,number );
				
			}else {
				
				System.out.println("Doesnot fulfill required Condition");
			}
			
			
			 
		 
			  
		  
		  }
  }
	  
	  
  }
	public static void main(String[] args) {
		System.out.println("Enter the Student requiredCity name");
	     Scanner scanner=new Scanner(System.in);
	     String requiredcity=scanner.next();
	     System.out.println("Required city name is " +requiredcity);
		Conditioncheck conditioncheck=new Conditioncheck();
		  conditioncheck.checkCondition();
		
		
		
	} 	    		
	
}

