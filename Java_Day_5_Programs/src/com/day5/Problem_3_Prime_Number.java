package com.day5;

import java.util.Scanner;

public class Problem_3_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();  //Method

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAM TO DISPLAY A PRIME NUMBER");
		System.out.println();
		
		int num, flag=0;
		
		//User input
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		System.out.println();
		
		//Condition to check a prime number
		if(flag==0) {
			System.out.println(+num + " is a Prime number");
		}
		else {
			System.out.println(+num + " is not a Prime number");
		}
	}

}
