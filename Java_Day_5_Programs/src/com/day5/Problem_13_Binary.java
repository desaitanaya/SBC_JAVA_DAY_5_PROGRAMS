package com.day5;

import java.util.Scanner;

public class Problem_13_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String x = " ";
		System.out.println("DECIMAL TO BINARY CONVERSION");

		// User Input
		System.out.println();
		System.out.println("Enter any decimal value : ");
		byte num = sc.nextByte();

		System.out.println();

		// 0xF0 : Gives first four bits
		// 0x0F : Gives last four bits
		byte val = (byte) ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
		System.out.println("After Swapping : " + val);

	}

}
