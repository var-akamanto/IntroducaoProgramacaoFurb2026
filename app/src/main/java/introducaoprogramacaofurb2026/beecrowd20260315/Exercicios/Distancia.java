package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;

public class Distancia {
    public static void distancia(){
        Scanner sc = new Scanner(System.in);
        int varDistanciaKm = sc.nextInt();
        sc.close();
        int tempoMinutos = varDistanciaKm * 2;
        System.out.println(tempoMinutos + " minutos");
    }
    public static void main(String[] args) {
        distancia();
    }
}
