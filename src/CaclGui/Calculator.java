package CaclGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JButton Add;

    private JPanel MainPanel;
    private JButton Subtract;
    private JButton Divide;
    private JButton Multiply;
    private JButton sqrt;
    private JButton Power;
    private JButton pi;
    private JButton Eqauls;
    private JButton Clear;
    private JPanel Operations;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a0Button;
    private JButton cosXButton;
    private JButton sinXButton;
    private JPanel Numbers;
    private JLabel Calculation;

    public Calculator() {
        add(MainPanel);
        setTitle("Calculator");
        setSize(400,500);
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "+");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculation.setText("1");
            }
        });
    }

}
