package cap1;
/*(Average speed in miles) Assume that a runner runs 15
kilometers in 50 minutes and 30 seconds. Write a program
that displays the average speed in miles per hour.
(Note that 1 mile is 1.6 kilometers.)*/
public class Q10 {
    public static void main(String[] args){
        System.out.print("velocidade media:");
        System.out.println((15.0 / 1.6) / ((50.0 / 60) + (30.0 / ( 60 * 60))));
    }
}
