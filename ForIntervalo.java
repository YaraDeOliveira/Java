import java.util.Scanner;

public class ForIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contin = 0, contout = 0, z;
        System.out.println("NUMEROS NO INTERVALO DE 10 a 20");
        System.out.print("Qtde de numeros: ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++){
            System.out.printf("Digite o %d numero: ", i+1);
            z = sc.nextInt();
            if (z >= 10 && z <= 20){
                contin += 1;
            } else {
                contout += 1;
            }

        }
        System.out.printf("%d in %n%d out", contin, contout);
    }
}
