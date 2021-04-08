import java.util.Scanner;

public class CondicionalIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Renda \t\t\t\t\t\t Imposto Devido");
        System.out.println("de 0.00 a R$ 2000.00 \t\t\t Isento");
        System.out.println("de R$ 2000.01 a R$ 3000.00 \t\t 8%");
        System.out.println("de R$ 3000.01 a R$ 4500.00 \t\t 18%");
        System.out.println("acima de R$ 4500.00 \t\t\t 28%");
        System.out.print("Digite o valor do salario ");
        double sal = sc.nextDouble();
        double imp = 0, imp1 = 0, imp2 = 0, imp3 = 0;
        if (sal > 4500) {
            imp1 = (sal - 4500) * 0.28;
            sal = 4500;
        }
        if (sal > 3000.01 && sal <= 4500) {
            imp2 = (sal - 3000.01) * 0.18;
            sal = 3000;
        }
        if (sal > 2000.01 && sal <= 3000) {
            imp3 = (sal - 2000.01) * 0.08;
            sal = 2000;
        }
        if (sal > 0.00 && sal <= 2000) {
            imp = 0;
        }
        double tot = imp1 + imp2 + imp + imp3;
        if (tot == 0){
        System.out.println("Isento");
        } else {
        System.out.printf("R$ %.2f", tot);
        }
        sc.close();
    }
}
