import java.util.Scanner;
public class Uni2Exe20 {
        public static void main(String[] args) {
            //Considere que você tenha um papel quadrado e o dobre varias vezes sempre em um número par de dobra no meio do quadrado. 
            //Ao abrir a folha de papel é possível verificar a marcação de novos quadrados. 
            //Baseado nisso leia o número de dobras (lembre que sempre é um número par) feitas no papel 
            //e escreva quantos quadrados podem ser vistos após desdobrá-lo.
            Scanner sc = new Scanner(System.in);
            int numDobras; 
            double numQuadrados;

            System.out.println();
            System.out.print("Digite a quantidade de dobras: ");
            numDobras = sc.nextInt();

            numQuadrados = Math.pow(2, numDobras);

            System.out.println("Podem ser vistas " + (int)numQuadrados + " quadrados na folha.");
            System.out.println();

            sc.close();
        }
}
