package com.day5;

import java.util.Scanner;

public class Problem_4_Reverse_Number {
	static int rev = 0;

	//Reverse using Recursion
	static int Reverse_Recursion(int num) {
		// TODO Auto-generated method stub

		// Reversing a number
		while (num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num/10;
		}
		return rev;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("PROGRAM TO REVERSE A NUMBER");
		System.out.println();

		//User input
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println();
		System.out.println("Reversed number is : " +Reverse_Recursion(num));

	}

}
