import java.util.Scanner;
public class Uni2Exe07 {
    public static void main(String[] args) {
        //Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
        //Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
        Scanner sc = new Scanner(System.in);
        String nomeVendedor;
        double salarioFixo;
        double totalVendas;
        double salarioFinal;

        System.out.print("Digite seu nome: ");
        nomeVendedor = sc.nextLine();
        System.out.print("Digite o seu salário fixo: ");
        salarioFixo = sc.nextDouble();
        System.out.print("Digite o seu total de vendas efetuadas no mês: ");
        totalVendas = sc.nextDouble();

        salarioFinal = (((totalVendas * 15)/100)+ salarioFixo);

        System.out.printf(nomeVendedor + ", no final do mês o seu salário será de %.2f" + " reais.", salarioFinal);

        sc.close();
    }
}
