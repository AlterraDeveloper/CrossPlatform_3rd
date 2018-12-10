import java.awt.*;
import javax.swing.*;

public class LineRectOvals extends JFrame{

  class Screen extends JPanel  {

    public Screen(){
      repaint();
    }

    public void paint(Graphics g){
      g.setColor(Color.RED);
      g.drawLine(10,30,210,30);

      g.setColor(Color.BLUE);
      g.drawLine(250,30,450,30);

      g.drawRect(10,60,200,60);
      g.fillRect(250,60,200,60);

      g.setColor(Color.RED);
      g.drawRoundRect(10,140,200,60,50,50);
      g.fillRoundRect(250,140,200,60,50,50);

      g.setColor(Color.YELLOW);
      g.drawRect(10,230,200,60);
      g.fillRect(250,230,200,60);

      g.setColor(Color.MAGENTA);
      g.drawOval(10,320,200,60);
      g.fillOval(250,320,200,60);
    }

  }

public LineRectOvals(){
  super("Line & Rectangle & Oval");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(500,450);
  setResizable(false);
  setBackground( Color.GRAY );
  Screen s = new Screen();

  add(s);

  setVisible(true);
  }
}
