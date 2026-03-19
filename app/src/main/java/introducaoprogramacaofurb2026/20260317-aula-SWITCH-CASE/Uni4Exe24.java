import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1,v2,v3, opcao;
        int maiorValor;
        int menorValor;
        int valorMedio;

        System.out.println("Escreva os valores : ");
        v1 = sc.nextInt();
        maiorValor = v1;
        v2 = sc.nextInt();
        valorMedio = v2;
        v3 = sc.nextInt();
        menorValor = v3;
        System.out.println("Defina a forma de ordenação");
        System.out.println("1 - ASC; 2 - DESC; 3 - Maior valor no meio");
        opcao = sc.nextInt();


        if (v2 > v1 && v2 > v3) {
            maiorValor = v2;
            menorValor = v1;
            valorMedio = v3;
            if(menorValor > valorMedio){
                menorValor = v3;
                valorMedio = v1;
            }
        } else if (v3 > v1 && v3 > v2) {
            maiorValor = v3;
            menorValor = v1;
            valorMedio = v2;    
            if(menorValor > valorMedio){
                menorValor = v2;
                valorMedio = v1;
            }
        }else if (v1 > v2 && v1 > v3) {
                maiorValor = v1;
                menorValor = v2;
                valorMedio = v3;
                if(menorValor > valorMedio){
                    menorValor = v3;
                    valorMedio = v2;
                }
            }       
        switch (opcao) {
            case 1:
                System.out.println("DO MENOR AO MAIOR");
                    System.out.println(menorValor);
                    System.out.println(valorMedio);
                    System.out.println(maiorValor);
                break;
            case 2:
                System.out.println("DO MAIOR AO MENOR");
                    System.out.println(maiorValor);
                    System.out.println(valorMedio);
                    System.out.println(menorValor);
                break;
            case 3:
                System.out.println("MAIOR VALOR NO MEIO");
                    System.out.println(valorMedio);
                    System.out.println(maiorValor);
                    System.out.println(menorValor);
                break;
            default: System.out.println("Digite uma opção válida");
                break;
        }
    }
}
