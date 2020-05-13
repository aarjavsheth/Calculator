import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    /**
     * Create the application.
     */
    private Calculator() {
        initialize();
    }

    private JFrame frame;
    private JTextField textField;
    private double num1,num2,result;
    private String answer,operation;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void initialize() {
        final String fontFamily = "Times New Roman";
        frame = new JFrame("Calculator");

        frame.setSize(450, 590);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        // Row 1
        /** Text Field */
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font(fontFamily, Font.PLAIN, 40));
        textField.setBounds(10, 20, 420, 90);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        /** On/Off Buttons */
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton = new JRadioButton("On");
        radioButton.setFont(new Font(fontFamily, Font.PLAIN, 17));
        radioButton.setBounds(10, 115, 70, 35);
        frame.getContentPane().add(radioButton);

        JRadioButton radioButton1 = new JRadioButton("Off");
        radioButton1.setFont(new Font(fontFamily, Font.PLAIN, 17));
        radioButton1.setBounds(10, 152, 70, 35);
        frame.getContentPane().add(radioButton1);
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton1);

        /** Backspace Button */
        JButton backspaceButton = new JButton("<");
        backspaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String backspace;
                    if(textField.getText().length()>0) {
                        StringBuilder obj = new StringBuilder(textField.getText());
                        obj.deleteCharAt(textField.getText().length() - 1);
                        backspace = obj.toString();
                        textField.setText(backspace);
                    }

                } catch (Exception e1) {

                }
            }
        });
        backspaceButton.setFont(new Font(fontFamily, Font.BOLD, 22));
        backspaceButton.setForeground(new Color(40, 26, 23));
        backspaceButton.setBounds(104, 115, 100, 70);
        frame.getContentPane().add(backspaceButton);

        /** All Clear Button */
        JButton clearButton = new JButton("AC");
        clearButton.setFont(new Font(fontFamily, Font.BOLD, 22));
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        clearButton.setBounds(218, 115, 100, 70);
        frame.getContentPane().add(clearButton);

        /** Percentage Button */
        JButton percentageButton = new JButton("%");
        percentageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "%";
                } catch (Exception e1) {
                }
            }
        });
        percentageButton.setFont(new Font(fontFamily, Font.BOLD, 28));
        percentageButton.setBounds(328, 115, 100, 70);
        frame.getContentPane().add(percentageButton);

        // Row 2
        /** Button 7 */
        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button7.getText();
                textField.setText(num);
            }
        });
        button7.setFont(new Font(fontFamily, Font.BOLD, 22));
        button7.setBounds(10, 200, 85, 70);
        frame.getContentPane().add(button7);

        /** Button 8 */
        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button8.getText();
                textField.setText(num);
            }
        });
        button8.setFont(new Font(fontFamily, Font.BOLD, 22));
        button8.setBounds(104, 200, 100, 70);
        frame.getContentPane().add(button8);

        /** Button 9 */
        JButton button9 = new JButton("9");
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button9.getText();
                textField.setText(num);
            }
        });
        button9.setFont(new Font(fontFamily, Font.BOLD, 22));
        button9.setBounds(218, 200, 100, 70);
        frame.getContentPane().add(button9);

        /** Division Button */
        JButton divideButton = new JButton("÷");
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="/";
                } catch (Exception e1) {

                }
            }
        });
        divideButton.setFont(new Font(fontFamily, Font.BOLD, 22));
        divideButton.setBounds(328, 200, 100, 70);
        frame.getContentPane().add(divideButton);

        // Row 3
        /** Button 4 */
        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button4.getText();
                textField.setText(num);
            }
        });
        button4.setFont(new Font(fontFamily, Font.BOLD, 22));
        button4.setBounds(10, 288, 85, 70);
        frame.getContentPane().add(button4);

        /** Button 5 */
        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button5.getText();
                textField.setText(num);
            }
        });
        button5.setFont(new Font(fontFamily, Font.BOLD, 22));
        button5.setBounds(104, 288, 100, 70);
        frame.getContentPane().add(button5);

        /** Button 6 */
        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button6.getText();
                textField.setText(num);
            }
        });
        button6.setFont(new Font(fontFamily, Font.BOLD, 22));
        button6.setBounds(218, 288, 100, 70);
        frame.getContentPane().add(button6);

        /** Subtraction Button */
        JButton minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "-";
                } catch (Exception e1) {

                }
            }
        });
        minusButton.setFont(new Font(fontFamily, Font.BOLD, 28));
        minusButton.setBounds(328, 288, 100, 70);
        frame.getContentPane().add(minusButton);

        // Row 4
        /** Button 1 */
        JButton button1 = new JButton("1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText() + button1.getText();
                textField.setText(num);
            }
        });
        button1.setFont(new Font(fontFamily, Font.BOLD, 22));
        button1.setBounds(10, 376, 85, 70);
        frame.getContentPane().add(button1);

        /** Button 2 */
        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button2.getText();
                textField.setText(num);
            }
        });
        button2.setFont(new Font(fontFamily, Font.BOLD, 22));
        button2.setBounds(104, 376, 100, 70);
        frame.getContentPane().add(button2);

        /**Button 3 */
        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button3.getText();
                textField.setText(num);
            }
        });
        button3.setFont(new Font(fontFamily, Font.BOLD, 22));
        button3.setBounds(218, 376, 100, 70);
        frame.getContentPane().add(button3);

        /** Multiplication Button */
        JButton multiplyButton = new JButton("x");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "x";
                } catch (Exception e1) {

                }
            }
        });
        multiplyButton.setFont(new Font(fontFamily, Font.BOLD, 28));
        multiplyButton.setBounds(328, 376, 100, 70);
        frame.getContentPane().add(multiplyButton);

        // Row 5
        /** Decimal Button */
        JButton decimalButton = new JButton(".");
        decimalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String num=textField.getText() + decimalButton.getText();
                    textField.setText(num);

                } catch (Exception e1) {
                }
            }
        });
        decimalButton.setFont(new Font(fontFamily, Font.BOLD, 28));
        decimalButton.setBounds(10, 464, 85, 70);
        frame.getContentPane().add(decimalButton);

        /** Button 0 */
        JButton button0 = new JButton("0");
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = textField.getText() + button0.getText();
                textField.setText(num);

            }
        });
        button0.setFont(new Font(fontFamily, Font.BOLD, 22));
        button0.setBounds(104, 464, 85, 70);
        frame.getContentPane().add(button0);

        /** Addition Button */
        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    num1=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation = "+";
                } catch (Exception e1) {

                }
            }
        });
        addButton.setFont(new Font(fontFamily, Font.BOLD, 22));
        addButton.setBounds(198, 464, 95, 70);
        frame.getContentPane().add(addButton);

        /** Answer Button */
        JButton answerButton = new JButton("=");
        answerButton.setFont(new Font(fontFamily, Font.BOLD, 28));
        answerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    num2 = Double.parseDouble(textField.getText());
                    if(num2 == 0) {
                        answer="Error";
                    }
                    else {
                        result = compute();
                        answer=String.format("%.2f",result);
                    }
                    textField.setText(answer);
                }
                catch(Exception e1){

                }

            }
        });
        answerButton.setBounds(303, 464, 125, 70);
        frame.getContentPane().add(answerButton);



        radioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                radioButton.setEnabled(false);
                radioButton1.setEnabled(true);
                textField.setEnabled(true);
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                button0.setEnabled(true);
                backspaceButton.setEnabled(true);
                divideButton.setEnabled(true);
                minusButton.setEnabled(true);
                multiplyButton.setEnabled(true);
                addButton.setEnabled(true);
                answerButton.setEnabled(true);
                clearButton.setEnabled(true);
                percentageButton.setEnabled(true);
                decimalButton.setEnabled(true);
            }
        });

        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                radioButton.setEnabled(true);
                radioButton1.setEnabled(false);
                textField.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button0.setEnabled(false);
                backspaceButton.setEnabled(false);
                divideButton.setEnabled(false);
                minusButton.setEnabled(false);
                multiplyButton.setEnabled(false);
                addButton.setEnabled(false);
                answerButton.setEnabled(false);
                clearButton.setEnabled(false);
                percentageButton.setEnabled(false);
                decimalButton.setEnabled(false);
            }
        });
    }

    public double compute() {
        double ans = 0;
        if(operation.equals("+")) {
            ans = num1 + num2;
        }
        else if(operation.equals("-")) {
            ans = num1 - num2;
        }
        else if(operation.equals("x")) {
            ans = num1 * num2;
        }
        else if(operation.equals("/")) {
            ans = num1 / num2;
        }
        else if(operation.equals("%")) {
            ans = num1 % num2;
        }

        return ans;
    }
}
