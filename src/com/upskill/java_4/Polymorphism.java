package com.upskill.java_4;

import com.upskill.java_1.MethodType;


public class Polymorphism extends MethodType {

	public static void main(String[] args) {

		  car();
		  car("RED");
		  car(4);
		  weeklyIncomeStatic();
	}

	
			public static void car(){
		System.out.println("My car is Audi");
	}
	
	public static void car(String color){
		System.out.println("My car is Audi, my audi color : " + color);
	}

	public static void car(int door){
		System.out.println("My car is Audi, my audi door : " + door);
	}
	
	public static void car(String color, int door){
		System.out.println("My car is Audi, my audi color : "  + color + " , my audi door : " + door);
}
}