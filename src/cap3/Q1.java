package cap3;
/*(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:

b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots.”
Note you can use Math.pow(x, 0.5) to compute 2x. */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values of a, b, and c: ");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble(),
                delta = Math.pow(b, 2) - 4 * a * c;
        double root1, root2;

        if (delta == 0) {
            root1 = -b / (2 * a);
            System.out.print("The function has one root and it is " + root1);
        }
        else if (delta > 0) {
            root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.print("The function has two roots and it is " + root1 + " and " + root2);
        }
        else {
            System.out.print("The function has no real roots");
        }
    }
}
