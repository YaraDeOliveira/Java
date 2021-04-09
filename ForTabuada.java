import java.util.Scanner;

public class ForTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabuada");
        System.out.print("Digite qual tabuada voce quer ver: ");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++){
            int tot = i * n;
            System.out.printf("%d x %d = %d %n", i, n , tot);
        }
    }
}
