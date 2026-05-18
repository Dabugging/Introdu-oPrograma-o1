import java.util.Scanner;
public class Uni2Exe06 {
    public static void main(String[] args) {
        //Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
        //o valor que recebe por hora e calcula o salário desse funcionário. 
        //A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        Scanner sc = new Scanner(System.in);
        int numFuncionario;
        double horasTrabalhadas;
        double valorHora;
        double salario;

        System.out.println();
        System.out.print("Digite o ID do funcionário: ");
        numFuncionario = sc.nextInt();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.print("Digite o valor que recebe por hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println();
        System.out.printf("Funcionário " + numFuncionario + ", você recebe %.2f reais por mês.", salario);
        System.out.println();
        System.out.println();
        sc.close();
    }
}
