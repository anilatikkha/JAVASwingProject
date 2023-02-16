package SWING;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
 class SwingExtends extends JFrame implements ActionListener{
    //JFrame frame;
    static JButton button;
    JLabel label;
    //JLabel label2;
    SwingExtends(){
        //frame=  new JFrame("Anila");
        //this.setResizable(false);//prevents frame from being resized
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
        this.setTitle("Let's");
        button= new JButton("Login");
       // this.setLayout(null);
        button.setBounds(10,60, 60,40);// will not work if FlowLayout is used to set the layout
        button.setFont(new Font("Serif", Font.BOLD, 18));
        button.addActionListener(this);// addingactionlistener object to currentclass
        this.add(button);

       // image=new ImageIcon("Final.png"); // create an image icon
      ImageIcon image= new ImageIcon(("/Users/anilatikkha/Documents/Coding/Java VS/SWING/Final.png"));
        //this.setIconImage(image.getImage()); //set imageIcon
        //label=new JLabel();
        //this.getContentPane().add(new JLabel(image));

        label.setText("Now meet your Matches over video call!!!!!!!!!");
       label.setIcon(image);

        label.setFont(new Font("MV Boli", Font.BOLD, 25));
        label.setForeground(new Color(0,0,143));

        label.setHorizontalTextPosition(JLabel.RIGHT);
        this.setSize(800,800);
        this.setVisible(true);
       // this.add(label2);
         this.add(label);


        //Override ActionEvent method
    }
    public void actionPerformed(ActionEvent ae)
    {
          System.out.println("Welcome to Let's Get Married!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
     public static void main(String[] args) {
       
             new SwingExtends();
    }
}
