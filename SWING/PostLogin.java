package SWING;
import javax.swing.*;
import java.awt.*;
public class PostLogin extends JFrame {
  static JPanel panel1;
  static JPanel panel2;
  static JPanel panel3;
  static JPanel panel4;
  static JPanel panel5;
  static JFrame frame;
    PostLogin(){
         frame = new JFrame();  
    
         panel1 = new JPanel();
         panel2 = new JPanel();
         panel3 = new JPanel();
         panel4 = new JPanel();
         panel5 = new JPanel();
    
        panel1.setBackground(new Color(96,26,53) );
        panel2.setBackground(Color.DARK_GRAY);
        panel3.setBackground(Color.DARK_GRAY);
        panel4.setBackground(new Color(96,26,53));
        panel5.setBackground(Color.WHITE);
    
       panel1.setPreferredSize(new Dimension(50,40));
       panel2.setPreferredSize(new Dimension(200,80));
       panel3.setPreferredSize(new Dimension(200,80));
       panel4.setPreferredSize(new Dimension(50,40));
    //GridLayout= places components in a grid of cells, 
    //            every componenet takes all the available space in its cell, and all are of same size
    
       panel5.add(new JButton("GROOM"));
       panel5.add(new JButton("BRIDE"));
       panel5.add(new JButton("TRANSGENDER MATCH"));
       panel5.add(new JButton("GAY MATCH"));
       panel5.add(new JButton("LESBIAN MATCH"));
       
      
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,900);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        panel5.setLayout(new GridLayout(1,4,10,10));
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        //JOptionPane = pop up a standard  dialog box  
         //              which prompts users for a value or informs them of something
       JOptionPane.showMessageDialog(null, "Please select the suitable match.", "Information",JOptionPane.INFORMATION_MESSAGE);
        frame.setVisible(true);
  
        }

    }

