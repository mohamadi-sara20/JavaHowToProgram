//Here we place some components on panels to make a little window. No functionality added yet. 
package JavaHowToProgram.Chapter12;

import java.awt.*;
import javax.swing.*;
public class WindowForm extends JFrame{
    private JButton cancelButton;
    private JButton okButton;
    private JComboBox<String> box;
    private String[] colors = {"Red", "Green", "Yellow", "Black", "White"};
    JCheckBox checkBox1;
    JCheckBox checkBox2;



    public WindowForm(){
        setLayout(new  BorderLayout());


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());


        cancelButton = new JButton("Cancel");
        okButton = new JButton("OK");
        box = new JComboBox<>(colors);
        checkBox1 = new JCheckBox("Background");
        checkBox2 = new JCheckBox("Foreground");


        panel2.add(checkBox1);
        panel2.add(checkBox2);
        panel3.add(cancelButton);
        panel3.add(okButton);
        add(box, BorderLayout.NORTH);
        panel1.add(panel2, BorderLayout.NORTH);
        panel1.add(panel3, BorderLayout.SOUTH);
        add(panel1, BorderLayout.CENTER);
        box.setMaximumRowCount(3);
        panel1.setSize(10, 10);



    }





}
