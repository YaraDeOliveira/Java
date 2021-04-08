import java.util.Scanner;

public class CondicionalNegPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int x = sc.nextInt();
        if (x < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.print("NAO NEGATIVO");
        }
        sc.close();
    }
}
