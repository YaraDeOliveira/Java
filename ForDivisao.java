import java.util.Scanner;

public class ForDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIVISAO");
        System.out.print("Digite a qtde de vezes que deseja realizar a operacao: ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++){
            System.out.print("Digite o primeiro valor: ");
            double z = sc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double y = sc.nextDouble();
            if (y == 0){
                System.out.println("Divisao impossivel");
            } else {
                double d = z / y;
                System.out.println(d);
            }

        }
        System.out.println("Fim do Programa");
    }
}
