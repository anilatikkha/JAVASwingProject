package SWING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JWindow;
import javax.swing.ImageIcon;
public class SwingInstantiation {
    public static void main(String[] args) {
       JFrame frame= new JFrame("JFrameInstantiation");//can contain buttons, labels, text fields, etc.
       JWindow window= new JWindow(); //can contain a title, a border, and also menus, text fields, buttons, and other components.
       //JPanel panel= new JPanel();
       JTextArea tarea=new JTextArea("JTextArea");
       JButton button=new JButton("Click");
       JButton panelbutton=new JButton("PanelButton");   
       ImageIcon imageu = new ImageIcon("VideoCallSample.png");
       JLabel label= new JLabel();
       panelbutton.setBounds(100, 150, 130,20);
       button.setBounds(150, 250, 60, 30);
       frame.add(button);
       frame.add(panelbutton);
       tarea.setBounds(30,30,150,50);
       frame.add(tarea);
       frame.setLayout(null);
       frame.setSize(400,400);
       frame.setTitle("Anila's Swing Frame");
       frame.setVisible(true);
       label.setText("Hi, I'm Anila!");
       label.setIcon(imageu);
       frame.add(label);

    } 
}
