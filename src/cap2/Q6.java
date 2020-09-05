package cap2;
/*(Multiply the digits in an integer) Write a program that reads an integer between
0 and 1000 and multiplies all the digits in the integer. For example, if an integer
is 932, the multiplication of all its digits is 54.
 Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 0 e 1000: ");
        int inteiro = entrada.nextInt();
        int digitoUm = inteiro % 10;
        int digitoDois = (inteiro / 10) % 10;
        int digitoTres = (inteiro / 10) / 10;
        System.out.print(digitoTres * digitoDois * digitoUm);
    }
}
