package cap2;

/*(Geometry: area of a triangle) Write a program that prompts the user to enter three
points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area.
The formula for computing the area of a triangle is

s = (side1 + side2 + side3)/2;
area = sqrt(s*(s - side1) * (s - side2) * (s - side3))
*/
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(),
                y2 = input.nextDouble(), x3 = input.nextDouble(), y3 = input.nextDouble();
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double s = (int)((side1 + side2 + side3) / 2 * 1000) / 1000.0;
        double area = (int)(Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5) * 1000) / 1000.0;
        System.out.print("The area of the triangle is " + area);
    }
}
