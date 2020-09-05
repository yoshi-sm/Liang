package cap2;
/*(Convert meters into feet) Write a program
that reads a number in meters, converts
it to feet, and displays the result. One meter is 3.2786 feet.*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a distância em metros: ");
        double meters = input.nextDouble();
        double feet = (int)(meters * 3.2786 * 100)/100.0;
        System.out.print(meters + " meters = " + feet + " feet");
    }
}
