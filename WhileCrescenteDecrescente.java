import java.util.Scanner;

public class WhileCrescenteDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Digite o valor para x:");
        x = sc.nextInt();
        System.out.print("Digite o valor para y:");
        y = sc.nextInt();
        while (x != y){
            System.out.println((x < y) ? "Crescente" : "Decrescente");
            System.out.print("Digite o valor para x:");
            x = sc.nextInt();
            System.out.print("Digite o valor para y:");
            y = sc.nextInt();
        }
        sc.close();
        System.out.println("Fim do programa");
    }
}
