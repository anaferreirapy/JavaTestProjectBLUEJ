import javax.swing.*;
import java.awt.*;

public class Java2D extends JFrame {
    
    public Java2D() {
        super("Exemplo de Java 2D");
        this.setSize(300, 300);
        this.setVisible(true);
    
    }
    
    public void paint(Graphics g) {
        super.paint(g);// desenha vc primeiro
        for (short i = 0; i < 400; i++) {
            g.setColor(new Color(
            (int)(Math.random()*256),
            (int)(Math.random()*256),
            (int)(Math.random()*256)));
            g.drawLine(
            (int)(Math.random()*200),
            (int)(Math.random()*200),
            (int)(Math.random()*200),
            (int)(Math.random()*200));
        }
    }
        public static void main(String [] args){
        new Java2D().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}