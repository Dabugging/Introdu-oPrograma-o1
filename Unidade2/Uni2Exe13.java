import java.util.Scanner;
public class Uni2Exe13 {
    public static void main(String[] args) {
        //Dois carros (X e Y) partem em uma mesma direção. 
        //O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. 
        //Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos. 
        //Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
        Scanner sc = new Scanner(System.in);
        double km, minutos, tempo;

        System.out.println("Informe a distância em km: ");
        km = sc.nextDouble();

        tempo = 2;
        minutos = km * tempo;

        System.out.println("O carro irá levar " + minutos + " minutos para chegar.");

        sc.close();
    }
}
