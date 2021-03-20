import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EvtJanela extends JFrame {
    private JButton btOK = new JButton("OK");
    
    public EvtJanela() {
        super("Evento da Janela");
        JPanel pnVisor = new JPanel();
        pnVisor.add(btOK);
        
        btOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acaoBotao();
            }
        });
        
        this.setSize(300,300);
        this.add(pnVisor, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    private void acaoBotao() {
        JOptionPane.showMessageDialog(null, "Ativei o Botao OK");
    }
    public static void main(String [] args) {
        new EvtJanela().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
