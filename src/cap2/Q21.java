package cap2;

/*(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years and displays
the future investment value using the following formula:

futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)

For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.*/
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount, the annual interest and the number of years: ");
        double investimentAmount = input.nextDouble(), annualInterest = input.nextDouble();
        int numberOfYears = input.nextInt();
        double monthlyInterest = investimentAmount * (annualInterest/1200);
        double monthlyInterestRate = monthlyInterest / investimentAmount;
        double futureInvestment = investimentAmount *
                Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.print("Future value is: $" + futureInvestment);
    }
}
