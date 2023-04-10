package com.day5;

import java.util.Scanner;

public class Problem_8_Gregorian_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dayOfWeek(); //Method

	}

	private static void dayOfWeek() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAM OF GREGORIAN CALENDAR");
		System.out.println();
		
		int m,d,y;
		int y0=0, x=0, m0=0, d0=0;
		
		//Taking inputs from the user
		System.out.println("Enter the date : ");
		d = sc.nextInt();
		
		System.out.println("Enter the month : ");
		m = sc.nextInt();
		
		System.out.println("Enter the year : ");
		y = sc.nextInt();
		
		//Calculating the day
		y0 = y - (14 - m) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + 31 * m0 / 12) % 7;
		
		System.out.println();
		if(d0 == 0) {
			System.out.println("It is a Sunday!!!");
		}
		else if(d0 == 1) {
			System.out.println("It is a Monday!!!");
		}
		else if(d0 == 2) {
			System.out.println("It is a Tuesday!!!");
		}
		else if(d0 == 3) {
			System.out.println("It is a Wednesday!!!");
		}
		else if(d0 == 4) {
			System.out.println("It is a Thursday!!!");
		}
		else if(d0 == 5) {
			System.out.println("It is a Friday!!!");
		}
		else {
			System.out.println("It is a Saturday!!!");
		}
	}

	
}
