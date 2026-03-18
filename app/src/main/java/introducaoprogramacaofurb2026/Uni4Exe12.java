package introducaoprogramacaofurb2026;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        if((lado1 + lado2 > lado3) || (lado1 + lado3 > lado2) || (lado3 + lado2) > lado1){
           System.out.println("dá pra formar triangulo"); 
        }
    }
}
