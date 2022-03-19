import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello \n" +
                "Augustin");
        System.out.println("Avem doua numere intregi, si anume 100 si 31");
        int x, y, sum;
        x = 100;
        y = 31;
        sum = x + y;
        System.out.println("Rezultatul adunarii celor doua numere este " + sum);
        double a, b;
        a = 100;
        b = 31;
        System.out.println("Rezultatul impartirii celor doua numere este " + a / b);



        System.out.println("a.  -5 + 8 * 6 = "+ (int) (-5+8*6));

        System.out.println("b.  (55 + 9) % 9 = " + (double) (55+9) / 9);

        int no1=20;
        int no2= -3*5/8;

        System.out.println((double)no1+no2);

        System.out.println("c.  20 + -3 * 5 / 8 = " + (double) 20+((-3*5)/8));
        //sistemul rotunjeste in sus la 19. Rezultatul trebuie sa fie 18,125

        System.out.println("d.  5 + 15 / 3 * 2 - 8 % 3 = " + (int)(5 + 15 / 3 * 2 - 8 % 3) );

    }


}