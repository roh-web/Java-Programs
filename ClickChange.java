import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ClickChange implements ActionListener {
    JButton clickMe;
    JFrame jf;
   //public ClickChange()
    public static void main(String[] args) {
        JButton clickMe;
        JFrame jf;
        jf = new  JFrame("Click To Change");
        jf.setSize(600,600);
        jf.setLayout(null);
        jf.setVisible(true);
       clickMe = new JButton("Click me");
        clickMe.setBounds(230,200,100,100);
        clickMe.setBackground(Color.cyan);
        jf.add(clickMe);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==clickMe){
            jf.getContentPane().setBackground(Color.red);
        }
    }
}