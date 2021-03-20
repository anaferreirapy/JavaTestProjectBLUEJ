import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Movimento extends JFrame implements Runnable {
   
    private int posEsq = 10;
    private Thread th;
    
    public Movimento() {
        super("Movimentar");
        this.setSize(500,200);
        JButton btIniciar = new JButton("Iniciar");
        JPanel pnBotao = new JPanel();
        pnBotao.add(btIniciar);
        
        btIniciar.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               movimentar();
            }
        });
        
        this.add(pnBotao, BorderLayout.SOUTH);
        this.setVisible(true);
}

public void paint(Graphics g) {
    super.paint(g);
    g.fillOval(posEsq, 30, 50, 50);
}

private void movimentar() {
    th = new Thread(this);
    th.start();
}
public void run() {
    for (posEsq = 10; posEsq < 480; posEsq++) {
        this.repaint();
        try { th.sleep(5); } catch (Exception e) { } 
    }
}

public static void main(String [] args) {
    new Movimento().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
