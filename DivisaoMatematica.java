import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisaoMatematica extends JFrame {
    private JPanel mainPanel;
    private JButton btnDividir;
    private JTextField txtDen;
    private JTextField txtNum;
    private JTextField lblDiv;
    private JTextField lblResto;
    private JLabel textField3;
    private JLabel textField4;

    public DivisaoMatematica (String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getText());
                int d = Integer.parseInt(txtDen.getText());
                float divisao = n / d;
                float rest = n % d;
                lblDiv.setText(Float.toString(divisao));
                lblResto.setText(Float.toString(rest));



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new DivisaoMatematica("Dividir dois numeros");
        frame.setVisible(true);
    }

}
