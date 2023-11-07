import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends JPanel implements MouseListener, MouseMotionListener {
    String message = "";
    int mouseX = 0, mouseY = 0;

    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        message = "Mouse clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        message = "Mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        message = "Mouse exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        message = "Mouse button down";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        message = "Mouse button released";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        message = "*";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(message, mouseX, mouseY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MouseEventsDemo panel = new MouseEventsDemo();
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
