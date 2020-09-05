package cap2;

/*(Print a table) Write a program that displays the following table. Calculate the
middle point of two points.
 a        b     Middle Point
(0, 0)   (2, 1)   (1.0, 0.5)
(1, 4)   (4, 2)   (2.5, 3.0)
(2, 7)   (6, 3)   (4.0, 5.0)
(3, 9)   (10, 5)  (6.5, 7.0)
(4, 11)  (12, 7)  (8.0, 9.0)
*/
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        int x1 = input.nextInt(), y1 = input.nextInt();
        System.out.print("Enter x2 and y2: ");
        int x2 = input.nextInt(), y2 = input.nextInt();
        System.out.println("   a       b      Middle Point");
        System.out.println("(" + x1 + ", " + y1 + ")    (" + x2 + ", " + y2 +
                ")    (" + ((x1 + x2) / 2.0) + ", " + ((y1 + y2) / 2.0) + ")");
    }
}
