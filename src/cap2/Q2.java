package cap2;
/*(Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume
using the following formulas:
area = sqrt(3)/4 * (length of sides)^2
volume = area * length
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do triângulo: ");
        double ladoDoTriangulo = input.nextDouble();
        double area =   ((int)((Math.sqrt(3) / 4) * Math.pow(ladoDoTriangulo, 2) * 1000))/1000.0;
        double volume =  area * ladoDoTriangulo;
        System.out.print("area = " + area + ", volume = " + volume);
    }
}
