 package SWING;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
public class WelcomePageDemo extends JFrame implements ActionListener{
 JFrame frame= new JFrame();
 static JButton login;
 static JButton signup;
 static JPanel panel;
 static Border border;
 static JFrame frame1 = new JFrame();
 
    WelcomePageDemo(){
        //ImageIcon image = new ImageIcon("/Users/anilatikkha/Documents/Coding/Java VS/SWING/Lovepik_com-401367800-wedding-background.jpg");
         ImageIcon image = new ImageIcon(new ImageIcon("/Users/anilatikkha/Documents/Coding/Java VS/SWING/Lovepik_com-401367800-wedding-background.jpg").getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT));
         border =  BorderFactory.createLineBorder(new Color(96,26,53), 3);
         JLabel label = new JLabel();
         JLabel label1= new JLabel("");
         label1.setHorizontalAlignment(SwingConstants.CENTER);
         label1.setBounds(628, 28, 169, 125);
         frame1.getContentPane().add(label1);
         label.setText("Let's GET MARRIED!!!!!"); // set text of label
         label.setIcon(image);
         label.setHorizontalTextPosition(JLabel.CENTER);
         label.setVerticalTextPosition(JLabel.TOP);
         label.setForeground(new Color(96,26,53));
         label.setFont(new Font("MV Boli", Font.BOLD, 20));
         label.setIconTextGap(25);
         label.setBackground(new Color(242,228,224));
         label.setOpaque(true);
         label.setBorder(border);
         label.setVerticalAlignment(JLabel.CENTER);
         label.setHorizontalAlignment(JLabel.CENTER);
        

        login= new JButton("Login");
        signup=new JButton("Sign Up");
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1500,30));
        panel.setBackground(new Color(96,26,53));
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("About")); //creates a new button
        panel.add(new JButton("Pricing"));
        panel.add(new JButton("Contact"));
        panel.add(new JButton("Country"));
        panel.add(new JButton("Membership"));
        panel.add(signup);
       // panel.add(new JButton("Sign Up"));
        panel.add(login);
        login.setFocusable(false);
        signup.setFocusable(false);

        panel.add(new JButton("FAQ"));
        login.addActionListener(this);
        signup.addActionListener(this);

        this.add(panel, BorderLayout.NORTH);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,1500);
        this.setSize(1500,1500);
        this.setBackground(new Color(242,228,224));
        this.add(label);
        this.setBackground(new Color(242,228,224));
        this.setVisible(true);         
    }
   @Override
   public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login)
        {
            LoginPage loginpage = new LoginPage();
       // PostLogin second = new PostLogin();
        }
        if(e.getSource() == signup)
        {
            SignupPage sp= new SignupPage();
        }
   }
}


}
