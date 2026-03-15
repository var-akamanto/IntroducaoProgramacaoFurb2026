package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;

public class SomaNums {
    public static void somaNums(){
                Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int X = n1 + n2;
        sc.close();
        System.out.println("X = " + X);
    }
}
