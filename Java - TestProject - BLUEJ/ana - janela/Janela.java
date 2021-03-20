import java.awt.*;
import javax.swing.*;
public class Janela extends JFrame { // por padrao jframe e border layout
    private JButton bt1 = new JButton("Bt 01");
    private JButton bt2 = new JButton("Bt 02");
    private JButton bt3 = new JButton("Bt 03");
    private JButton bt4 = new JButton("Bt 04");
    private JButton bt5 = new JButton("Bt 05");
    
    public Janela() {
        this.setTitle("Minha Janela");
        this.setSize(300,300);
        
        JPanel borda = new JPanel(); //Panel por padrao e flow layout.
        borda.add(bt1);
        borda.add(bt2);
        
        this.add(borda, BorderLayout.SOUTH);
        this.setVisible(true);
}

    public static void main(String [] args) {
        new Janela().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}