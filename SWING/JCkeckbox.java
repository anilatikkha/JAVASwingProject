package SWING;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
public class JCkeckbox extends JFrame implements ActionListener{
     static JButton button;
    static JCheckBox checkbox;
    JCkeckbox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.addActionListener(this);

 
        checkbox= new JCheckBox();
        checkbox.setText("You live in the U.S.");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 15));

        //checkbox.addActionListener(this);
        this.add(checkbox);
        this.add(button);
        this.setSize(1200,1200);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== button ){
            //System.out.println(checkbox.isSelected());
            PostLogin p= new PostLogin();
        }
    }
}

