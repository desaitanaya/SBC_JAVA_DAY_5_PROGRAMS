package com.day5;

import java.util.Scanner;

public class Problem_2_Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();   //Method

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		
		System.out.println("PROGRAM TO DISPLAY PERFECT NUMBER");
		System.out.println();
		
		//User input
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		System.out.println();
		
		//Condition for getting the factors of a number
		for(int i=1; i<=num/2; i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		
		//Condition for checking the perfect number
		if(sum == num) {
			System.out.println(+num + " is a Perfect number");
		}
		else {
			System.out.println(+num + " is not a Perfect number");
		}
	}

}
