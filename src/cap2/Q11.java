package cap2;

/*(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program.


(Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
■■ One birth every 7 seconds
■■ One death every 13 seconds
■■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume that
the current population is 312,032,486, and one year has 365 days. Hint: In Java, if
two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result
with the fractional part, one of the values involved in the division must be a number
with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.*/
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int populacaoInicial = 312032486;
        final int segundosNoAno = 365 * 24 * 60 * 60;
        System.out.print("Digite quantos anos se passarão: ");
        int anos = input.nextInt();
        int nascimentos = (segundosNoAno * anos) / 7;
        int mortes = (segundosNoAno * anos) / 13;
        int imigracoes = (segundosNoAno * anos) / 45;
        int mudancaTotal = -mortes + nascimentos + imigracoes;
        System.out.println("Irão nascer " + nascimentos + " pessoas.");
        System.out.println("Irão morrer " + mortes + " pessoas.");
        System.out.println("Teremos " + imigracoes + " novos imigrantes.");
        System.out.println("Teremos " + mudancaTotal + " mais pessoas em nosso país.");
        System.out.println("Nova população: " + (mudancaTotal + populacaoInicial));
    }
}
