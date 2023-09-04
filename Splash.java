package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Splash {
        public static void main(String[] args){
           SplashFrame frame = new SplashFrame();
          frame.setBounds(220,100,1000,500);
           frame.setVisible(true);
           
           int x=1;
            for(int i=1; i<=500; i+=3, x+=4)
            {
            frame.setLocation(750-(x+i)/2, 350 -(i/2));
            frame.setSize((x+i)-160, i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
            }
            frame.setVisible(true);
            
}   
}
class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    JFrame f= new JFrame();
    SplashFrame(){
       
         //setBounds(200,200,1000,500);
        setLayout(new FlowLayout());
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));    
        Image i2 = i1.getImage().getScaledInstance(1000,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
       
        add(l1);
       JLabel l2=new JLabel("Travel And Tourism Management System");
       l2.setBounds(130,330,800,200);
        l2.setFont(new Font("cambria", Font.BOLD, 40));
        l2.setForeground (Color.BLACK);
        l1.add(l2);
       setUndecorated(true);
       t1 = new Thread(this);
       t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            new Login().setVisible(true);
            }catch(Exception e){
            e.printStackTrace();}
    }
}
