import java.util.Scanner;
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float media;

        System.out.print("Digite a 1° nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite a 2° nota: ");
        nota2 = sc.nextFloat();
        System.out.print("Digite a 3° nota: ");
        nota3 = sc.nextFloat();
        System.out.println();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println("O resultado da média é " + media);
        System.out.println();
        
        sc.close();
    }
}
