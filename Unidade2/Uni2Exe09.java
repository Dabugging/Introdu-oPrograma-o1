import java.util.Scanner;
public class Uni2Exe09 {
    public static void main(String[] args) {
        //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
        //Para isto ela entregou um valor em dólares para o atendente. 
        //Considerando que o atendente tem a cotação do dólar, 
        //calcule quantos reais o atendente deve devolver para a pessoa.
        Scanner sc = new Scanner(System.in);
        double qntDolar, valorFinal, dolarAtual;
        dolarAtual = 5.28;
        
        System.out.print("Digite o valor em dólares: ");
        qntDolar = sc.nextDouble();

        valorFinal = (qntDolar * dolarAtual);

        System.out.println("Você irá receber " + valorFinal + " reais.");

        sc.close();
    }
}