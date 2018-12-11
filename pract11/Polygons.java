import java.awt.*;
import javax.swing.*;

public class Polygons extends JFrame{

class Screen extends JPanel  {

  public Screen(){
    repaint();
  }

  public void paint(Graphics g){
    Polygon p = new Polygon();
    p.addPoint(10,10);
    p.addPoint(35,65);
    p.addPoint(65,45);
    p.addPoint(115,85);
    p.addPoint(150,17);
    p.addPoint(220,176);
    g.setColor(Color.BLACK);
    g.fillPolygon(p);

    Polygon p1 = new Polygon();
    p1.addPoint(150,155);
    p1.addPoint(178,258);
    p1.addPoint(254,312);
    p1.addPoint(142,129);
    p1.addPoint(318,165);
    g.drawPolygon(p1);


  }

}
public Polygons(){
  super("Polygons");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(500,500);
  setResizable(false);
  Screen s = new Screen();

  add(s);

  setVisible(true);
  }
}
