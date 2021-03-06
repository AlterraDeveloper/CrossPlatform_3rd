import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.text.NumberFormat;
import java.io.UnsupportedEncodingException;

public class MainWindow extends JFrame{
    JLabel cNameLabel,cCapitalLabel,cSquareLabel,cPopulationLabel;
    JTextField cNameTxt,cCapitalTxt,cSquareTxt,cPopulationTxt;
    JButton saveBtn,deleteBtn,resetBtn;

    MainWindow(){
        super("Info-Search System");
        DataManager dataMngr = new DataManager("Serialize.ser");
        ArrayList<Country> data = new ArrayList<>(dataMngr.getData());

        cNameLabel = new JLabel("Country name : ");
        cCapitalLabel = new JLabel("Country capital : ");
        cSquareLabel = new JLabel("Country square (km^2) : ");
        cPopulationLabel  = new JLabel("Country population : ");

        cNameTxt = new JTextField(10);
        cCapitalTxt = new JTextField(10);
        cSquareTxt = new JTextField(10);
        cPopulationTxt = new JTextField(10);

        saveBtn = new JButton("Save");
        deleteBtn = new JButton("Delete");
        resetBtn = new JButton("Reset params");

        String[] countryParams = {"Name","Capital","Square","Population"};
        TableModel dataModel = new DefaultTableModel(countryParams,0);

      JTable table = new JTable(dataModel);
      table.setModel(loadDataToTable(table,dataMngr));
      JScrollPane scrollpane = new JScrollPane(table);

        setLayout(new GridLayout(6,2));
        add(cNameLabel);
        add(cNameTxt);
        add(cCapitalLabel);
        add(cCapitalTxt);
        add(cSquareLabel);
        add(cSquareTxt);
        add(cPopulationLabel);
        add(cPopulationTxt);
        add(saveBtn);
        add(deleteBtn);

        setLayout(new FlowLayout());
        add(resetBtn);
        add(scrollpane);

        saveBtn.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent event){
                 Country newCountry = new Country();
                 try{
                     newCountry = new Country(
                     cNameTxt.getText(),
                     cCapitalTxt.getText(),
                     new Double(cSquareTxt.getText()),
                     new Long(cPopulationTxt.getText()));
                 }catch(NumberFormatException ex){
                     cSquareTxt.setText("");
                     cPopulationTxt.setText("");
                     return;
                 }
                 if(dataMngr.checkEntity(newCountry)){
                    dataMngr.addEntity(newCountry);
                    table.setModel(loadDataToTable(table,dataMngr));
                    JOptionPane.showMessageDialog(null,"Saved successfully!");
                 }
             }
        });

        deleteBtn.addActionListener((ActionEvent event) -> {
                int[] selectedRows = table.getSelectedRows();
                int offset = 0;
                if(selectedRows.length > 0){
                    for(int index : selectedRows){
                        Country c = dataMngr.removeEntity(index-offset);
                        if(c != null){
                             offset++;
                             table.setModel(loadDataToTable(table,dataMngr));
                             JOptionPane.showMessageDialog(null,c.toString()+"\nDeleted successfully!");
                        }
                    }
                }else JOptionPane.showMessageDialog(null,"Choose row(-s) in table for removing");
             });

    resetBtn.addActionListener((ActionEvent event) ->{
        cNameTxt.setText("");
        cCapitalTxt.setText("");
        cSquareTxt.setText("");
        cPopulationTxt.setText("");
    });

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowListener(){
            public void windowClosing(WindowEvent e){
                    dataMngr.saveYourself("Serialize.ser");
                    System.exit(0);
            }

            public void windowClosed(WindowEvent e) {}

            public void windowOpened(WindowEvent e) {}

            public void windowIconified(WindowEvent e) {}

            public void windowDeiconified(WindowEvent e) {}

            public void windowActivated(WindowEvent e) {}

            public void windowDeactivated(WindowEvent e) {}
        });
    }

private TableModel loadDataToTable(JTable table,DataManager dataManager){
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);
    for(Country entity : dataManager.getData()){
        Object[] rowData = {
            entity.getName(),
            entity.getCapital(),
            NumberFormat.getNumberInstance().format(entity.getSquare()),
            NumberFormat.getNumberInstance().format(entity.getPopulation())};
        model.addRow(rowData);
    }
    return model;
}
}
