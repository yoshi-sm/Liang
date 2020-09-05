package cap5;
/**/

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i < 10)
            if ((i++) % 2 == 0)
                System.out.println(i);
    }
}
