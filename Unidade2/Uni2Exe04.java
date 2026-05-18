import java.util.Scanner;
public class Uni2Exe04 {
    public static void main(String[] args) {
        //Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), 
        //sendo que a nota vai de 0.0 a 10.0.
        Scanner sc = new Scanner(System.in);
        double notaA;
        double notaB;
        double mediaPonderada;

        System.out.print("Digite a primeira nota: ");
        notaA = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        notaB = sc.nextDouble();

        mediaPonderada = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.printf("Sua média é %.2f", mediaPonderada);

        sc.close();
    }
}
