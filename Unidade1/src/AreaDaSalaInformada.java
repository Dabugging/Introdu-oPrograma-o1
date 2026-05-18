import java.util.Scanner;
public class AreaDaSalaInformada {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        float frente = 0;
        float lateral = 0;

        System.out.print("Digite a metragem da frente da sala de aula: ");
        frente = sc.nextFloat();
        System.out.print("Digite a metragem da lateral da sala de aula: ");
        lateral = sc.nextFloat();
        System.out.println();

        System.out.println("A area da sala é de: " + frente * lateral + "m².");

    sc.close();
    }
}
