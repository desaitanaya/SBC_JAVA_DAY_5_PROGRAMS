package com.day5;

import java.util.Scanner;

public class Problem_9_Celsius_Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temperatureConversion();  //Method

	}

	private static void temperatureConversion() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double fahr, cel;
		
		System.out.println("TEMPERATURE CONVERSION PROGRAM");
		System.out.println();
		
		System.out.println("1.Celsius to Fahrenheit Conversion \n2.Fahrenheit to Celcius Conversion");
		System.out.println();
		
		System.out.println("Enter the choice : ");
		int ch = sc.nextInt();
		
		System.out.println();
		
		//Switch case
		switch (ch) {
		case 1 :  
			System.out.println("CELCIUS TO FAHRENHEIT CONVERSION");
			System.out.println("--------------------------------");
			
			//Taking input from the user
			System.out.println("Enter the temperature in Celcius : ");
			cel = sc.nextDouble();
			
			//Formula for converting the temperature in celcius to fahrenheit
			fahr = (cel * 9/5) + 32;
			
			System.out.println();
			System.out.println("Temperature in Fahrenheit : " +fahr);
			break;
			
		
		case 2 :  
			System.out.println("FAHRENHEIT TO CELCIUS CONVERSION");
			System.out.println("--------------------------------");
			
			//Taking input from the user
			System.out.println("Enter the temperature in Fahrenheit : ");
			fahr = sc.nextDouble();
			
			//Formula for converting the temperature in fahrenheit to celcius
			cel = (fahr - 32) * 5/9;
			
			System.out.println();
			System.out.println("Temperature in Celcius : " +cel);
			break;
		
		}
		
		
		
	}

}
