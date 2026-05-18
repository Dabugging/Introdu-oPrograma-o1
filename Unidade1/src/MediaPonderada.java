import java.util.Scanner;
public class MediaPonderada {
        public static void main(String[] args) {
            /*Média Final = (Prova 1 * 0.20) + (Prova 2 * 0.30) + (Projeto Final * 0.30) + 
                (Média Aritmética dos Demais Exercícios e Trabalhos Parciais * 0.20)
             */
                Scanner sc = new Scanner(System.in);

                double prova1;
                double prova2;
                double projetoFinal;
                double exercicioUnidade1;
                double exercicioUnidade2;
                double exercicioUnidade3;
                double exercicioUnidade4;
                double exercicioUnidade5;
                double exercicioUnidade6;
                double exercicioUnidade7;     
                double mediaFinal;  
                
                System.out.print("Digite a nota 1: ");
                prova1 = sc.nextFloat();
                System.out.print("Digite a nota 2: ");
                prova2 = sc.nextFloat();
                System.out.println();
                System.out.print("Digite a nota do exercício unidade 1: ");
                exercicioUnidade1 = sc.nextFloat();
                System.out.print("Digite a nota do exercício unidade 2: ");
                exercicioUnidade2 = sc.nextFloat();
                System.out.print("Digite a nota do exercício unidade 3: ");
                exercicioUnidade3 = sc.nextFloat();
                System.out.print("Digite a nota do exercício unidade 4: ");
                exercicioUnidade4 = sc.nextFloat();
                System.out.print("Digite a nota do exercício unidade 5: ");
                exercicioUnidade5 = sc.nextFloat();
                System.out.print("Digite a nota do exercício unidade 6: ");
                exercicioUnidade6 = sc.nextFloat();
                System.out.print("Digite a nota do exercício unidade 7: ");
                exercicioUnidade7 = sc.nextFloat();
                System.out.println();
                System.out.print("Digite a nota do projeto final: ");
                projetoFinal = sc.nextFloat();
                System.out.println();
                mediaFinal = (prova1 * 0.20) + (prova2 * 0.30) + (projetoFinal * 0.30) + 
                (((exercicioUnidade1 + exercicioUnidade2 + exercicioUnidade3 + exercicioUnidade4 + 
                exercicioUnidade5 + exercicioUnidade6 + exercicioUnidade7) /7 ) * 0.20);

                System.out.printf("A média final é %.2f",  mediaFinal);
                System.out.println();
                
                sc.close();
        }
}
