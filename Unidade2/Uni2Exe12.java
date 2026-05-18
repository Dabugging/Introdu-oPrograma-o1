import java.util.Scanner;
public class Uni2Exe12 {
    public static void main(String[] args) {
        //Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) 
        //e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
        //\normalsize&space;distancia=\sqrt{(x_{2}-x_{1})^2+(y_{2}-y_{1})^2}
        Scanner sc = new Scanner(System.in);
        double p1X, p1Y, p2X, p2Y, distancia;

        System.out.println();
        System.out.print("Digite o valor X do ponto 1: ");
        p1X = sc.nextDouble();
        System.out.print("Digite o valor Y do ponto 1: ");
        p1Y = sc.nextDouble();
        System.out.println();

        System.out.print("Digite o valor X do ponto 2: ");
        p2X = sc.nextDouble();
        System.out.print("Digite o valor Y do ponto 2: ");
        p2Y = sc.nextDouble();
        System.out.println();

        distancia = Math.sqrt(Math.pow(p2X - p1X,2) + Math.pow(p2Y - p1Y,2));
        
        System.out.printf("A distância entre eles é de: %.4f", distancia);
        System.out.println();

        sc.close();
    }
}
