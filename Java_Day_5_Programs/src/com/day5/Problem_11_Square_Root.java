package com.day5;

import java.util.Scanner;

public class Problem_11_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAM TO FIND SQUARE ROOT OF A NUMBER USING NETWON'S METHOD");
		System.out.println();
		System.out.println("Enter a number : ");
		double c = sc.nextDouble();

        double epsilon = 1e-15;    
        double t = c;              

        // Repeatedly applying Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        
        //Displaying the sqaure root
        System.out.println();
        System.out.println("Sqaure root of " +c + " is : " +t);
	}

}
