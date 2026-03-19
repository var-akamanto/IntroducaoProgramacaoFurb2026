import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("1 - Ciencia da Computação");
                break;
            case 2 :
                System.out.println("2 - Licenciatura da Computação");
                break;
            case 3 :
                System.out.println("3 - Sistemas da Informação");
                break;
            case 4 :
                System.out.println("4 - Bacharelado em Ciencia de Dados");
                break;
            default: 
                System.out.println("Digite uma opção valida");
                break;
        }
    }
}
