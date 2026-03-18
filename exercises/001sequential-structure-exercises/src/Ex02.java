// Exercise 02
//Objective: Write a program to read the radius of a circle and then display the area of ​​this circle with four decimal places.
//Area formula: area = π . radius²
//Consider the value of π = 3.14159
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double radius = sc.nextDouble();
		double pi = 3.14159;

		double area = pi * Math.pow(radius, 2);

		System.out.printf("A= %.4f%n", area);

		sc.close();
	}
}