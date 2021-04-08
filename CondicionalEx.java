import java.util.Scanner;

public class CondicionalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BOLETIM");
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        double nf = n1+n2;
        System.out.printf("SOMATORIA DAS NOTAS = %.1f%n", nf);
        if (nf < 60.00){
            System.out.println("REPROVADO");
        } else{
            System.out.println("APROVADO");
        }
        sc.close();
    }
}
