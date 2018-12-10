import java.awt.*;
import javax.swing.*;

public class ShowColors extends JFrame{

public ShowColors(){
  super("Using Color and Font");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(550,225);
  setResizable(false);

  Screen s = new Screen();

  add(s);

  setVisible(true);
}

  public static void main(String[] args) {
    ShowColors application = new ShowColors();
  }
}
