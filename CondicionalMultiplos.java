import java.util.Scanner;

public class CondicionalMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Digite o valor para A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor para A: ");
        int b = sc.nextInt();
        if (a < b){
            x = b;
            b = a;
            a = x;
        }
        if (a % b == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
        sc.close();
    }
}
