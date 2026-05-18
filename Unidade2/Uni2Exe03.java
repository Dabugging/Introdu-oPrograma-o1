import java.util.Scanner;
public class Uni2Exe03 {
    public static void main(String[] args) {
        //Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
        Scanner sc = new Scanner(System.in);
        double raio;
        double area;

        System.out.print("Digite o raio da circunferência: ");
        raio = sc.nextDouble();

        area = (Math.pow(raio, 2) * Math.PI);

        System.out.printf("O valor da área da circunferência é de %.3f m².", area);
        sc.close();
    }
}
