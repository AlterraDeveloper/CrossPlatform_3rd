import java.awt.*;
import javax.swing.*;

public class ShowColors extends JFrame{

public ShowColors(){
  super("Using Color and Font");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(550,200);

  Screen s = new Screen();

  add(s);

  setVisible(true);
}
  //
  // public void paint(Graphics g){
  //     Window w = new Window(this);
  //     g.setColor(Color.BLUE);
  //     g.drawRect(5,5,100,20);
  //     w.paint(g);
  //     setContentPane((JPanel)w);
  // }

  public static void main(String[] args) {
    ShowColors application = new ShowColors();
  }
}
