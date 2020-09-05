package cap2;
/*(Convert mile to kilometer) Write a program that reads a mile in a double value
from the console, converts it to kilometers, and displays the result. The formula
for the conversion is as follows:
 1 mile = 1.6 kilometers*/
public class Q1 {
    public static void main(String[] args){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Digite quantas milhas você quer converter: ");
        double milhas = entrada.nextDouble();
        double kilometros = ((int) (1000 * milhas * 1.6))/1000.0;
        System.out.print(milhas + " milhas = " + kilometros + " kilometros.");
    }
}
