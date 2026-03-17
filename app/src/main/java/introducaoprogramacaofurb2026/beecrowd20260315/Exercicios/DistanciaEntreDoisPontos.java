package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void distanciaEntreDoisPontos(){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        sc.close();

        double distancia = Math.pow((Math.pow((x1 - x2),2)) + (Math.pow((y1 - y2),2)),0.5);
        String distanciaFormatada = df.format(distancia);

        System.out.println(distanciaFormatada);
 
    }
    public static void main(String[] args) {
        distanciaEntreDoisPontos();
    }
}
