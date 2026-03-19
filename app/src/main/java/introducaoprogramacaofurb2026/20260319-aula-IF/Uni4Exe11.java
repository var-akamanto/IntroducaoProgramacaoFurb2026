
import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNascimento1 = sc.nextInt();
        int anoNascimento2 = sc.nextInt();
        int anoNascimento3 = sc.nextInt();

        if(anoNascimento1 == anoNascimento2 && anoNascimento1 == anoNascimento3){
            System.out.println("Trigemeos");
        }
        else if (anoNascimento1 == anoNascimento2 || anoNascimento1 == anoNascimento3 || anoNascimento2 == anoNascimento3) {
            System.out.println("Gemeos");            
        } else{
            System.out.println("Apenas irmaos");
        }

    }
}
