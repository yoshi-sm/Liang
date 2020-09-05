package cap2;

/*(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.

 1 import java.util.Scanner;
 2
 3 public class ComputeChange {
 4 public static void main(String[] args) {
 5 // Create a Scanner
 6 Scanner input = new Scanner(System.in);
 7
 8 // Receive the amount
 9 System.out.print(
10 "Enter an amount in double, for example 11.56: ");
11 double amount = input.nextDouble();
12
13 int remainingAmount = (int)(amount * 100);
14
15 // Find the number of one dollars
16 int numberOfOneDollars = remainingAmount / 100;
17 remainingAmount = remainingAmount % 100;
18
19 // Find the number of quarters in the remaining amount
20 int numberOfQuarters = remainingAmount / 25;
21 remainingAmount = remainingAmount % 25;
22
23 // Find the number of dimes in the remaining amount
24 int numberOfDimes = remainingAmount / 10;
25 remainingAmount = remainingAmount % 10;
26
27 // Find the number of nickels in the remaining amount
28 int numberOfNickels = remainingAmount / 5;
29 remainingAmount = remainingAmount % 5;
30
31 // Find the number of pennies in the remaining amount
32 int numberOfPennies = remainingAmount;
33
34 // Display results
35 System.out.println("Your amount " + amount + " consists of");
36 System.out.println(" " + numberOfOneDollars + " dollars");
37 System.out.println(" " + numberOfQuarters + " quarters ");
38 System.out.println(" " + numberOfDimes + " dimes");
39 System.out.println(" " + numberOfNickels + " nickels");
40 System.out.println(" " + numberOfPennies + " pennies");
41 }
42 }
*/
public class Q22XXXX {
}
