import java.util.Scanner;

public class EstruturaSequencial4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULO DE SALARIO");
        System.out.print("Digite o numero do funcionario:");
        int num = sc.nextInt();
        System.out.print("Digite a qtde de horas trabalhadas: ");
        double hour = sc.nextDouble();
        System.out.print("Digite o valor recebido por hora: ");
        double valor = sc.nextDouble();
        double salario = hour * valor;
        sc.close();
        System.out.printf("NUMBER = %d%n", num);
        System.out.printf("SALARY = U$ %.2f",salario);
    }
}
