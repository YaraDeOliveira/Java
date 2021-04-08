import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para A: ");
        double a = sc.nextDouble();
        System.out.print("Digite um valor para B: ");
        double b = sc.nextDouble();
        System.out.print("Digite um valor para C: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (a == 0 || delta < 0){
            System.out.print("Impossivel calcular");
        } else {
            double xpos = (-b + (Math.sqrt(delta))) / (2 * a);
            double xneg = (-b - (Math.sqrt(delta))) / (2 * a);
            sc.close();
            System.out.printf("R1 = %.5f%n", xpos);
            System.out.printf("R2 = %.5f%n", xneg);
        }

    }
}
