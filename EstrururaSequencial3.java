import java.util.Scanner;

public class EstrururaSequencial3 {
    public static void main(String[] args) {
        int a, b, c, d, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para 'A': ");
        a = sc.nextInt();
        System.out.println("Digite o valor para 'B': ");
        b = sc.nextInt();
        System.out.println("Digite o valor para 'C': ");
        c = sc.nextInt();
        System.out.println("Digite o valor para 'D': ");
        d = sc.nextInt();
        sc.close();
        result = a*b - c*d;
        System.out.println("Processando... (a*b)-(c*d)=");
        System.out.printf("DIFERENCA %d%n", result);
    }
}
