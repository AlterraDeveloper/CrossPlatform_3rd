import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextFieldTest extends JFrame
{
    private JTextField
        textField1,
        textField2,
        textField3;
    private JPasswordField passwordField;

    TextFieldTest(){
        super("Test of JTextField & JPasswordField");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        textField1 = new JTextField(15);
        textField2 = new JTextField("Input text",11);
        textField3 = new JTextField("Noneditable text field",30);
        passwordField = new JPasswordField(25);

        textField1.addActionListener(new TextFieldHandler());
        textField2.addActionListener(new TextFieldHandler());
        textField3.addActionListener(new TextFieldHandler());
        passwordField.addActionListener(new TextFieldHandler());

        textField3.setEditable(false);

        add(textField1);
        add(textField2);
        add(textField3);
        add(passwordField);

        setSize(350,120);
        setVisible(true);
    }

    private class TextFieldHandler implements ActionListener
        {
         public void actionPerformed(ActionEvent event)
         {
          String string="";
          if(event.getSource()==textField1) string="textField1:"+event.getActionCommand();
          if(event.getSource()==textField2) string="textField2:"+event.getActionCommand();
          if(event.getSource()==textField3) string="textField3:"+event.getActionCommand();
          if(event.getSource()==passwordField)
           {            
             string="paswordField:"+ new String(passwordField.getPassword());
           } JOptionPane.showMessageDialog(null,string);
       }
    }
}
