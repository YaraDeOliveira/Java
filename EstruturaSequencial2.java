import java.util.Scanner;

public class EstruturaSequencial2 {
    public static void main(String[] args) {
        double raio, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("AREA DO CIRCULO");
        System.out.println("Digite o valor do raio do circulo:");
        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("AREA = %.4f%n", area);


    }
}
