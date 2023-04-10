package com.day5;

import java.util.Scanner;

public class Problem_10_Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monthlyPayment(); //Method

	}

	private static void monthlyPayment() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double p, y, r;
		
		System.out.println("PROGRAM  TO CALCULATE MONTHLY PAYMENT");
		System.out.println();
		
		//Taking input from user
		System.out.println("Enter the Loan amount : ");
		p = sc.nextDouble();
		
		System.out.println("Enter the Time Period in years : ");
		y = sc.nextDouble();
		
		System.out.println("Enter the Rate of Interest : ");
		r = sc.nextDouble();
		
		//Calculating the length of term in months
		y = 12 * y;
		
		//Calculating Monthly Interest Rate
		r = r / (12 * 100);
		
		//Calculating monthly payment
		double payment = (p * r) / (1 - Math.pow((1 + r), (-y)));
		
		System.out.println();
		System.out.println("Monthly Payment : " +payment);
		
	}

}
