import java.util.Scanner;

public class EstruturaSequencialEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULO DO VALOR DO TERRENO");
        System.out.println("Digite a largura do terreno: ");
        double larg = sc.nextDouble();
        System.out.println("Digite o comprimento co terreno: ");
        double comp = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        double valor = sc.nextDouble();
        double area = larg * comp;
        double preco = valor * area;
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        sc.close();

    }
}
