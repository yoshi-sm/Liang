package cap2;

/*(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
then displays the cost of the trip. */
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance to drive, the fuel efficiency and the price per galon: ");
        double distance = input.nextDouble(), fuelEfficiency = input.nextDouble(),
                pricePerGalon = input.nextDouble();
        double price = (int)(distance / fuelEfficiency * pricePerGalon * 100) / 100.0;
        System.out.print("The cost of the trip is: $" + price);
    }
}
