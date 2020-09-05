package cap4;
/*(Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
the user to enter the radius of the bounding circle of a pentagon and displays the
coordinates of the five corner points on the pentagon from p1 to p5 in this order.
Use console format to display two digits after the decimal point*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the radius of the pentagram: ");
        double radius = input.nextDouble();
        double  p1x, p2x, p3x, p4x ,p5x, p1y, p2y, p3y, p4y ,p5y;
        double variacaoAngulo = Math.toRadians(72);
        p1x = 0; p1y = radius;
        p2x = radius * Math.cos((Math.PI / 2) + variacaoAngulo);
        p2y = radius * Math.sin((Math.PI / 2) + variacaoAngulo);
        p3x = radius * Math.cos((Math.PI / 2) + 2 * variacaoAngulo);
        p3y = radius * Math.sin((Math.PI / 2) + 2 * variacaoAngulo);
        p4x = radius * Math.cos((Math.PI / 2) + 3 * variacaoAngulo);
        p4y = radius * Math.sin((Math.PI / 2) + 3 * variacaoAngulo);
        p5x = radius * Math.cos((Math.PI / 2) + 4 * variacaoAngulo);
        p5y = radius * Math.sin((Math.PI / 2) + 4 * variacaoAngulo);
        System.out.printf("The coordinates are as follows:\n" +
                "p1 = (%4.2f, %4.2f)\n" +
                "p2 = (%4.2f, %4.2f)\n" +
                "p3 = (%4.2f, %4.2f)\n" +
                "p4 = (%4.2f, %4.2f)\n" +
                "p5 = (%4.2f, %4.2f)", p1x, p1y, p2x, p2y ,p3x, p3y, p4x, p4y, p5x ,p5y);
    }
}
