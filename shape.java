import javax.swing.*;
import java.awt.*;

public class Shape extends JPanel {

    int[] xCoordinates = {60, 240, 440, 40};
    int[] yCoordinates = {60, 240, 40, 40};
    int numberOfPoints = 4;

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.drawPolygon(xCoordinates, yCoordinates, numberOfPoints);
        graphics.drawLine(20, 20, 160, 280);
        graphics.drawRect(300, 200, 160, 280);
        graphics.fillRect(200, 200, 80, 40);
        graphics.fillRoundRect(40, 320, 20, 60, 10, 10);
        graphics.drawRoundRect(20, 300, 160, 100, 20, 20);
        graphics.drawOval(550, 400, 100, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Shape());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
