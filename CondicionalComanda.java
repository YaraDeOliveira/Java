import java.util.Scanner;

public class CondicionalComanda {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("Codigo \t Especificacao \t Preco");
        System.out.println("1 \t Cachorro-Quente \t R$4,00");
        System.out.println("2 \t X-Salada \t\t\t R$4,50 ");
        System.out.println("3 \t X-Bacon \t\t\t R$5,00");
        System.out.println("4 \t Torrada Simples \t R$2,00");
        System.out.println("5 \t Refrigerante \t\t R$1,50");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a opcao do lanche desejado: ");
        int o = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int q = sc.nextInt();
        if (o == 1) {
            double t = q * 4.00;
            System.out.printf("Foram %d Cachorro-Quente, total de R$%.2f", q, t);
        } else if (o == 2) {
            double t = q * 4.50;
            System.out.printf("Foram %d X-Salada, total de R$%.2f", q, t);
        } else if (o == 3) {
            double t = q * 5.00;
            System.out.printf("Foram %d X-Bacon, total de R$%.2f", q, t);
        } else if (o == 4) {
            double t = q * 2.00;
            System.out.printf("Foram %d Torrada Simples, total de R$%.2f", q, t);
        } else if (o == 5) {
            double t = q * 1.50;
            System.out.printf("Foram %d Refrigerante, total de R$%.2f", q, t);
        } else{
            System.out.println("Opcao Invalida");
        }
    }
}
