package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;

public class ConversorDeTempo {
    public static void conversorDeTempo(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int horas = n / 3600;
        int resto = n % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":"+ minutos + ":" + segundos);
    }
}
