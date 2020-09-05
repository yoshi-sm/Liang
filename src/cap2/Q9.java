package cap2;

/*Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration. */
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a velocidade incial e a velocidade final, respectivamente: ");
        double v0 = input.nextDouble(), v1 = input.nextDouble();
        System.out.print("Digite o tempo decorrido: ");
        double tempo = input.nextDouble();
        double aceleracao = (int)(((v1 - v0)/tempo) * 1000)/1000.0;
        System.out.print("Aceleração média: " + aceleracao);
    }
}
