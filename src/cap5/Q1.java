package cap5;
/*(Pass or fail) Write a program that prompts a student to enter a Java score. If the
score is greater or equal to 60, display “you pass the exam”; otherwise, display “you
don’t pass the exam”. Your program ends with input -1. Here is a sample run:

Enter your score: 80
You pass the exam.

Enter your score: 59
You don't pass the exam.
Enter your score: −1
No numbers are entered except 0*/
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = entrada.nextInt();

        while (score >= 0) {
            if (score >= 60){
                System.out.println("You pass the exam.");
            }
            else{
                System.out.println("You don't pass the exam.");
            }
            System.out.print("Enter your score: ");
            score = entrada.nextInt();
        }

        System.out.print("No numbers are entered except 0.");

    }

}
