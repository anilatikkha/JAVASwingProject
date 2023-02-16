package SWING;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
public class MyAccount extends JFrame implements ActionListener{

    static JButton dp;
    static JButton colorchangebutton;
    static Container c;
    static JLabel description;
    static JTextField descriptiont;
    MyAccount(){

    c= new Container();
    c= getContentPane();
    c.setLayout(null);

      dp= new JButton("Photo");
      dp.addActionListener(this);
      dp.setSize(80,30);
      dp.setLocation(600,100);

      description= new JLabel("Description");
      description.setFont(new Font("Ariel", Font.PLAIN, 15));
      description.setSize(150,20);
      description.setLocation(200, 270);
      
      descriptiont = new JTextField();
      descriptiont.setFont(new Font("Ariel", Font.PLAIN,15));
      descriptiont.setSize(400,200);
      descriptiont.setLocation(300,200);

      colorchangebutton= new JButton("Change Text Color");
      colorchangebutton.addActionListener(this);
      colorchangebutton.setFont(new Font("Ariel", Font.PLAIN,15));
      colorchangebutton.setSize(200,20);
      colorchangebutton.setLocation(600,450);

      c.add(dp);
      c.add(description);
      c.add(descriptiont);
      c.add(colorchangebutton);
      //.pack();
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(1500,1500);
      //this.setLayout(null);
      this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       /*  if(e.getSource()== dp){
            JFileChooser filechooser= new JFileChooser();
            // int response= (filechooser.showOpenDialog(null));
            filechooser.setCurrentDirectory(new File("/Users/anilatikkha/Documents"));
            int response= filechooser.showSaveDialog(null);

            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }  */
            if(e.getSource()==colorchangebutton)
            {
                JColorChooser colorchooser= new JColorChooser();
                Color color = JColorChooser.showDialog(null, "Pick a Color!!", Color.black);
                 descriptiont.setForeground(color);
                 //descriptiont.setBackground(color);
            }
            
        
    }
}
