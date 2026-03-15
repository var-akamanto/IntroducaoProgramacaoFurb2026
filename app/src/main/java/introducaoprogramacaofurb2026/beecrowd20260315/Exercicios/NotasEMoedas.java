package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;

public class NotasEMoedas {
    public static void notasEMoedas(){
        Scanner sc = new Scanner(System.in);

        int[] cedulas = {10000,5000,2000,1000,500,200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        double n = sc.nextDouble();
        int valor = (int)Math.round(n * 100);


        System.out.println("NOTAS:");
            for (int cedula : cedulas) {
                    int qtdCedulas = valor / cedula;
                    System.out.printf("%d moeda(s) de R$ %.2f\n",qtdCedulas,cedula/100.0);
                    valor = valor%cedula;  
                }



        System.out.println("MOEDAS:");
            for (int moeda : moedas) {
                    int qtdMoedas = valor / moeda;
                    System.out.printf("%d nota(s) de R$ %.2f\n",qtdMoedas,moeda/100.0);
                    valor = valor%moeda;  
                }
        sc.close();
            }
}
