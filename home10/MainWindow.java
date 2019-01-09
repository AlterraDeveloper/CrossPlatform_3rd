import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class MainWindow extends JFrame{

    JButton jbutton;
    JTextArea jtextArea;

        MainWindow(){
            super("Serialization");
            jbutton = new JButton("Show details");
            jtextArea = new JTextArea();

            JScrollPane scrollPane = new JScrollPane(jtextArea);
            setLayout(new GridLayout(2,1));
            add(jbutton);
            add(scrollPane);

            jbutton.addActionListener((ActionEvent event) ->{
                jtextArea.setText("");
                DataManager dataManager = new DataManager("Serialize.ser");
                for(Country c : dataManager.getData()){
                    jtextArea.append(c.toString()+"\n");
                }
            });

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,600);
            setVisible(true);
        }
}
