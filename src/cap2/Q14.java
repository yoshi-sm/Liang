package cap2;

/*(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
one pound is 0.45359237 kilograms and one inch is 0.0254 meters.*/
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();
        weight = (int) (weight * 0.45359237 * 1000) / 1000.0;
        height = (int) (height * 0.0254 * 1000) / 1000.0;
        double BMI = (int)(weight / Math.pow(height, 2) * 1000) / 1000.0;
        System.out.print("BMI is " + BMI);
    }
}
