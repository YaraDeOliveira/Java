import java.util.Scanner;

public class ForPotencia {
    public static void main(String[] args) {
        double totquad, totcub;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a qde de numeros:");
        int qtde = sc.nextInt();
        for (int c = 1; c<=qtde; c++){
            totquad = Math.pow(c, 2);
            totcub = Math.pow(c, 3);
            System.out.printf("%d %.0f %.0f%n", c, totquad, totcub);
        }
        sc.close();
    }
}
