package cap2;
/*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate and then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
as gratuity and $11.2 as total. */
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o subtotal: ");
        double subtotal = input.nextDouble();
        double gratuityRate = (int)((subtotal / 100) * 12 * 100)/100.0;
        double total = subtotal + gratuityRate;
        System.out.println("Subtotal = $" + subtotal);
        System.out.println("Gratuity = $" + gratuityRate);
        System.out.println("Total = $" + total);
    }
}
