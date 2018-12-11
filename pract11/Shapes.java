import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Shapes extends JFrame{

class Screen extends JPanel{
    public Screen(){
      repaint();
    }

     public void paint(Graphics g){
         Graphics2D g2d = (Graphics2D) g;
         g2d.setPaint(new GradientPaint(5,30,Color.blue,35,100,Color.yellow,true));
         g2d.fill(new Ellipse2D.Double(5,60,65,100));

         g2d.setPaint(Color.RED);
         g2d.fill3DRect(100,10,200,100,true);
         g2d.setPaint(Color.WHITE);
         g2d.fill3DRect(100+15,10+15,200-15*2,100-15*2,false);
     }
}

public Shapes(){
  super("Shapes");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(600,600);
  setResizable(false);
  Screen s = new Screen();

  add(s);

  setVisible(true);
  }

}
