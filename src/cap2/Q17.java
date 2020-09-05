package cap2;

/*(Science: wind-chill temperature) How cold is it outside? The temperature alone
is not enough to provide the answer. Other factors including wind speed, relative
humidity, and sunshine play important roles in determining coldness outside. In 2001,
the National Weather Service (NWS) implemented the new wind-chill temperature
to measure the coldness using temperature and wind speed

twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16

 The formula
cannot be used for wind speeds below 2 mph or temperatures below -58°F or
above 41°F.
Write a program that prompts the user to enter a temperature between -58°F
and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill
temperature. Use Math.pow(a, b) to compute v^0.16*/
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature and the wind speed: ");
        double temperature = input.nextDouble(), windSpeed = input.nextDouble();
        double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16))
                + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
        System.out.print("The wind chill index is " + ((int)(windChill *1000) / 1000.0));
    }
}
