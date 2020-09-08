package cap5;
/*(Perfect number) A positive integer is called a perfect number if it is equal to the
sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect
number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There
are four perfect numbers < 10,000. Write a program to find all these four numbers.*/

public class Q33 {
    public static void main(String[] args){
        int sum = 0;


        for (int i = 2; i < 10000; i++){
            for (int j = i-1; j>0; j--){
                if (i % j == 0){
                    sum += j;
                }
            }
            if(i == sum){
                System.out.println(i + " is a perfect number.");
            }
            sum = 0;
        }
    }

}
