import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        System.out.print("A resolucao da tela: ");
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)tela.getWidth();
        int altura = (int)tela.getHeight();
        System.out.print(largura+"x"+altura);
    }
}
