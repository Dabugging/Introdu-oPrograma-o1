import java.util.Scanner;
public class Uni2Exe05 {
    public static void main(String[] args) {
        //Leia quatro valores inteiros A, B, C e D. A seguir, 
        //calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        Scanner sc = new Scanner(System.in);
        int valorA;
        int valorB;
        int valorC;
        int valorD;
        int diferenca;

        System.out.print("Digite o valor inteiro A: ");
        valorA = sc.nextInt();
        System.out.print("Digite o valor inteiro B: ");
        valorB = sc.nextInt();
        System.out.print("Digite o valor inteiro C: ");
        valorC = sc.nextInt();
        System.out.print("Digite o valor inteiro D: ");
        valorD = sc.nextInt();

        diferenca = (valorA * valorB - valorC * valorD);

        System.out.println("A diferença do produto de A e B pelo produto de C e D é " + diferenca + ".");

        sc.close();
    }
}
