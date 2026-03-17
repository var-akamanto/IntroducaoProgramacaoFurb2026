
import java.util.Scanner;

public class uni4Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = Character.toUpperCase(sc.next().charAt(0));
        char vogais[] = {'A', 'E', 'I', 'O', 'U'};
        if(letra == vogais[0] || letra == vogais[1] || letra == vogais[2] || letra == vogais[3] || letra == vogais[4]){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
