import java.util.Scanner;

public class CondicionalExVideo {
    public static void main(String[] args) {
        int a, b, c, menor = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a <= b && a <= c){
            menor = a;
        } else if (b <= c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("MENOR = " + menor);

    }
}
