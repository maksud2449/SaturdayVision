package com.upskill.java_1;

public class MethodType {

	public static int hourlyIncome = 65;
	
	 public static void main (String[]args) {
     System.out.println("Kibria");
     weeklyIncomeStatic();
     
     MethodType myobj = new MethodType();
     myobj.annualIncomeVoid();
     
     System.out.println("My monthly Income = " + myobj.monthlyIncomeReturn());
	}

    //void method 
    public void annualIncomeVoid(){
    	int calculateAnnualIncome = hourlyIncome * 2000;
    	 System.out.println("My Annual Income = " + calculateAnnualIncome);
    }
    
    //Static Method   
    public static void  weeklyIncomeStatic (){
    	int calculateWeeklyIncome = hourlyIncome * 40;
        System.out.println("My Weekly Income = " + calculateWeeklyIncome);
    }
    
    //Return Type Method
    public int  monthlyIncomeReturn(){
    	int calculateMonthlyIncome = hourlyIncome * 180;
    	return calculateMonthlyIncome;
    }
}
