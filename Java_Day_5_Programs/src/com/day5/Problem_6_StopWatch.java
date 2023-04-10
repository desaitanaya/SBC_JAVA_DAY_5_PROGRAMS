package com.day5;

import java.util.Scanner;

public class Problem_6_StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			long start,stop;
			double time;
			
			System.out.println("STOPWATCH PROGRAM");
			System.out.println();
			
			//User input to start the stopwatch
			System.out.println("Enter any character to start the stop watch : ");
			char s = sc.next().charAt(0);
			start = System.currentTimeMillis();
			
			//User input to stop the stopwatch
			System.out.println("Enter any character to stop the stop watch : ");
			char e = sc.next().charAt(0);
			stop = System.currentTimeMillis();
			
			System.out.println();
			//Calculating Elapsed time
			time=(stop-start)/1000.0;
			System.out.println("Elapsed time : " +time);
				
	}

}
