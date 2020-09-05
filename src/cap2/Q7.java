package cap2;
/*(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and remaining days for
the minutes. For simplicity, assume that a year has 365 days.*/
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = input.nextInt();
        int anos = minutos / (365 * 60 * 24);
        int dias = (minutos % (365 * 60 * 24)) / (60 * 24);
        System.out.print(minutos + " minutos são aproximadamente "
                + anos + " anos e " + dias + " dias.");
    }
}
