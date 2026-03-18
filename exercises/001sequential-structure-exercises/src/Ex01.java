// Exercise 01
//Objective: Write a program to read two integer values, and then display the sum of those numbers on the screen with a message.

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int sum = number1 + number2; 
		
		System.out.println("Sum: " + sum);
		
		sc.close();
	}
}