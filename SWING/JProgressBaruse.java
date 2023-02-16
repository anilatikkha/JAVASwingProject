package SWING;
import javax.swing.JProgressBar;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class JProgressBaruse extends JFrame {
      static JProgressBar progressbar= new JProgressBar();
      static JFrame frame; 
      JProgressBaruse(){
   
       // progressbar = new JProgressBar();  
        progressbar.setValue(0);
        progressbar.setBounds(0,0,1500,50);
        progressbar.setStringPainted(true);
        progressbar.setFont(new Font("Ariel", Font.PLAIN, 20));
        progressbar.setOpaque(true);
        progressbar.setBackground(Color.CYAN);
        progressbar.setForeground(Color.red);
       //UIManager.put("ProgressBar.background", Color.RED);
       //UIManager.put("ProgressBar.selectionBackground", Color.ORANGE);


        this.add(progressbar);
        this.setLayout(null);
        this.setSize(1500,1500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        fill();
    }
    public void fill(){
        int i=0;
        while(i<=100)
        {
            progressbar.setValue(i);

             try{
                 Thread.sleep(1000);
             } catch(InterruptedException e){
                     e.printStackTrace();
             }
             i+=10;
        }
        progressbar.setString("Load Completed!");
    }
    
}
