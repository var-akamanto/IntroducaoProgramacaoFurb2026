package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {
    public static void calculoSimples(){
        Scanner sc  =   new Scanner(System.in);
        DecimalFormat   df  = new DecimalFormat("0.00");  

        //int         codigoP1        =   sc.nextInt();
        int         qtdP1           =   sc.nextInt();
        double      valorUnitarioP1 =   sc.nextDouble();
        //int         codigoP2        =   sc.nextInt();
        int         qtdP2           =   sc.nextInt();
        double      valorUnitarioP2 =   sc.nextDouble();

        sc.close();

        double valorPago = (qtdP1 * valorUnitarioP1) + (qtdP2 * valorUnitarioP2);
        String valorPagoFormatado = df.format(valorPago);

        System.out.println("VALOR A PAGAR: R$ " + valorPagoFormatado);
    }
}
