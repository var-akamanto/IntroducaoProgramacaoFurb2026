package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void salario(){
        Scanner sc = new Scanner(System.in);
        int matricula = sc.nextInt();
        float horasTrabalhadas = sc.nextFloat();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;
        DecimalFormat df = new DecimalFormat("0.00");
        String salarioFormatado = df.format(salario);

        sc.close();

        System.out.println("NUMBER = " + matricula);
        System.out.println("SALARY = U$ " + salarioFormatado);
    }
}
