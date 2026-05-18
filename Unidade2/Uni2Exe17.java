import java.util.Scanner;
public class Uni2Exe17 {
    public static void main(String[] args) {
        //Uma empresa tem para um funcionário os seguintes dados: 
        //o nome, o número de horas trabalhadas mensais e o número de dependentes. 
        //A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) 
        //e R$ 60,00 por dependente (valor para cálculo do salário família) 
        //e são feitos descontos de 8,5% sobre o salário trabalho para o INSS 
        //e de 5% sobre o salário trabalho para o imposto de renda. 
        //Ao final informe o nome, o salário bruto e o salário líquido do funcionário.
        Scanner sc = new Scanner(System.in);
        String nome;
        int numeroHoras, numeroDepe;
        double salarioBruto, salarioLiquido;

        System.out.println();
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o número de horas trabalhadas: ");
        numeroHoras = sc.nextInt();
        System.out.print("Digite o número de dependentes: ");
        numeroDepe = sc.nextInt();
        System.out.println();

        salarioBruto = (numeroHoras * 10) + (numeroDepe * 60);
        salarioLiquido = salarioBruto - ((salarioBruto * 8.5)/100) - ((salarioBruto * 5)/100);

        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);
        System.out.println();

        sc.close();
    }
}
