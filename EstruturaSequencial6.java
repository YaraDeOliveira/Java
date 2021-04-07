import java.util.Scanner;

public class EstruturaSequencial6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULO DE AREAS");
        System.out.print("Digite o valor para A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor para B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor para C: ");
        double c = sc.nextDouble();
        double tri = (a * c) / 2;
        double cir = Math.PI* Math.pow(c, 2);
        double trap = ((a+b)*c)/2;
        double qua = Math.pow(b, 2);
        double ret = a*b;
        sc.close();
        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", cir);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", qua);
        System.out.printf("RETANGULO: %.3f%n", ret);



    }
}
