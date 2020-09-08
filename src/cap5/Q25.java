package cap5;
/*(Compute pi) You can approximate pi by using the following summation:
(see book)
 Write a program that displays the pi value for i = 10000, 20000, …, and 100000.
 Obs: wrong formula supplied by the book*/

public class Q25 {
    public static void main(String[] args){
        double pi = 0;
        for (int i = 10000; i <= 100000; i+= 10000){
            for (int j = 0; j <= i; j++){

                pi += Math.pow(-1, j)/(2*j + 1);
            }
            pi = 4*pi;
            System.out.println("for i = "+ i +", pi = "+pi);
            pi = 0;
        }

    }
}
