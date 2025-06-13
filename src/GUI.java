import javax.swing.*;

public class GUI extends JFrame {
    private JTextField txCislo;
    private JButton btGeneruj;
    private JTextField txNasobky;
    private JPanel pnMain;
    private JTable table1;
    private int cislo;
    public GUI(){
        setContentPane(pnMain);
        setTitle("generování čísla");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txNasobky.setEditable(false);

        btGeneruj.addActionListener(e -> vytvorCislo());


    }

    private void vytvorCislo(){
        if(txCislo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Zadejte číslo", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            int cislo = Integer.parseInt(txCislo.getText());
            CisloTableModel model = new CisloTableModel(cislo);
            table1.setModel(model);

            txNasobky.setText("Násobky čísla: " + cislo);

        }
    }
}
