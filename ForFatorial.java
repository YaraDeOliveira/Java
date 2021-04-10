import java.util.Scanner;

public class ForFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FATORIAL");
        System.out.print("Calcule o fatorial do numero: ");
        int x = sc.nextInt();
        int d = 1;
        for (int i = 1; i<=x; i++){
            d = d * i;
            System.out.println(d);
        }
        System.out.printf("Fatorial de %d eh %d", x, d);
    }
}
