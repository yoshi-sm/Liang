package cap1;
/*(Approximate p) p can be computed using the following formula:
pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) */
public class Q7 {
    public static void main(String[] args){
        System.out.print("1 - pi = ");
        System.out.println(4.0 * ( 1.0 - 1.0 / 3 +  1.0 / 5
                - 1.0 / 7  + 1.0 / 9 - 1.0 / 11));
        System.out.print("2 - pi = ");
        System.out.println(4.0 * ( 1.0 - 1.0 / 3 +  1.0 / 5 - 1.0 / 7
                + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
    }
}
