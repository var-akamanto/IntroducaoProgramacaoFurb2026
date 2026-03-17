package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComBonus {
    public static void salarioComBonus(){
        Scanner sc = new Scanner(System.in);

        double COMISSAO = .15;
        DecimalFormat df = new DecimalFormat("0.00");

        //String nome = sc.next();
        double salario  = sc.nextDouble();
        double valorVendas = sc.nextDouble();

        double salarioFinal = salario + (valorVendas * COMISSAO);
        String salarioFinalFormatado = df.format(salarioFinal);

        sc.close();

        System.out.println("TOTAL = R$" + salarioFinalFormatado);
    }
    public static void main(String[] args) {
        salarioComBonus();
    }
}
