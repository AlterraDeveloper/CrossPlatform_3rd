import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.image.*;

public class Shapes extends JFrame {

 class Screen extends JPanel {
  public Screen() {
   repaint();
  }

  public void paint(Graphics g) {
   Graphics2D g2d = (Graphics2D) g;
   g2d.setPaint(new GradientPaint(5, 30, Color.blue, 35, 100, Color.yellow, true));
   g2d.fill(new Ellipse2D.Double(5, 60, 65, 100));

   g2d.setPaint(Color.RED);
   g2d.fill3DRect(100, 10, 100, 200, true);
   g2d.setPaint(Color.WHITE);
   g2d.fill3DRect(100 + 15, 10 + 15, 100 - 15 * 2, 200 - 15 * 2, false);

   Image ris = getToolkit().getImage("1.jpg");
   BufferedImage bufImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
   Graphics2D cont = bufImage.createGraphics();
   cont.drawImage(ris, 0, 0, this);
   TexturePaint texture =
    new TexturePaint(bufImage, new Rectangle2D.Double(0.0, 0.0, 25.0, 25.0));
   g2d.setPaint(texture);
   g2d.fill(new RoundRectangle2D.Float(100, 250, 350, 130, 25, 25));

   g2d.setPaint(Color.BLUE);
   g2d.fill(new Arc2D.Float(250, 50, 100, 100, 0, 270, Arc2D.PIE));
   g2d.setPaint(Color.WHITE);
   g2d.fillArc(250 + 5, 50 + 5, 100 - 25, 100 - 25, 0, 270);

   g2d.setPaint(Color.GREEN);
   g2d.drawLine(450, 50, 550, 200);
   g2d.setPaint(Color.CYAN);
   float[] shtrich = {    20,    10   };
   BasicStroke bs =
    new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 3, shtrich, 0);
   g2d.setStroke(bs);
   g2d.draw(new Line2D.Float(450, 200, 550, 50));



   }
  }


 public Shapes() {
  super("Shapes");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(600, 600);
  setResizable(false);
  Screen s = new Screen();

  add(s);

  setVisible(true);
 }

}
