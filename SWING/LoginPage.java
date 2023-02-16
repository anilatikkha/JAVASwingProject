package SWING;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;


public class LoginPage extends JFrame implements ActionListener{
    static JLabel label;
    static JLabel label2;
    static JButton button;
    static JTextField email;
    static JFrame frame;
    static JPanel panel;
    static Container c;
    //static JFrame frame1 = new JFrame();

    LoginPage(){
      
        frame= new JFrame();
        this.setBounds(100,100,1500,1500);

      /*  JLabel label1= new JLabel("");
         label1.setHorizontalAlignment(SwingConstants.CENTER);
         label1.setBounds(628, 28, 169, 125);
         frame1.getContentPane().add(label1);
         ImageIcon image = new ImageIcon(new ImageIcon("/Users/anilatikkha/Documents/Coding/Java VS/SWING/Lovepik_com-401367800-wedding-background.jpg").getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT));*/

    //JTextField= A GUI textbox component that can be used to add, set or get text
     //  label.setText("Welcome");
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //this.setLayout(new FlowLayout());

       label=new JLabel();
       label2= new JLabel();
       label.setText("LOG IN!\n\n");
       label.setFont(new Font("MV Boli", Font.BOLD, 20));
       label.setSize(200,30);
       label.setLocation(600,50);

       label2.setText("Enter Email: ");
       label2.setFont(new Font("MV Boli", Font.PLAIN, 15));
       label2.setSize(100,20);
       label2.setLocation(500,105);
       
       panel= new JPanel();
       panel.setSize(1500,30);
       panel.setBackground(new Color(96,26,53) );        


       email = new JTextField();
       email.setSize(300,30);
       email.setLocation(650,100);

       button = new JButton("Login");
       button.addActionListener(this);
       button.setSize(80,40);
       button.setLocation(600, 150);

       c=new Container();
       c= getContentPane();
       c.setLayout(null);
       c.add(panel);
       c.add(panel, BorderLayout.NORTH);
       c.add(label);
       c.add(label2);
       c.add(email);
       c.add(button);

       
       this.setSize(1500,1500);
       this.setVisible(true);
    }

  @Override 
  public void actionPerformed(ActionEvent e)
   {
    if(e.getSource()== button )
    { 
       PostLogin postlogin= new PostLogin();
    }

   }
  
}
