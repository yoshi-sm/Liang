package cap2;
/*(Convert square meter into ping) Write a program that converts square meter into ping.
The program prompts the user to enter a number in square meter, converts it to ping,
and displays the result. One square meter is 0.3025 ping.*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de metros: ");
        double metros = input.nextDouble();
        double ping = (int)(metros * 0.3025 * 1000) / 1000.0;
        System.out.print(metros + " metros quadrados = " + ping + " pings.");
    }
}
