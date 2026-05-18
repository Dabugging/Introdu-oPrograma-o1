import java.util.Scanner;
public class Uni2Exe02 {
    public static void main(String[] args) {
        //Leia 2 valores inteiros e imprima sua multiplicação.
        Scanner sc = new Scanner(System.in);
        int num1, num2, multiplicacao;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = sc.nextInt();
        multiplicacao = num1 * num2;
        System.out.println();
        System.out.println("A multiplicação entre " + num1 + " e " + num2 + " é " + multiplicacao + ".");

        sc.close();;
    }
}
