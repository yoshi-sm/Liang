package cap2;

/*(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is
Area = 3 * (sqrt(3)/2) * s^2,

 where s is the length of a side*/
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();
        System.out.print("The area of the hexagon is: " +
                ((int)(3 * (Math.pow(3, 0.5)/ 2) * Math.pow(side, 2) * 1000) / 1000.0));
    }
}
