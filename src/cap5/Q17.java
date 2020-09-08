package cap5;
/*(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
Enter the number of lines: 7
7 6 5 4 3 2 1 2 3 4 5 6 7
6 5 4 3 2 1 2 3 4 5 6
5 4 3 2 1 2 3 4 5
4 3 2 1 2 3 4
3 2 1 2 3
2 1 2
1*/
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired number of lines: ");
        int lines = input.nextInt();
        if (lines > 15 || lines < 1){
            System.out.print("Invalid number of lines entered.");
        }
        else{
            for (int j = lines; j > 0; j--){
                for (int i = j; i > 0; i--){
                    System.out.print(i + " ");
                }
                for (int i = 2; i <= j; i++){
                    System.out.print(i + " ");
                }
                System.out.println();
                lines--;
            }
        }
    }

}
