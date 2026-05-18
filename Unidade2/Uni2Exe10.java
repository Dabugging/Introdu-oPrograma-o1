import java.util.Scanner;
public class Uni2Exe10 {
    public static void main(String[] args) {
        //Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
        //e informe-o expresso no formato horas:minutos:segundos.
        Scanner sc = new Scanner(System.in);
        int duracaoSegundos;
        int horas, minutosTotais, minutosSubtraidos, segundos;

        System.out.println();
        System.out.print("Digite o tempo de duração em segundos do evento: ");
        duracaoSegundos = sc.nextInt();
        System.out.println();

        minutosTotais = (duracaoSegundos/60);
        horas = (minutosTotais/60);
        minutosSubtraidos = (minutosTotais - (horas*60)); // ou minutosSubtraidos = (minutosTotais % 60);
        segundos = (duracaoSegundos % 60);
    
        System.out.println("O evento durou " + horas + " hora(s) " + minutosSubtraidos + " minuto(s) e " + segundos + " segundo(s).");
        System.out.println();
        sc.close();
    }
}
