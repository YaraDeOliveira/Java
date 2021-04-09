import java.util.Scanner;

public class WhileMediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULO DE MEDIA DE IDADES");
        int x, soma = 0, contador = 0;
        double media;
        System.out.print("Idade: ");
        x = sc.nextInt();
        if (x < 0){
            System.out.println("Impossivel Calcular!");
        } else {
            while (x >= 0) {
                contador += 1;
                soma += x;
                System.out.print("Idade: ");
                x = sc.nextInt();
            }
            media = (double) soma/ contador;
            System.out.printf("%.2f%n",media);
        }
        System.out.println("Fim do Programa");

    }
}
