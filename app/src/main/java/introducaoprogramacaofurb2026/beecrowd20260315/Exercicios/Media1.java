package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media1 {
    public static void media1(){
        double PESO_NOTA1 = 3.5;
        double PESO_NOTA2 = 7.5;
        double SOMA_PESOS = PESO_NOTA1 + PESO_NOTA2;
        DecimalFormat df = new DecimalFormat("0.00000");

        Scanner sc = new Scanner(System.in);
        
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();


        double media = ((n1 * PESO_NOTA1) + (n2 * PESO_NOTA2)) / SOMA_PESOS;
        
        String mediaFormatada = df.format(media);

        sc.close();
        
        System.out.println("MEDIA = " + mediaFormatada);
    }
    public static void main(String[] args) {
        media1();
    }
}
