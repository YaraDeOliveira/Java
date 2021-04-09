import java.util.Scanner;

public class ForSomaImpar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero entre 1 ate 1000");
        x = sc.nextInt();
        while (x > 1000 || x < 1){
            System.out.println("Digite um numero entre 1 ate 1000");
            x = sc.nextInt();
        }
        for (int i=1; i <= x; i++){
            if (i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
}
