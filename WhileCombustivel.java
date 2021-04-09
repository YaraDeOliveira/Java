import java.util.Scanner;

public class WhileCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0, c2 = 0, c3 = 0;
        System.out.println("POSTO DE COMBUSTIVEL");
        System.out.println("MENU");
        System.out.println("1 \t Alcool \n2 \t Gasolina \n3 \t Diesel \n4 \t Fim");
        System.out.print("Opcao: ");
        int op = sc.nextInt();
        while (op != 4){
            if (op < 1 || op > 4){
                System.out.print("Digite uma opcao valida!");
                op = sc.nextInt();
            } else {
                if (op == 1){
                    c1 += 1;
                } else if (op == 2){
                    c2 += 1;
                } else {
                    c3 += 1;
                }
                System.out.print("Opcao: ");
                op = sc.nextInt();
            }

        }
        System.out.println("Muito Obrigado");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", c1, c2, c3 );
    }
}
