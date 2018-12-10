import java.awt.*;
import javax.swing.*;

public class Screen extends JPanel  {

  public Screen(){
    repaint();
  }

  public void paint(Graphics g){

    g.setColor(Color.RED);
    g.fillRect(10,10+40*0,100,30);

    g.setColor(Color.GREEN);
    g.fillRect(10,10+40*1,100,30);

    g.setColor(Color.BLUE);
    g.fillRect(10,10+40*2,100,30);

    g.setColor(Color.MAGENTA);
    g.fillRect(10,10+40*3,100,30);
  }
}
