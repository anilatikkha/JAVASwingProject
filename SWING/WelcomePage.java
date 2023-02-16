package SWING;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
public class WelcomePage extends JFrame implements ActionListener{
 
JFrame frame= new JFrame();
 static JButton login;
 static JButton signup;
 static JButton about;
 static JButton pricing;
 static JButton membership;
 static JButton faq;

 static JPanel panel;
 static Border border;
 static JFrame frame1 = new JFrame();
 static JMenuBar menubar;
 static JMenu countrymenu;
 static JMenu contactmenu;
 static JMenuItem emailitem;
 static JMenuItem phoneitem;
 static JMenuItem indiaitem1;
 static JMenuItem usaitem2;
 static JMenuItem ausitem3;
 static JMenuItem euritem4;
 
    WelcomePage(){
        //ImageIcon image = new ImageIcon("/Users/anilatikkha/Documents/Coding/Java VS/SWING/Lovepik_com-401367800-wedding-background.jpg");
         ImageIcon image = new ImageIcon(new ImageIcon("/Users/anilatikkha/Documents/Coding/Java VS/SWING/Lovepik_com-401367800-wedding-background.jpg").getImage().getScaledInstance(1500, 500, Image.SCALE_DEFAULT));
         ImageIcon logo= new ImageIcon(("/Users/anilatikkha/Documents/Coding/Java VS/SWING/logo.png"));
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
         
          menubar =new JMenuBar();
          JMenuBar menubar = new JMenuBar();
          menubar.setSize(new Dimension(1200, 30));
          menubar.setBackground(Color.ORANGE);
          menubar.setForeground(Color.BLUE);
          menubar.setOpaque(true);


         countrymenu= new JMenu("Country");
         contactmenu= new JMenu("Contact");
         //countrymenu.setBackground(new Color(96,26,53));
          //countrymenu.setOpaque(true);
         menubar.add(countrymenu);
         menubar.add(contactmenu);
         emailitem= new JMenuItem("Email: marry@live.com");
         phoneitem = new JMenuItem("HelpLine: 180093045612(8AM-5PM Mon-Fri)");
         
        indiaitem1= new JMenuItem("INDIA");
        usaitem2= new JMenuItem("USA");
        ausitem3= new JMenuItem("Australia");
        euritem4= new JMenuItem("Europe");

        contactmenu.add(emailitem);
        contactmenu.add(phoneitem);
        countrymenu.add(indiaitem1);
        countrymenu.add(usaitem2);
        countrymenu.add(ausitem3);
        countrymenu.add(euritem4);
        
       // menubar.setBackground(new Color(96,26,53));
       // menubar.setOpaque(true);

        

        login= new JButton("Login");
        about= new JButton("About");
        pricing= new JButton("Pricing");
       membership =new JButton("Membership");
       faq= new JButton("FAQ");
        signup=new JButton("Sign Up");
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1500,30));
       panel.setBackground(new Color(96,26,53));
      // label.setBackground(new Color(96,26,53));

        panel.setLayout(new FlowLayout());
        //panel.add(menubar);
        //panel.add(contactmenu);
       // panel.add( menubar.add(countrymenu));
        panel.add(about); //creates a new button
        panel.add(pricing);
        panel.add(membership);
        panel.add(signup);
        menubar.add(login);
        panel.add(faq);


        login.setFocusable(false);
        signup.setFocusable(false);

        login.addActionListener(this);
        signup.addActionListener(this);

        this.setJMenuBar(menubar);
        this.add(menubar);
       // login.setIcon(logo);
        this.add(panel, BorderLayout.NORTH);
        //this.add(menubar,BorderLayout.NORTH);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        //this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,1500);
        this.setBackground(new Color(242,228,224));
        this.add(label);
        //this.setBackground(new Color(96,26,53));
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

