import java.util.Scanner;

public class EstruturaSequencial5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CUPOM FISCAL");
        System.out.println("PRODUTO 1:");
        System.out.print("Codigo do produto: ");
        int cod1 = sc.nextInt();
        System.out.print("Qtde de pecas: ");
        int pec1 = sc.nextInt();
        System.out.print("Valor unitario: ");
        double preco1 = sc.nextDouble();
        System.out.println("PRODUTO 2:");
        System.out.print("Codigo do produto: ");
        int cod2 = sc.nextInt();
        System.out.print("Qtde de pecas: ");
        int pec2 = sc.nextInt();
        System.out.print("Valor unitario: ");
        double preco2 = sc.nextDouble();
        sc.close();
        System.out.println("VALOR DEVIDO");
        System.out.printf("Prod 1, cod = %d, %d pecas por R$ %.2f cada%n", cod1, pec1, preco1);
        System.out.printf("Valor total Prod 1 = %.2f\n", pec1*preco1);
        System.out.printf("Prod 2, cod = %d, %d pecas por R$ %.2f cada%n", cod2, pec2, preco2);
        System.out.printf("Valor total Prod 2 = %.2f", pec2*preco2);
        double total = pec1*preco1+pec2*preco2;
        System.out.printf("\nVALOR A PAGAR: R$ %.2f", total);

    }
}
