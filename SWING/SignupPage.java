package SWING;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
public class SignupPage extends JFrame implements ActionListener {
   static JFrame frame;
   static JLabel label;
   static JLabel name;
   static JLabel lname;
   static JLabel mobile_no;
   static JLabel email;
   static JLabel text;
   static JLabel gender;
   static JLabel dob;

   static JTextField namet;
   static JTextField lnamet;
   static JTextField mobilet;
   static JTextField emailt;
   static Container c;
   static JButton button;
   static JButton login;
   static JPanel pane;
   static JRadioButton male;
   static  JRadioButton female;
   static  JRadioButton other;
   static ButtonGroup group;
   static JComboBox date;
   static JComboBox month;
   static JComboBox year;
String dates[]={"1", "2", "3", "4","5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
"19","20", "21", "22", "23", "24", "25","26", "27", "28", "29","30","31"};
String months[]={"January","February","March","April","May","June","July","August","September","October",
"November","December"};
String years[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002",
"2003","2004","2005","2006","2007","2008","2009","2010"};

    SignupPage(){
    this.setBounds(100,100,1500,1500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    male= new JRadioButton();
    female= new JRadioButton();
    other= new JRadioButton();

    date= new JComboBox(dates);
    month= new JComboBox(months);
    year= new JComboBox(years);

    button= new JButton();
    login= new JButton();
    group= new ButtonGroup();
    
    label= new JLabel();
    name= new JLabel();
    lname= new JLabel();
    mobile_no= new JLabel();
    email= new JLabel();
    text= new JLabel();
    gender= new JLabel();
    dob=new JLabel();

    namet=new JTextField();
    lnamet= new JTextField();; 
    mobilet= new JTextField(); 
    emailt= new JTextField();  //frame= new JFrame();
    
    c= new Container();
    c=getContentPane();
    c.setLayout(null);
   
    pane= new JPanel();
    pane.setSize(1500,30);
    pane.setBackground(new Color(96,26,53));

    label.setText("SIGN UP");
    label.setFont(new Font("Ariel", Font.BOLD, 30));
    label.setSize(300,30);
    label.setLocation(650,80);

    name.setText("First Name");
    name.setFont(new Font("Ariel", Font.PLAIN, 15));
    name.setSize(250,20);
    name.setLocation(500,150);

    namet.setFont(new Font("Ariel", Font.PLAIN, 15));
    namet.setSize(300,20);
    namet.setLocation(650, 150);
    
    lname.setText("Last Name");
    lname.setFont(new Font("Ariel", Font.PLAIN, 15));
    lname.setSize(250,20);
    lname.setLocation(500,180);

    lnamet.setFont(new Font("Ariel", Font.PLAIN, 15));
    lnamet.setSize(300,20);
    lnamet.setLocation(650, 180);

    gender.setText("Gender");
    gender.setFont(new Font("Ariel", Font.PLAIN, 15));
    gender.setSize(250,20);
    gender.setLocation(500, 210);

    male.setText("Male");
    male.setFont(new Font("Ariel", Font.PLAIN, 15));
    male.setSize(70,20);
    male.setLocation(650, 210);

    female.setText("Female");
    female.setFont(new Font("Ariel", Font.PLAIN,15));
    female.setSize(88,20);
    female.setLocation(710,210);

    other.setText("Other");
    other.setFont(new Font("Ariel", Font.PLAIN, 15));
    other.setSize(80,20);
    other.setLocation(790,210);

    group.add(male);
    group.add(female);
    group.add(other);

    mobile_no.setText("Mobile\n Number");
    mobile_no.setFont(new Font("Ariel", Font.PLAIN, 15));
    mobile_no.setSize(250, 20);
    mobile_no.setLocation(500,240);

    mobilet.setFont(new Font("Ariel", Font.PLAIN, 15));
    mobilet.setSize(300,20);
    mobilet.setLocation(650,240);

    email.setText("Email");
    email.setFont(new Font("Arial", Font.PLAIN, 15));
    email.setSize(250,20);
    email.setLocation(500, 270);

    emailt.setFont(new Font("Ariel", Font.PLAIN, 15));
    emailt.setSize(300,20);
    emailt.setLocation(650, 270);

    dob.setText("Date Of Birth");
    dob.setFont(new Font("Ariel", Font.PLAIN, 15));
    dob.setSize(180,20);
    dob.setLocation(500, 300);

    date.setFont(new Font("Ariel", Font.PLAIN, 15));
    date.setSize(60,20);
    date.setLocation(650,300);
    date.setEditable(true);

    month.setFont(new Font("Ariel", Font.PLAIN, 15));
    month.setSize(110,20);
    month.setLocation(710,300);
    month.setEditable(true);

    year.setFont(new Font("Ariel", Font.PLAIN,15));
    year.setSize(90,20);
    year.setLocation(820,300);
    year.setEditable(true);

    text.setText("Already a member? ");
    text.setFont(new Font("Ariel", Font.PLAIN, 15));
    text.setSize(500,20);
    text.setLocation(550,340);

    login.setText("Log In");
    login.setFont(new Font("Ariel",Font.BOLD, 15));
    login.setSize(50,20);
    login.setLocation(700, 340);
   // login.setFocusable(false);
    login.setBorder(null);
    login.addActionListener(this);

    date.addActionListener(this);
    month.addActionListener(this);
    year.addActionListener(this);

   button.setText("Sign Up");
   button.setFont(new Font("Ariel",Font.PLAIN,15));
   button.setSize(100,20);
   button.setFocusable(false);
  // button.setForeground(Color.WHITE);
   //button.setBackground(Color.BLUE);
   //button.setOpaque(true);
   button.setLocation(650,400);
   button.addActionListener(this);

   c.add(label);
   c.add(pane);
   c.add(name);
   c.add(namet);
   c.add(mobile_no);
   c.add(mobilet);
   c.add(lname);
   c.add(lnamet);
   c.add(button);
   c.add(email);
   c.add(emailt);
   c.add(text);
   c.add(login);
   c.add(gender);
   c.add(male);
   c.add(female);
   c.add(other);
   c.add(dob);
   c.add(date);
   c.add(month);
   c.add(year);

    this.setSize(1500,1500);
    this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource() == button)
         {
          LoginPage p= new LoginPage();
         }
         if(e.getSource()== login)
         {
            LoginPage l= new LoginPage();
         }
         if(e.getSource()== date){
            System.out.println(date.getSelectedItem());
         }
         if(e.getSource()== month){
            System.out.println(month.getSelectedItem());
         }
         if(e.getSource() == year){
            System.out.println(year.getSelectedItem());
         }
    }

}
