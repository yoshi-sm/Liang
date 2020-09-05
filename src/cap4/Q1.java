package cap4;
/*(Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon, as shown in the following figure.

The side can be computed using the formula s = 2r sin pi/5

where r is the length from the center of a pentagon to a vertex. Round up two digits
after the decimal point. Here is a sample run:*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double radius = input.nextDouble();
        double side = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(side, 2))/(4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %4.2f", area);
    }
}
