package assignment1;

import java.util.Scanner;

public class TerribleCalculator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Java Calculator!");
		System.out.println("Please select an opperation (Add, Sub, Mul, Div)");
		
		String userInput;
		int tempNum;
		int int1;
		int int2;
		userInput = scnr.nextLine();
		switch (userInput.toLowerCase()) {
		case "add" :
			System.out.print("Enter integer 1: ");
			tempNum = scnr.nextInt();
			int1 = tempNum;
			System.out.print("Enter integer 2: ");
			tempNum = scnr.nextInt();
			int2 = tempNum;
			int sum;
			sum = int1 + int2;
			System.out.println("Sum is " + sum);
			System.out.println("Thank you for using Java Calculator!");
			break;
			
		case "sub" :
			System.out.print("Enter integer 1: ");
			tempNum = scnr.nextInt();	
			int1 = tempNum;
			System.out.print("Enter integer 2: ");
			tempNum = scnr.nextInt();
			int2 = tempNum;
			int sub;
			sub = int1 - int2;
			System.out.println("Difference is " + sub);
			System.out.println("Thank you for using Java Calculator!");
			break;
			
		case "mul" :
			System.out.print("Enter integer 1: ");
			tempNum = scnr.nextInt();
			int1 = tempNum;
			System.out.print("Enter integer 2: ");
			tempNum = scnr.nextInt();
			int2 = tempNum;
			int mul;
			mul = int1 * int2;
			System.out.println("Product is " + mul);
			System.out.println("Thank you for using Java Calculator!");
			break;
			
		case "div" :
			System.out.println("Would you like to use integer division (Y/N)");
			String userInput2;
			userInput2 = scnr.nextLine();
			if(userInput2.equals("Y")) {
				System.out.print("Enter integer 1: ");
				tempNum = scnr.nextInt();
				int1 = tempNum;
				System.out.print("Enter integer 2: ");
				tempNum = scnr.nextInt();
				int2 = tempNum;
				int div;
				div = int1 / int2;
				System.out.println("Difference is " + div);
				System.out.println("Thank you for using Java Calculator!");
			}
			else if(userInput2.equals("N")) {
				System.out.print("Enter integer 1: ");
				tempNum = scnr.nextInt();
				int1 = tempNum;
				System.out.print("Enter integer 2: ");
				tempNum = scnr.nextInt();
				int2 = tempNum;
				float divf;
				divf = (float)int1 / (float)int2;
				System.out.println("Difference is " + divf);
				System.out.println("Thank you for using Java Calculator!");
				
			}
			else {
				System.out.println("Incorrect input, please use Y or N");
				System.out.println("Thank you for using Java Calculator!");
			}
			break;
			
			default: 
				System.out.println("Incorrect input, please select between add, sub, mul, and div");
				System.out.println("Thank you for using Java Calculator!");
			break;
				
				
			
			
			}
			
			
		
	scnr.close();}
	}

