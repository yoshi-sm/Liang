package cap5;
/*(Find the two lowest scores) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the names of the
students with the lowest and second-lowest scores.
*/
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student's name(or 'quit' to exit): ");
        String name = input.nextLine();
        int low_score1 = 999999999;
        int low_score2 = 999999999;
        String low_name1 = "empty";
        String low_name2 = "empty";
        int score = 0;
        while (!name.equals("quit")){
            System.out.print("Enter the student's score: ");
            score = input.nextInt();
            input.nextLine();
            if (score < low_score1){
                low_score2 = low_score1;
                low_name2 = low_name1;
                low_score1 = score;
                low_name1 = name;
            }
            else if (score < low_score2){
                low_score2 = score;
                low_name2 = name;
            }
            System.out.print("Enter the student's name(or 'quit' to exit): ");
            name = input.nextLine();
        }
        System.out.println("Lowest score: "+ low_name1 + "   " + low_score1);
        System.out.println("Second lowest score: "+ low_name2 + "   " + low_score2);
    }

}
