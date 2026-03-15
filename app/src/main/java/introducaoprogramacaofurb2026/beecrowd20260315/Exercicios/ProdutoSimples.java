package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;

public class ProdutoSimples {
    public static void produtoSimples(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int PROD = num1 * num2;
        sc.close();
        System.out.println("PROD = " + PROD);
    }
}
