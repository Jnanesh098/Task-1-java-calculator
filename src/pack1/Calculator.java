package pack1;

import java.util.Scanner;

public class Calculator 
{
	public static double add(double a, double b)
	{
		return a+b;
	}
	public static double subtract(double a, double b)
	{
		return a-b;
	}
	public static double multiply(double a, double b)
	{
		return a*b;
	}
	public static double divide(double a, double b)
	{
		if(b==0)
		{
			System.out.println("Error: cannot divide by zero");
			return 0;
		}
		return a/b;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("-------Java Calculator---------");
			System.out.println(" 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Exit");
	        System.out.print("Enter your choice: ");
	        
	        choice = sc.nextInt();
	        if (choice >= 1 && choice <= 4) 
	        {
	        	System.out.print("Enter first number: ");
	            double num1 = sc.nextDouble();
	            
	            System.out.print("Enter second number: ");
	            double num2 = sc.nextDouble();
	            
	            switch (choice) 
	            {
	            case 1: System.out.println("Result: " + add(num1, num2)); 
	            break;
	            case 2: System.out.println("Result: " + subtract(num1, num2));
	            break;
	            case 3: System.out.println("Result: " + multiply(num1, num2));
	            break;
	            case 4: System.out.println("Result: " + divide(num1, num2)); 
	            break;
	            }
	        }
		}
		while (choice != 5);
		
		sc.close();
	}
}
