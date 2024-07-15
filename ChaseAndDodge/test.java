<code>import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.*;

public class Sphere3D extends JPanel implements ActionListener {
    Timer t = new Timer(5, this);
    double x = 0, y = 0, velX = 0, velY = 0;

    public Sphere3D() {
        t.start();
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(500, 500));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.translate(250, 250);
        g2.rotate(Math.toRadians(x));
        g2.fill(new Ellipse2D.Double(-100, -100, 200, 200));
    }

    public void actionPerformed(ActionEvent e) {
        x += velX;
        y += velY;
        repaint();
    }

    public static void main(String[] args) {
        Sphere3D s = new Sphere3D();
        JFrame f = new JFrame();
        f.add(s);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
</code>