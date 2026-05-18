import java.util.Scanner;
public class Uni2Exe19 {
    public static void main(String[] args) {
        //Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D. 
        //Leia os valores de B, C e D e calcule o valor de A.
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;

        System.out.println();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();
        System.out.println();

        C = D;
        A = B;

        System.out.println("O valor de A é " + A + ".");
        System.out.println();

        sc.close();
    }
}
