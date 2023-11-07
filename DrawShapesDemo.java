import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawShapesDemo extends JFrame implements MouseListener {
    int x, y, shapeIndex;

    public DrawShapesDemo() {
        addMouseListener(this);
        shapeIndex = 1;
        setSize(350, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        switch(shapeIndex) {
            case 1:
                g.drawOval(x, y, 50, 50);
                break;
            case 2:
                g.drawRect(x, y, 60, 50);
                break;
            case 3:
                g.drawOval(x, y, 140, 100);
        }
        shapeIndex++;
        if(shapeIndex == 4) {
            shapeIndex = 1;
        }
    }

    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        repaint();
    }

    public void mouseExited(MouseEvent me) {}

    public void mousePressed(MouseEvent me) {}

    public void mouseReleased(MouseEvent me) {}

    public static void main(String[] args) {
        new DrawShapesDemo();
    }
}
