package cap1;
/*(Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
■■ One birth every 7 seconds
■■ One death every 13 seconds
■■ One new immigrant every 45 seconds*/
public class Q11 {
    public static void main(String[] args){
        System.out.print("Nascimentos:");
        System.out.println(365 * 24 * 60 * 60 / 7.0);
        System.out.print("Mortes:");
        System.out.println(365 * 24 * 60 * 60 / 13.0);
        System.out.print("Imigrações:");
        System.out.println(365 * 24 * 60 * 60 / 45.0);
        System.out.println("");
        System.out.print("Hoje temos:");
        System.out.println("312,032,486");
        System.out.print("Ano 1 :");
        System.out.println( 312032486 + (365 * 24 * 60 * 60 / 7.0)
         - (365 * 24 * 60 * 60 / 13.0) + (365 * 24 * 60 * 60 / 45.0));
        System.out.print("Ano 2 :");
        System.out.println( 312032486 + 2 * ((365 * 24 * 60 * 60 / 7.0)
                - (365 * 24 * 60 * 60 / 13.0) +
                (365 * 24 * 60 * 60 / 45.0)));
        System.out.print("Ano 3 :");
        System.out.println( 312032486 + 3 * ((365 * 24 * 60 * 60 / 7.0)
                - (365 * 24 * 60 * 60 / 13.0) +
                (365 * 24 * 60 * 60 / 45.0)))
        ;System.out.print("Ano 4 :");
        System.out.println( 312032486 + 4 * ((365 * 24 * 60 * 60 / 7.0)
                - (365 * 24 * 60 * 60 / 13.0) +
                (365 * 24 * 60 * 60 / 45.0)))
        ;System.out.print("Ano 5 :");
        System.out.println( 312032486 + 5 * ((365 * 24 * 60 * 60 / 7.0)
                - (365 * 24 * 60 * 60 / 13.0) +
                (365 * 24 * 60 * 60 / 45.0)));
    }
}
