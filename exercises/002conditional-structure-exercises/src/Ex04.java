// Exercise 04
//Objective: Based on the table below, write a program that reads the code of an item and the quantity of that item. Then, calculate and display the total amount to be paid 
/*CODE | DESCRIPTION | PRICE
1 | Hot Dog | $4.00
2 | X-Salad | $4.50
3 | X-Bacon | $5.00
4 | Simple Toast | $2.00
5 | Soft Drink | $1.50*/
import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();
		int quantity = sc.nextInt();

		double total;

		if (code == 1) {
			total = quantity * 4.00;
		} else if (code == 2) {
			total = quantity * 4.50;
		} else if (code == 3) {
			total = quantity * 5.00;
		} else if (code == 4) {
			total = quantity * 2.00;
		} else if (code == 5) {
			total = quantity * 1.50;
		} else {
			total = 0;
		}

		System.out.printf("Total: $%.2f%n", total);

		sc.close();
	}
}