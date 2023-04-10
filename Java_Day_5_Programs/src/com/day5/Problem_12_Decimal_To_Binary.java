package com.day5;

import java.util.Scanner;

public class Problem_12_Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String x = " ";
		System.out.println("DECIMAL TO BINARY CONVERSION");
		
		//User Input
		System.out.println();
		System.out.println("Enter any decimal value : ");
		int num = sc.nextInt();
		
		//Calculating the binary value
		while (num > 0) {
			int a = num % 2;
			x = a + x;
			num = num/2;
		}
		
		System.out.println();
		System.out.println("Binary value : " +x);
	}

}
