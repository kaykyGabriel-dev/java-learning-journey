// Exercise 04
//Objective: Write a program that reads an employee’s number, the number of hours worked, and the amount they are paid per hour. Then, calculate the employee’s salary. Finally, display the employee’s number and salary, with two decimal places.

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hoursWorked = sc.nextInt();
		double paidPerHour = sc.nextDouble();
		
		double salary = hoursWorked * paidPerHour;
		
		System.out.println("NUMBER: " + number);
		System.out.printf("SALARY: U$ %.2f%n", salary);
		
		
		sc.close();
	}

}
