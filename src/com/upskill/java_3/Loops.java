package com.upskill.java_3;

public class Loops {

	/*
	 * Type of Loops 1. For Loop 2. While Loop 3. Do While Loop 4. Infinite Loop
	 */

	public static void main(String[] args) {
		practiceForLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		practiceInfiniteLoop();
		
	}

	public static void practiceForLoop() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("For Loops Number = " +i);
		}

	}

	public static void practiceWhileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println("While Loops Number = " + i);
			i++;
		}
	}
			
	public static void practiceDoWhileLoop(){
		int i = 1;
		do {
			System.out.println("Do While Loop Number = " + i);
			i++;
		} while (i<=0);
		}

    public static void practiceInfiniteLoop() {
	int i;
	for (i = 1; ; i++) {
		System.out.println("Infinite Loops Number = " + i);
	}
    }
}
      
   public static void practiceNestedForLoop(){
	   
   }
    