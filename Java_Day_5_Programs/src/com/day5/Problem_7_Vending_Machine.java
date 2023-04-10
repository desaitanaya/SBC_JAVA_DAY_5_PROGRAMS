package com.day5;

import java.util.Scanner;

public class Problem_7_Vending_Machine {
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int[] total = new int[notes.length];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//User input
		System.out.println("Enter the Amount in Rs. : ");
		int amount = sc.nextInt();

		for(int i = 0; i < notes.length; i++) {
			if(amount >= notes[i]) {
				total[i] = amount / notes[i];  
				amount = amount % notes[i];   
			}
		}

		System.out.println();
		
		System.out.println("NOTES COUNT : ");
		for (int i = 0; i < total.length; i++) {
			if (total[i] != 0) {
				System.out.println(notes[i] + " : " + total[i]);
			}
		}

	}

}
