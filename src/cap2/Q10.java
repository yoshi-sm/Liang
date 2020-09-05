package cap2;

/*(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is:

 Q = M * (finalTemperature – initialTemperature) * 4184

 where M is the weight of water in kilograms, initial and final temperatures are in
degrees Celsius, and energy Q is measured in joules.*/
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantidade de água em quilos: ");
        double massaAgua = input.nextDouble();
        System.out.print("Digite a temperatura inicial e a temperatura final em Celsius " +
                "respectivamente: ");
        double temperaturaInical = input.nextDouble(), temperaturaFinal = input.nextDouble();
        double energia = (int)(massaAgua * (temperaturaFinal - temperaturaInical) * 1000 *
                4184) / 1000.0;
        System.out.println("Quantidade de água: " + massaAgua + "Kg.");
        System.out.println("Temperatura inicial: " + temperaturaInical + "C");
        System.out.println("Temperatura final: " + temperaturaFinal + "C");
        System.out.println("Energia necessária: " + energia + "J");
    }
}
