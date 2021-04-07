import java.util.Scanner;

public class EstrururaSequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, result;
        System.out.println("SOMA DE DOIS NUMEROS");
        System.out.println("Digite o primeiro valor: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextInt();
        result = n1 + n2;
        System.out.printf("SOMA = %d%n", result);
        sc.close();
    }
}
