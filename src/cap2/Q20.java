package cap2;

/*(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the
next monthly payment using the following formula:

interest = balance * (annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month. */
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the balance and the annual percentage interest rate: ");
        double balance = input.nextDouble(), annualInterest = input.nextDouble();
        double interest = balance * (annualInterest/1200);
        System.out.print("The interest for the next month is: " + ((int)(interest * 100)/100.0));
    }
}
