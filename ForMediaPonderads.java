import java.util.Scanner;

public class ForMediaPonderads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MEDIA PONDERADA");
        double a, b, c, media;
        System.out.print("Digite a qte de vezes que deseja calcular a media: ");
        int x = sc.nextInt();
        for (int  i = 0; i < x; i++){
            System.out.print("Digite o valor: " );
            a = sc.nextDouble();
            System.out.print("Digite o valor: " );
            b = sc.nextDouble();
            System.out.print("Digite o valor: " );
            c = sc.nextDouble();
            media = (a*2+b*3+c*5)/10;
            System.out.printf("%.1f\n", media);
            }



    }
}
