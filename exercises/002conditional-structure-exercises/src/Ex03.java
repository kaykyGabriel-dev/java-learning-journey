// Exercise 03
//Objective: Read two integer values (A and B). Then, the program should display the message "Are Multiples" or "Are Not Multiples", indicating whether the values read are multiples of each other. Note: the numbers may be entered in either ascending or descending order.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 == 0 || number2 == 0) {
            System.out.println("Cannot determine multiples with zero");
        } else if (number1 % number2 == 0 || number2 % number1 == 0) {
            System.out.println("Are Multiples");
        } else {
            System.out.println("Are Not Multiples");
        }

        sc.close();
    }
}