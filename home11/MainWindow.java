import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.lang.reflect.*;

public class MainWindow extends JFrame{
    JLabel jlabel;
    JTextField inputField;
    JTextArea detailsArea;

    MainWindow(){
        super("Reflection");
        jlabel = new JLabel("Class : ");
        inputField = new JTextField(15);
        detailsArea = new JTextArea(20,60);
        detailsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(detailsArea);
        setLayout(new GridLayout(1,2));
        add(jlabel);
        add(inputField);
        setLayout(new FlowLayout());
        add(scrollPane);

        inputField.addActionListener((ActionEvent event) ->{
            String className = inputField.getText();
            detailsArea.setText("Methods of class "+ className + " : " );
            try{
                for(Method method : Class.forName(className).getMethods()){
                    detailsArea.append("\n");
                    detailsArea.append(method.toString());
                }
            }catch(ClassNotFoundException ex){
                    detailsArea.append("\n");
                    detailsArea.append("Class not found :(");
            }
        });

        setSize(700,400);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
