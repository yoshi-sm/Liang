package cap2;
import java.util.Scanner;

public class Ex_input {
    public static void main(String[] args){
        Scanner ok = new Scanner(System.in);
        System.out.println("digite o numero:");
        double numero = ok.nextDouble();
        System.out.println("digite falacia:");
        double falacia = ok.nextDouble();
        double soma = numero + falacia;
        System.out.println("soma = " + soma);
    }
}
