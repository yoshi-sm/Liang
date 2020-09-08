package cap5;
/*(Display the first days of each month) Write a program that prompts the user to
enter the year and first day of the year, then displays the first day of each month in
the year. For example, if the user entered the year 2013, and 2 for Tuesday, January
1, 2013, your program should display the following output:

January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday*/
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the day of the week (sunday = 0, monday = 1, etc): ");
        int week_day = input.nextInt();
        String day = "yoyo";
        String month = "yo";
        int m_days = 0;

        for (int i = 0; i < 12; i++) {
            week_day = (week_day + m_days)%7;
            switch (i) {
                case 0:
                    month = "January";
                    m_days = 31;
                    break;

                case 1:
                    month = "February";
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)){
                        m_days = 29;
                    }
                    else{
                        m_days = 28;
                    }
                    break;

                case 2:
                    month = "March";
                    m_days = 31;
                    break;

                case 3:
                    month = "April";
                    m_days = 30;
                    break;

                case 4:
                    month = "May";
                    m_days = 31;
                    break;

                case 5:
                    month = "June";
                    m_days = 30;
                    break;

                case 6:
                    month = "July";
                    m_days = 31;
                    break;

                case 7:
                    month = "August";
                    m_days = 31;
                    break;

                case 8:
                    month = "September";
                    m_days = 30;
                    break;

                case 9:
                    month = "October";
                    m_days = 31;
                    break;

                case 10:
                    month = "November";
                    m_days = 30;
                    break;

                case 11:
                    month = "December";
                    m_days = 31;
                    break;

            }



            switch (week_day) {
                case 0:
                    day = "Sunday";
                    break;
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
            }
            System.out.println(month +" 1, "+ year +" is " +day);
        }

    }
}
