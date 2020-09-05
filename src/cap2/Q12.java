package cap2;

/*(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:

length = v^2 / 2a

Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2),
then, displays the minimum runway length.
*/
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inicial speed and the acceleration respectively: ");
        double velocity = input.nextDouble(), acceleration = input.nextDouble();
        double length = (int)(Math.pow(velocity, 2)/(2 * acceleration) * 1000)/ 1000.0;
        System.out.print("The minimum runway length for this airplane is " + length + " meters.");
    }
}
