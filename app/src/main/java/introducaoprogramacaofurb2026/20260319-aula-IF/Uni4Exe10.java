
import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade1, idade2, idade3;
        idade1 = sc.nextInt();
        idade2 = sc.nextInt();
        idade3 = sc.nextInt();
        if(idade1 < idade2 && idade1 < idade3){
            System.out.println("A pessoa mais jovem é a primeira.");
        } else if (idade2 < idade3){
            System.out.println("A segunda pessoa é a mais jovem.");
        } else {
            System.out.println("A terceira pessoa é a mais jovem.");
        }
        sc.close();
    }
}

