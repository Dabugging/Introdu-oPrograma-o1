import java.util.Scanner;
public class Uni2Exe08 {
    public static void main(String[] args) {
        //Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
        //o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
        Scanner sc = new Scanner(System.in);
        int codigo1, codigo2, pecas1, pecas2;
        double valor1, valor2, valor;

        System.out.println();
        System.out.print("Digite o código da peça 1: ");
        codigo1 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        valor1 = sc.nextDouble();
        System.out.print("Digite o número de peças 1: ");
        pecas1 = sc.nextInt();
        System.out.println();
        System.out.print("Digite o código da peça 2: ");
        codigo2 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        valor2 = sc.nextDouble();
        System.out.print("Digite o número de peças 2: ");
        pecas2 = sc.nextInt();

        valor = (pecas1 * valor1) + (pecas2 * valor2);

        System.out.println();
        System.out.printf("O valor a ser pago é de %.2f" + " reais.", valor);
        System.out.println();
        
        sc.close();
    }
}
