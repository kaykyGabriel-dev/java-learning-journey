// Exercise 01
//Objective: Write a program to read an integer and then determine whether that number is negative or not.

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("Negative!");
		}
		else {
			System.out.println("Not negative!");
		}
		
		
		
		sc.close();
	}

}
