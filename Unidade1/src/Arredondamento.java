import java.text.DecimalFormat;
import java.util.Scanner;

public class Arredondamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 7.873254;
        //float num = 7.79488f;

        System.out.println("Nota: " + numero);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Nota: " + df.format(numero));

        System.out.printf("Nota: %.2f", numero);

        sc.close();
    }
}
