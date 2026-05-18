import java.util.Scanner;
public class Uni2Exe16 {
    public static void main(String[] args) {
        //Uma fábrica de refrigerantes vende seu produto em três formatos: 
        //lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
        //Se um comerciante compra uma determinada quantidade de cada formato, 
        //informe quantos litros de refrigerante ele comprou.
        Scanner sc = new Scanner(System.in);
        double lata350, garrafa600, garrafa2;
        double litros;
        
        System.out.print("");
        System.out.print("Digite a quantidade de latas de 350ml: ");
        lata350 = sc.nextInt();
        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        garrafa600 = sc.nextInt();
        System.out.print("Digite a quantidade de garrafas de 2L: ");
        garrafa2 = sc.nextInt();
        System.out.print("");

        litros = ((garrafa2 * 2.0) + (lata350 * 0.350) + (garrafa600 * 0.600));

        System.out.print("Você comprou " + litros + " litro(s) de refrigerante.");
        System.out.print("");
        sc.close();
    
    }
}
