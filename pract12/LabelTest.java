import java.awt.*;
import javax.swing.*;

public class LabelTest extends JFrame {
  private JLabel label1,label2,label3;

  LabelTest(){
    super("JLabel demonstration");
    Container container = getContentPane();
    container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));

    label1 = new JLabel("First");
    label2 = new JLabel("Second",new ImageIcon("icon.png"),JLabel.RIGHT);
    label3 = new JLabel("Third",new ImageIcon("icon.png"),JLabel.BOTTOM);

    container.add(label1);
    container.add(label2);
    container.add(label3);

    setSize(400,400);
    setVisible(true);
  }
}
