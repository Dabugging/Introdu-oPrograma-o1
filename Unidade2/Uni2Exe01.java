import java.util.Scanner;
public class Uni2Exe01 {
    public static void main(String[] args) {
        //Leia 2 valores inteiros e imprima sua soma.
        Scanner sc = new Scanner(System.in);
        int num1; 
        int num2; 
        int soma;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.println();
        System.out.println("A soma entre " + num1 + " e " + num2 + " é " + soma + ".");

        sc.close();;
    }
}
