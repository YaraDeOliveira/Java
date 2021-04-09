import java.util.Scanner;

public class ForSomaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SOMA DOS IMPARES");
        System.out.print("Valor inicial: ");
        int soma = 0, prov;
        int x = sc.nextInt();
        System.out.print("Valor final: ");
        int y = sc.nextInt();
        if (y < x){
            prov = y;
            y = x;
            x = prov;
        }
        for (int i = x+1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
                }
            }
            System.out.println(soma);

    }
}
