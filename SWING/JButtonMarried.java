package SWING;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class JButtonMarried extends JFrame implements ActionListener{
    static JButton button; //This becomes global component by declaring outside
    JButtonMarried(){
        button= new JButton();
        button.setBounds(410,600, 100,50);
        button.addActionListener(this);
        button.setText("Register");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 15));
        button.setForeground(Color.white);
        button.setBackground(new Color(96,26,53) );
        button.setOpaque(true);
       //button.setHorizontalAlignment(JButton.LEFT);
       //button.setVerticalAlignment(JButton.CENTER);
        button.setBorder(BorderFactory.createEtchedBorder());

       

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
       this.setSize(500,500);
       this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== button)
         {
            System.out.println("Welcome to Lets'get Married");
            button.setEnabled(false);
         }                
    }
    
}
