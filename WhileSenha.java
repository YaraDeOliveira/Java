import java.util.Scanner;

public class WhileSenha {
    public static void main(String[] args) {
        System.out.println("DESCUBRA A SENHA");
        Scanner sc = new Scanner(System.in);
        int x = 2002, y = 0;
        while (x != y){
            System.out.print("Digite a senha: ");
            y = sc.nextInt();
            System.out.println((x != y) ? "Senha Invalida" : "Acesso Permitido");
        }
    }
}
