//A very simple calculator for Chapter#12 of JavaHowToProgram. We also added a few simple functions to it for practice. 
package JavaHowToProgram.Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator extends JFrame {
    private JButton[] digits;
    private String operator;
    private JTextField input;
    private JButton buttonMinus;
    private JButton buttonPlus;
    private JButton buttonDivision;
    private JButton buttonMultiplication;
    private JButton buttonEquals;
    private JButton buttonPoint;
    private double operand;
    private JButton clearButton;
    private JButton backButton;

    public Calculator() {


        setLayout(new BorderLayout());

        input = new JTextField();
        add(input, BorderLayout.NORTH);
        JPanel gridPanel = new JPanel();
        add(gridPanel, BorderLayout.CENTER);
        gridPanel.setLayout(new GridLayout(4, 5, 4, 4));

        buttonPoint = new JButton(".");
        buttonDivision = new JButton("/");
        buttonMinus = new JButton("-");
        buttonMultiplication = new JButton("*");
        buttonPlus = new JButton("+");
        buttonEquals = new JButton("=");
        digits = new JButton[10];
        clearButton = new JButton("C");
        backButton = new JButton("<-");

        Handler handler = new Handler();

        gridPanel.add(buttonPoint);
        gridPanel.add(buttonDivision);
        gridPanel.add(buttonEquals);
        gridPanel.add(buttonMinus);
        gridPanel.add(buttonMultiplication);
        gridPanel.add(buttonPlus);
        gridPanel.add(clearButton);
        gridPanel.add(backButton);
        for (int i = 0; i <= 9; i++) {
            digits[i] = new JButton(Integer.toString(i));
            gridPanel.add(digits[i]);
            digits[i].addMouseListener(handler);
        }


        buttonEquals.addMouseListener(handler);
        buttonPlus.addMouseListener(handler);
        buttonMultiplication.addMouseListener(handler);
        buttonDivision.addMouseListener(handler);
        buttonMinus.addMouseListener(handler);
        buttonPoint.addMouseListener(handler);
        clearButton.addMouseListener(handler);
        backButton.addMouseListener(handler);


    }

    public class Handler extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent event) {
            JButton buttonClicked = (JButton) event.getComponent();
            String buttonText = buttonClicked.getText();
            String text = "";


            switch (buttonText) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case ".":
                    input.setText(input.getText() + buttonText);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":

                    try{
                        Double.parseDouble(input.getText());

                    }
                    catch (Exception exception){
                        System.out.println("Invalid input");
                        return;
                    }


                    if(operator == null) {
                        operator = buttonText;
                        operand = Double.parseDouble(input.getText());
                        input.setText("");
                    }
                    else{
                        applyOperand(Double.parseDouble(input.getText()));
                        operator = buttonText;
                        operand = Double.parseDouble(input.getText());
                        input.setText("");
                    }
                    break;

                case "=":
                    if(operator != null){
                        applyOperand(Double.parseDouble(input.getText()));
                        operator = null;
                    }
                    break;
                case "C":
                    operand = 0.0;
                    operator = null;
                    input.setText("");
                    break;
                case "<-":
                    if(input.getText().length()>0)
                        input.setText(input.getText().substring(0, input.getText().length()-1));
                    break;

            }


        }

    }


    public void applyOperand(double operand2) {

        switch (operator) {
            case "+":
                input.setText(Double.toString(operand + operand2));
                break;
            case "-":
                input.setText(Double.toString(operand - operand2));
                break;
            case "*":
                input.setText(Double.toString(operand * operand2));
                break;
            case "/":
                input.setText(Double.toString(operand / operand2));

        }

    }

}


