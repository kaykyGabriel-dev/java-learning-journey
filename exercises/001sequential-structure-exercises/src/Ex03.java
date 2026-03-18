// Exercise 03
//Objective: Write a program to read four integer values A, B, C, and D. Then, calculate and display the difference between the product of A and B and the product of C and D according to the formula:
//DIFFERENCE = (A * B - C * D)

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, difference;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		difference = (A * B - C * D);
		
		
		System.out.println("Difference: " + difference);
		
		
		
		sc.close();
	}
}
