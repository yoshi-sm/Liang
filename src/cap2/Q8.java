package cap2;
/*(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone.*/
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a variação do horário em relação ao GMT: ");
        int varianciaGMT = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis() + (varianciaGMT * 60 * 60 * 1000);
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) ;
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " timezone: " + varianciaGMT);
    }
}
