import java.util.Scanner;
public class Uni2Exe11 {
    public static void main(String[] args) {
        //Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159).
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.println();
        System.out.print("Digite um valor para A: ");
        A = sc.nextDouble();

        System.out.print("Digite um valor para B: ");
        B = sc.nextDouble();
            
        System.out.print("Digite um valor para C: ");
        C = sc.nextDouble();

        areaTriangulo = (A * C) / 2;
        areaCirculo = Math.PI * Math.pow(C, 2);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.println();
        System.out.println("Área do triângulo: " + areaTriangulo);
        System.out.printf("Área do círculo: %.2f", areaCirculo);
        System.out.println();
        System.out.println("Área do trapézio: " + areaTrapezio);
        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println();

        sc.close();
    }
}
