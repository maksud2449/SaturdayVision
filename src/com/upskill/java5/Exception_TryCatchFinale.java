package com.upskill.java5;

public class Exception_TryCatchFinale {

	public static void main(String[] args) {
		//Built-in Exceptions - ArrayIndexOutofBoundsException
		try{
			int[] ageVision = new int[]{25, 35, 26, 28, 30};
			System.out.println("Student age = " + ageVision[6]);
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("Array member not available ! ");
		}
		
		//Specific Built-in Exceptions - NumberFormatException
				try{
					int num = Integer.parseInt("Test");
				} catch (NumberFormatException e){ 
					e.printStackTrace();
					System.out.println("Its not an integer value");
				}
				
				//User-Defined Exceptions
				try{
					throw new myException("Test");
				} catch (Exception e){ 
					e.printStackTrace();
					System.out.println("This Exception is defined by User");
				}
				
				finally{
					System.out.println("Test Execution Complete");
				}
			}
}

