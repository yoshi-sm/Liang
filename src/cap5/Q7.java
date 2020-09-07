package cap5;
/*(Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 6% every year. In one year, the tuition
will be $10,600. Write a program that computes the tuition in ten years and the total
cost of four years’ worth of tuition after the tenth year.*/
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tuition cost: ");
        float tuition = input.nextFloat();
        float four_cost = 0;
        for (int i = 0; i < 15; i++) {
            if (i < 11) {
                System.out.printf("Year %d, tuition cost = $%.2f\n", i, tuition);
            }
            if (i > 10) {
                four_cost += tuition;

            }
            tuition += (tuition / 100) * 6;


        }
        System.out.printf("The total cost of four years’ worth of tuition after the tenth year" +
                " is $%.2f", four_cost);
    }

}
