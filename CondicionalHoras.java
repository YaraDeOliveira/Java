import java.util.Scanner;

public class CondicionalHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        System.out.print("Digite a hora inicial: ");
        int hini = sc.nextInt();
        System.out.print("Digite a hora final: ");
        int hfim = sc.nextInt();
        if (hini >= hfim) {
            d = (24 - hini) + hfim;
        } else {
            d = hfim - hini;
        }
        System.out.printf("O JOGO DUROU %d HORAS", d);
        sc.close();
    }
}
