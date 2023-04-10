package com.day5;

import java.util.Scanner;

public class Problem_1_Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();  //Method

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAM TO DISPLAY FIBONACCI SERIES");
		System.out.println();
		
		int num, a=0, b=1;
		
		//User Input
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		System.out.println();
		System.out.println("FIBONACCI SERIES");
		System.out.println(a);
		System.out.println(b);
		
		//Displaying fibonacci series
		for(int i=1; i<=num; i++) {
			int c = a + b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
