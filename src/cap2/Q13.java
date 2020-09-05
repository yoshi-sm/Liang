package cap2;

/*(Financial application: compound value) Suppose you save $100 each month in a
savings account with annual interest rate 3.75%. Thus, the monthly interest rate is
0.0375/12 = 0.003125. After the first month, the value in the account becomes
100 * (1 + 0.003125) = 100.3125
After the second month, the value in the account becomes
(100 + 100.3125) * (1 + 0.003125) = 200.938
After the third month, the value in the account becomes
(100 + 200.938) * (1 + 0.003125) = 301.878
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use
a loop to simplify the code and display the account value for any month.)*/
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double interest = 0;
        interest += savingAmount + (savingAmount + interest) * 3.75 / (100 * 12);
        System.out.println("After the first month, the account value is " + interest);
        interest += savingAmount + (savingAmount + interest) * 3.75 / (100 * 12);
        System.out.println("After the second month, the account value is " + interest);
        interest += savingAmount + (savingAmount + interest) * 3.75 / (100 * 12);
        System.out.println("After the third month, the account value is " + interest);
        interest += savingAmount + (savingAmount + interest) * 3.75 / (100 * 12);
        System.out.println("After the fourth month, the account value is " + interest);
        interest += savingAmount + (savingAmount + interest) * 3.75 / (100 * 12);
        System.out.println("After the fifth month, the account value is " + interest);
        interest += savingAmount + (savingAmount + interest) * 3.75 / (100 * 12);
        System.out.println("After the sixth month, the account value is " + interest);
    }
}
