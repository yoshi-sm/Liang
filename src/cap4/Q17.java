package cap4;
/*(Days of a month) Write a program that prompts the user to enter the year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month. If the input for month is incorrect, display
a message as presented in the following sample runs:

Enter a year: 2001
Enter a month: Jan
Jan 2001 has 31 days

Enter a year: 2016
Enter a month: jan
jan is not a correct month name*/
import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Enter a month: ");
        String month = entrada.nextLine();

        switch (month) {

            case "Jan":
                System.out.print(month + " " + year + " has 31 days.");
                break;

            case "Feb":


                if (year % 4 != 0) {
                    if (year % 100 == 0 && year % 400 == 0) {
                        System.out.print(month + " " + year + " has 29 days.");
                    } else {
                        System.out.print(month + " " + year + " has 28 days.");
                    }
                } else {
                    System.out.print(month + " " + year + " has 28 days.");
                }
                break;

            case "Mar":
                System.out.print(month + " " + year + " has 31 days.");
                break;
            case "Apr":
                System.out.print(month + " " + year + " has 30 days.");
                break;
            case "May":
                System.out.print(month + " " + year + " has 31 days.");
                break;
            case "Jun":
                System.out.print(month + " " + year + " has 30 days.");
                break;
            case "Jul":
                System.out.print(month + " " + year + " has 31 days.");
                break;
            case "Aug":
                System.out.print(month + " " + year + " has 31 days.");
                break;
            case "Sep":
                System.out.print(month + " " + year + " has 30 days.");
                break;
            case "Oct":
                System.out.print(month + " " + year + " has 31 days.");
                break;
            case "Nov":
                System.out.print(month + " " + year + " has 30 days.");
                break;
            case "Dec":
                System.out.print(month + " " + year + " has 31 days.");
                break;
            default:
                System.out.print(month + " is not a correct month name.");
        }
    }
}