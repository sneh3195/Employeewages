package com.Employee;

public class Employee {
			public static void main(String[] args) {
				double attendance =Math.floor(Math.random()*2);
				int wages; 
                	System.out.println(attendance);
           if(attendance == 1) {
        	   		//System.out.println("Employee is present");
        	   		wages=160;
        	   		System.out.println("Employee is present \nwages = " + wages);
           }else {
        	         wages=0;
        	   		System.out.println("Employee is absent \nwages = " + wages);
           }
          
	}

}
