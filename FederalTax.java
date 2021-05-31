import java.text.NumberFormat;
import java.util.*;
public class FederalTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.print("Enter your biweekly salary: ");
		double biweekly = sc.nextDouble();
		double income = (biweekly * 26);
		System.out.print("Enter your pre-income deduction: ");
		double preIncome = sc.nextDouble();
		System.out.print("Enter your post-income deduction: ");
		double postIncome = sc.nextDouble();
		//0-20000 = average (0.0 + 6.34/ 2) = 3.17%
		//20000.01-35000 = average (6.34 + 8.76 / 2) = 7.55
		//$35,000.01-40,000 = (8.76 + 9.17 / 2) = 8.965
		//40,000.01-75,000 = (9.17 + 14.28 / 2) = 11.725
		//75,000.01-500000 (14.28 + 29.59 / 2) = 21.935
		//500000 (29.59)
		//fed
		//state
		//pre tax
		//post tax
		double fica = 0.0765;
		double fed = 0;
		double state = 0;
		double total = 0;
		if(income <= 20000 && income >= 0) {
			fed = 0.0317;
			state = 0.014;
			total = (((biweekly - preIncome) * (fed + fica + state)) - postIncome);
			System.out.println("Your gross paycheck is: " + money.format(biweekly));
			System.out.println("Your federal taxes are: " + money.format((biweekly - preIncome) * fed));
			System.out.println("Your state taxes are: " + money.format((biweekly - preIncome) * state));
			System.out.println("Your FICA taxes are: " + money.format((biweekly - preIncome) * fica));
			System.out.println("Your pre-tax deductions are: " + money.format(preIncome));
			System.out.println("Your post-tax deductions are: " + money.format(postIncome));
			System.out.println("Your take-home salary is : " + money.format(biweekly - total));
		}
		else if(income > 20000 && income <= 35000) {
			fed = 0.0755;
			state = 0.0175;
			total = (((biweekly - preIncome) * (fed + fica + state)) - postIncome);
			System.out.println("Your gross paycheck is: " + money.format(biweekly));
			System.out.println("Your federal taxes are: " + money.format((biweekly - preIncome) * fed));
			System.out.println("Your state taxes are: " + money.format((biweekly - preIncome) * state));
			System.out.println("Your FICA taxes are: " + money.format((biweekly - preIncome) * fica));
			System.out.println("Your pre-tax deductions are: " + money.format(preIncome));
			System.out.println("Your post-tax deductions are: " + money.format(postIncome));
			System.out.println("Your take-home salary is : " + money.format(biweekly - total));
		}
		else if(income > 35000 && income <= 40000) {
			fed = 0.08965;
			state = 0.035;
			total = (((biweekly - preIncome) * (fed + fica + state)) - postIncome);
			System.out.println("Your gross paycheck is: " + money.format(biweekly));
			System.out.println("Your federal taxes are: " + money.format((biweekly - preIncome) * fed));
			System.out.println("Your state taxes are: " + money.format((biweekly - preIncome) * state));
			System.out.println("Your FICA taxes are: " + money.format((biweekly - preIncome) * fica));
			System.out.println("Your pre-tax deductions are: " + money.format(preIncome));
			System.out.println("Your post-tax deductions are: " + money.format(postIncome));
			System.out.println("Your take-home salary is : " + money.format(biweekly - total));
		}
		else if(income > 40000 && income <= 75000) {
			fed = 0.11725;
			state = 0.05525;
			total = (((biweekly - preIncome) * (fed + fica + state)) - postIncome);
			System.out.println("Your gross paycheck is: " + money.format(biweekly));
			System.out.println("Your federal taxes are: " + money.format((biweekly - preIncome) * fed));
			System.out.println("Your state taxes are: " + money.format((biweekly - preIncome) * state));
			System.out.println("Your FICA taxes are: " + money.format((biweekly - preIncome) * fica));
			System.out.println("Your pre-tax deductions are: " + money.format(preIncome));
			System.out.println("Your post-tax deductions are: " + money.format(postIncome));
			System.out.println("Your take-home salary is : " + money.format(biweekly - total));
		}
		else if(income > 75000 && income <= 500000) {
			fed = 0.21935;
			state = 0.06370;
			total = (((biweekly - preIncome) * (fed + fica + state)) - postIncome);
			System.out.println("Your gross paycheck is: " + money.format(biweekly));
			System.out.println("Your federal taxes are: " + money.format((biweekly - preIncome) * fed));
			System.out.println("Your state taxes are: " + money.format((biweekly - preIncome) * state));
			System.out.println("Your FICA taxes are: " + money.format((biweekly - preIncome) * fica));
			System.out.println("Your pre-tax deductions are: " + money.format(preIncome));
			System.out.println("Your post-tax deductions are: " + money.format(postIncome));
			System.out.println("Your take-home salary is : " + money.format(biweekly - total));
		}
		else if(income > 500000) {
			fed = 0.2959;
			state = 0.08970;
			total = (((biweekly - preIncome) * (fed + fica + state)) - postIncome);
			System.out.println("Your gross paycheck is: " + money.format(biweekly));
			System.out.println("Your federal taxes are: " + money.format((biweekly - preIncome) * fed));
			System.out.println("Your state taxes are: " + money.format((biweekly - preIncome) * state));
			System.out.println("Your FICA taxes are: " + money.format((biweekly - preIncome) * fica));
			System.out.println("Your pre-tax deductions are: " + money.format(preIncome));
			System.out.println("Your post-tax deductions are: " + money.format(postIncome));
			System.out.println("Your take-home salary is : " + money.format(biweekly - total));
		}	
	}
}

