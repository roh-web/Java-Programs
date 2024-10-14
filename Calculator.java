import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
    int calculation;
    boolean isOperatorClicked = false;
    String oldValue,oldValueSub,oldValueMul,oldValueDiv;
    String newValue,newValuesub,newValueMul,newValueDIv;
    float oldValueSubF;
    JFrame jf;
    JButton sevenButton;
    JLabel displayLabel;
    JButton nineButton;
    JButton sixButton;
    JButton fourButton;
    JButton oneButton;
    JButton eightButton;
    JButton fiveButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton equalButton;
    JButton mulButton;
    JButton dotButton;
    JButton subButton;
    JButton divButton;
    JButton addButton;
    JButton clearButton;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setSize(600, 600);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocation(250, 100);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        jf.add(displayLabel);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);

        sevenButton = new JButton("7");
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
        eightButton.setBounds(120, 130, 80, 80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
        nineButton.setBounds(215, 130, 80, 80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fourButton.setBounds(30, 220, 80, 80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fiveButton.setBounds(120, 220, 80, 80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sixButton.setBounds(215, 220, 80, 80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
        oneButton.setBounds(30, 310, 80, 80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
        twoButton.setBounds(120, 310, 80, 80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        threeButton.setBounds(215, 310, 80, 80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
        zeroButton.setBounds(30, 410, 80, 80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
        dotButton.setBounds(120, 410, 80, 80);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
        equalButton.setBounds(215, 410, 80, 80);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        addButton = new JButton("+");
        addButton.setFont(new Font("Arial", Font.PLAIN, 30));
        addButton.setBounds(350, 130, 80, 80);
        addButton.addActionListener(this);
        jf.add(addButton);

        subButton = new JButton("-");
        subButton.setFont(new Font("Arial", Font.PLAIN, 30));
        subButton.setBounds(350, 220, 80, 80);
        subButton.addActionListener(this);
        jf.add(subButton);

        mulButton = new JButton("*");
        mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
        mulButton.setBounds(350, 310, 80, 80);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        divButton = new JButton("/");
        divButton.setFont(new Font("Arial", Font.PLAIN, 30));
        divButton.setBounds(350, 410, 80, 80);
        divButton.addActionListener(this);
        jf.add(divButton);

        clearButton = new JButton("C");
        clearButton.setBackground(Color.orange);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        clearButton.setBounds(440, 130, 80, 80);
        clearButton.addActionListener(this);
        jf.add(clearButton);
    }

    public static void main(String a[]) {
        new Calculator();
    }

    // @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sevenButton) {

            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }

            } else if (e.getSource() == eightButton) {

            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }

        } else if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        } else if (e.getSource() == fourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        } else if (e.getSource() == fiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        } else if (e.getSource() == sixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        } else if (e.getSource() == zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        } else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == addButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            calculation = 1;
        } else if (e.getSource() == subButton) {
            isOperatorClicked = true; 
            oldValue = displayLabel.getText();
            calculation=2;
        } else if (e.getSource() == mulButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            calculation=3;
        } else if (e.getSource() == divButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            calculation=4;
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
        }
        else if (e.getSource() == equalButton) {
            switch (calculation) {
               case 1:
             String newValue = displayLabel.getText();
             float oldValueF=Float.parseFloat(oldValue);
             float newValueF=Float.parseFloat(newValue);
             float result = oldValueF+newValueF;
             displayLabel.setText(result+"");
             break;
    case 2:
                    break;
   float difference = oldValueSubF - Float.parseFloat(displayLabel.getText());
                    if (Double.toString(difference).endsWith(".0")) {
                        displayLabel.setText(Double.toString(difference).replace(".0", ""));
                    } else {
                        displayLabel.setText(Double.toString(difference));
                    }
                    displayLabel.setText("");
    break;
                }
            }
        }
    }