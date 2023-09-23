package com.upskill.java_4;

public class Encapsulation {
	
	private String name = "Maksud";
	private int ssn = 1233456;
	private String username = "upskill";

	public static void main(String[] args) {
	Encapsulation obj = new Encapsulation();
	obj.setSSN(43567899);
	System.out.println(obj.getUsername());
	System.out.println(obj.getname());

	}

	private void setSSN(int i) {
		// TODO Auto-generated method stub
		
	}

	private char[] getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	// Setter Method - ssn       //set the data, Write only
	public void setSSN(String value){
		name =value;
	}
	
	public String getname(){
		return 
				name;
	}
}
