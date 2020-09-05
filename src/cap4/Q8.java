package cap4;
/*(Find the character of an ASCII code) Write a program that receives a character
and displays its ASCII code (an integer between 0 and 127). Here is a sample run:*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String temp = input.next();
        char ch = temp.charAt(0);
        System.out.print("The unicode for " + ch + " is " + (int)ch);
    }
}
