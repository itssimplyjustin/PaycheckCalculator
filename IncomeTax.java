import java.util.*;
import java.util.Scanner;
import java.text.NumberFormat;

public class IncomeTax {

	public static void main(String[] args) {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the gross income: ");
		double income = sc.nextDouble();
		System.out.print("Enter the number of dependants: ");
		double dependants = sc.nextDouble();
		System.out.println("The income tax is ");
		int inctax = 0;
		System.out.print(money.format((income - 10000 - 2000 * dependants) * 0.2));
		
	}
}

