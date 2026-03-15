package introducaoprogramacaofurb2026.beecrowd20260315.Exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaCirculo {
    public static void areaCirculo(){
        double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double area = PI * (raio * raio);
        DecimalFormat df = new DecimalFormat("0.0000");
        String areaFormatado = df.format(area);
        sc.close();
        System.out.println("A="+areaFormatado);
    }

}
