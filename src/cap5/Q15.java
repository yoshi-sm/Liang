package cap5;
/*(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
table is given in Appendix B. Characters are separated by exactly one space. 33 - 126*/

public class Q15 {
    public static void main(String[] args){
        int count = 0;
        char vain = 0;
        for (char i = 33; i < 127; i++){
            vain = i;
            System.out.print(vain + " ");
            count++;
            if (count > 9){
                System.out.println();
                count = 0;
            }
        }

    }
}

