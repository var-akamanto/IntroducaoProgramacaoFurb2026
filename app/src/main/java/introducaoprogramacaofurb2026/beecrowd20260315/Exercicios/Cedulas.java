package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;

public class Cedulas {
    public static void cedulas(){
        Scanner sc = new Scanner(System.in);
        int[] celulas = {100,50,20,10,5,2};

        int n = sc.nextInt();
        sc.close();
        int valor = n;

        System.out.println(n);
            for (int cedula : celulas) {
                    int qtdCedulas = valor / cedula;
                    System.out.println(qtdCedulas + " nota(s) de R$ " + cedula + ",00");
                    valor = valor%cedula;  
                }
            }
            public static void main(String[] args) {
                cedulas();
            }
        }
