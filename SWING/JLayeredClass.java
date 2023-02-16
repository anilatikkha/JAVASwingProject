package SWING;
import javax.swing.*;
import java.awt.*;
public class JLayeredClass {
    public static void main(String[] args) {

       JLabel label1 =  new JLabel();
       label1.setBackground(Color.MAGENTA);
       label1.setOpaque(true);
        label1.setBounds(30,30,100,100);

        JLabel label2 = new JLabel();
        label2.setBackground(Color.ORANGE);
        label2.setOpaque(true);
        label2.setBounds(60, 60, 100, 100);

        
        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(11,11, 400,400);
        layer.setBackground(Color.green);
        layer.add(label1, Integer.valueOf(1));
        layer.add(label2, Integer.valueOf(2));// Places the higher number on top else the label decalared
        // first appeares on top of the rest



        JFrame frame= new JFrame("JLayeredPane");
        //frame.setTitle("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.add(layer);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
