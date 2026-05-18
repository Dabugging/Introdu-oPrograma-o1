import java.util.Scanner;
public class Uni2Exe18 {
        public static void main(String[] args) {
            //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
            //Leia o comprimento e altura de uma parede (em metros) e escreva o valor gasto com a compra de azulejos. 
            //Considere que um metro quadrado é formado por 9 azulejos.
            Scanner sc = new Scanner(System.in);
            double comprimento, altura, valor;

            System.out.println();
            System.out.print("Digite o comprimento da parede(m): ");
            comprimento = sc.nextDouble();
            System.out.print("Digite a altura da parede(m): ");
            altura = sc.nextDouble();
            System.out.println();

            valor = (comprimento * altura) * 9 * 12.50;

            System.out.printf("O valor gasto com azulejos é de R$%.2f reais.", valor);
            System.out.println();
            System.out.println();
            
            sc.close();
        }
}
