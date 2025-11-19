package calculator;

import java.util.Scanner;

public class DriverCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//use this object to call the methods
		CalculatorImplementation c1 = new CalculatorImplementation();
		
		System.out.println("Enter a choice");
		int choice = sc.nextInt();
		
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		
		
		switch(choice)
		{
		
		case 1:
		{
			//addition implementation
			System.out.println(c1.add(a, b));
		}
		 
		case 2:
		{
			//Subtraction implementation
		}
		
		case 3:
		{
			//multiplication implementation
		}
		
		case 4:
		{
			//Division implementation
		}
		
		default:
			System.out.println("Enter a valid choice ");
		   
		
		}
	}

	}
