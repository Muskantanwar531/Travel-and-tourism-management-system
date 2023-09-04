
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener {
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b14;
   String username;
    Dashboard(){
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel p1 =new JPanel();
        
        JPanel p2 = new JPanel();
     p2.setBackground (new Color(0,0,128));
     p2.setBounds(0,0, 1500,40);
     p2.setLayout(null);
     add(p2);
     
      JLabel l2 =new JLabel("Dashboard");
     l2.setFont(new Font("Algerian",Font.PLAIN, 23));
     l2.setForeground(Color.WHITE);
     l2.setBounds(40,15,150,25);
     p2.add(l2);
     
     JPanel p3 = new JPanel();
     p3.setBackground (new Color(128));
     p3.setBounds(0,5, 220,1140);
     p3.setLayout(null);
     add(p3);
     
      b1 =new JButton("Add  Personal  Details");
     b1.setFont(new Font("cambria", Font.PLAIN,17));
     b1.setForeground(Color.WHITE);
     b1.setBackground(new Color(128));
      b1.addActionListener(this);
      
     b1.setBounds(0,50,220,40);
     p3.add(b1);
     
    b2 =new JButton("Update Personal Details");
     b2.setFont(new Font("cambria", Font.PLAIN,17));
     b2.setForeground(Color.WHITE);
     b2.setBackground(new Color(128));
     b2.addActionListener(this);
     b2.setBounds(0,90,220,40);
     p3.add(b2);
     
     b3 =new JButton("View Details");
     b3.setFont(new Font("cambria", Font.PLAIN,17));
     b3.setForeground(Color.WHITE);
     b3.setBackground(new Color(128));
     b3.addActionListener(this);
     b3.setBounds(0,130,220,40);
     p3.add(b3);
     
     b4 =new JButton("Delete Personal Details");
     b4.setFont(new Font("cambria", Font.PLAIN,17));
     b4.setForeground(Color.WHITE);
     b4.setBackground(new Color(128));
     b4.addActionListener(this);
     b4.setBounds(0,170,220,40);
     p3.add(b4);
     
     b5 =new JButton("Check Packages");
     b5.setFont(new Font("cambria", Font.PLAIN,17));
     b5.setForeground(Color.WHITE);
     b5.setBackground(new Color(128));
     b5.addActionListener(this);
     b5.setBounds(0,210,220,40);
     p3.add(b5);
     
    b6 =new JButton("Book Packages");
     b6.setFont(new Font("cambria", Font.PLAIN,17));
     b6.setForeground(Color.WHITE);
     b6.setBackground(new Color(128));
     b6.addActionListener(this);
     b6.setBounds(0,250,220,40);
     p3.add(b6);
     
       b7 =new JButton("View Package");
     b7.setFont(new Font("cambria", Font.PLAIN,17));
     b7.setForeground(Color.WHITE);
     b7.setBackground(new Color(128));
     b7.addActionListener(this);
     b7.setBounds(0,290,220,40);
     p3.add(b7);
     
      b8 =new JButton("View Hotels");
     b8.setFont(new Font("cambria", Font.PLAIN,17));
     b8.setForeground(Color.WHITE);
     b8.setBackground(new Color(128));
     b8.addActionListener(this);
     b8.setBounds(0,330,220,40);
     p3.add(b8);
     
      b9 =new JButton("Book Hotel");
     b9.setFont(new Font("cambria", Font.PLAIN,17));
     b9.setForeground(Color.WHITE);
     b9.setBackground(new Color(128));
     b9.addActionListener(this);
     b9.setBounds(0,370,220,40);
     p3.add(b9);
     
      b10 =new JButton("View Booked Hotel");
     b10.setFont(new Font("cambria", Font.PLAIN,17));
     b10.setForeground(Color.WHITE);
     b10.setBackground(new Color(128));
     b10.addActionListener(this);
     b10.setBounds(0,410,220,40);
     p3.add(b10);
     
     b11 =new JButton("Destinations");
     b11.setFont(new Font("cambria", Font.PLAIN,17));
     b11.setForeground(Color.WHITE);
     b11.setBackground(new Color(128));
     b11.addActionListener(this);
     b11.setBounds(0,450,220,40);
     p3.add(b11);
     
      b12 =new JButton("Payment");
     b12.setFont(new Font("cambria", Font.PLAIN,17));
     b12.setForeground(Color.WHITE);
     b12.setBackground(new Color(128));
     b12.addActionListener(this);
     b12.setBounds(0,490,220,40);
     p3.add(b12);
     
     
    
     
     b14 =new JButton("About");
     b14.setFont(new Font("cambria", Font.PLAIN,17));
     b14.setForeground(Color.WHITE);
     b14.setBackground(new Color(128));
     b14.addActionListener(this);
     b14.setBounds(0,530,220,40);
     p3.add(b14);
     
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2= i1.getImage().getScaledInstance(1600, 730, Image.SCALE_DEFAULT); 
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l1 =new JLabel(i3);
        l1.setBounds(150,60, 1950,1000);
        add(l1);
        
        
         JLabel l3=new JLabel("Travel And Tourism Management System");
        l3.setBounds(400,60,800,40);
        l3.setFont(new Font("MV Boli", Font.PLAIN, 35));
        l3.setForeground (Color.DARK_GRAY);
        l1.add(l3);
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == b1){
            this.setVisible(true);     
        try {
            new AddCustomer(username).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    else if(ae.getSource()==b2){
            this.setVisible(true);
        try {
            new UpdateCustomer(username).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    else if(ae.getSource()==b3){
            this.setVisible(true);
        try {
            new ViewCustomers().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }else if(ae.getSource()==b4){
            this.setVisible(true);
        try {
            new DeleteCustomer().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        
        else if(ae.getSource()==b5){
            this.setVisible(true);
            
            new CheckPackage ().setVisible(true);
            
        }
        else if(ae.getSource()==b6){
            this.setVisible(true);
            new BookPackage(username).setVisible(true);
        }
        else if(ae.getSource()==b7){
            this.setVisible(true);
        try {
            new ViewPackage(username).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
                    }
        else if(ae.getSource()==b8){
            this.setVisible(true);
            new CheckHotels ().setVisible(true);
           
        }else if(ae.getSource()==b9){
            this.setVisible(true);
            new BookHotel(username).setVisible(true);
        }
        else if(ae.getSource()==b10){
            this.setVisible(true);
        try {
            new ViewBookedHotel(username).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    else if(ae.getSource()==b11){
            this.setVisible(true);
            new Destination().setVisible(true);
           
        }
     else if(ae.getSource()==b12){
            this.setVisible(true);
            new Payment().setVisible(true);
           
        }
    
    else if(ae.getSource()==b14){
            this.setVisible(true);
            new About().setVisible(true);
           
        }
    }
    
    public static void main(String[] args){
        new Dashboard().setVisible(true);
    }
    
}
 