package cap5;
/*(Compute e) You can approximate e using the following summation:

 Write a program that displays the e value for i = 10000, 20000, …, and 100000.
(Hint: Because i! = i * (i - 1) * c * 2 * 1, then

 Initialize e and item to be 1, and keep adding a new item to e. The new item is
the previous item divided by i, for i >= 2.)*/

public class Q26 {
    public static void main(String[] args){
        double exp = 1;
        double next = 1;

        for (int j = 1; j < 11; j++){
            for (int i = 1; i < j*10000 + 1; i++){
                next = next/i;
                exp += next;

            }
            System.out.println("Value of e for i = "+ j*10000 +". e = "+ exp);
            exp = 1;
            next = 1;
        }

    }

}
