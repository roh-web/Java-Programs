import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class jLabeling {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("hijpg.jpg");

        JLabel label = new JLabel("hey");
        label.setIcon(img);
      //  label.setHorizontalAlignment(JLabel.RIGHT);
      //  label.setVerticalAlignment(JLabel.BOTTOM);
        label.setBounds(50,50,75,75);

        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(800,700);
        jf.setLayout(null);
        jf.setVisible(true);

        JPanel jpOrange = new JPanel();
        jpOrange.setBackground(Color.orange);
        jpOrange.setBounds(0,0,250,250);
        jf.add(jpOrange);

        JPanel jpCyan = new JPanel();
        jpCyan.setBackground(Color.cyan);
        jpCyan.setBounds(250,0,250,250);
        jf.add(jpCyan);

        JPanel jpGreen = new JPanel();
        jpGreen.setBackground(Color.green);
        jpGreen.setBounds(150,300,400,350);
        jpGreen.setLayout(null);
        jpGreen.add(label);
        jf.add(jpGreen);
        jf.add(jpGreen);
    }
}