package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;

public class Area {
    public static void area(){
        Scanner sc = new Scanner(System.in);
        double PI = 3.14159;

        double a = sc.nextDouble();
        double b  = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        double areaTrianguloRetangulo = (a * c) / 2;
        double areaCirculo = PI * (c * c);
        double areaTrapezio = ((a + b) * c)/2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}
