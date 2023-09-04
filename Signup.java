package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public  class Signup extends JFrame implements ActionListener {
     JButton b1, b2;
      JTextField t1,t2,t3,t4;
      Choice c1;
     
     
                        
    public static void main(String[]args){
    
     new Signup().setVisible(true);
    }
    private String answer;
    private String username;
    private String security;
    private String password;
    private String name;
    
   public Signup(){
     setBounds(300,150,900,360);  
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     setTitle("Signup page");
     JPanel p1 = new JPanel();
     p1.setBackground(new Color(133,193,233));
     p1.setBounds(0,0, 500,400);
     p1.setLayout(null);
     add(p1);
     
     JLabel l1 =new JLabel("Username");
     l1.setFont(new Font("Tahona",Font.BOLD, 14));
     l1.setBounds(50,20,125,25);
     p1.add(l1);
     
     t1=new JTextField();
     t1.setBounds(190,20,200,25);
     t1.setBorder(BorderFactory.createEmptyBorder());
     p1.add(t1); 
     
     JLabel l2 =new JLabel("Name");
     l2.setFont(new Font("Tahona",Font.BOLD, 14));
     l2.setBounds(50,60,125,25);
     p1.add(l2);
     
       t2 =new JTextField();
        t2.setBounds(190,60,200,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2); 
     
     JLabel l3 =new JLabel("Password");
     l3.setFont(new Font("Tahona",Font.BOLD, 14));
     l3.setBounds(50,100,125,25);
     p1.add(l3);
     
       t3 =new JPasswordField();
        t3.setBounds(190,100,200,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3); 
        
     
     JLabel l4 =new JLabel("Security Question");
     l4.setFont(new Font("Tahona",Font.BOLD, 14));
     l4.setBounds(50,140,125,25);
     p1.add(l4);
     
      c1 =new Choice();
     c1.add("Your Nic name");
     c1.add("Your lucky number");
     c1.add("Your childhood superhero");
     c1.add("Your goal");
     c1.setBounds(190,140,200,30);
     p1.add(c1);
     
     JLabel l5 =new JLabel("Answer");
     l5.setFont(new Font("Tahona",Font.BOLD, 14));
     l5.setBounds(50,180,125,25);
     p1.add(l5);
     
       t4 =new JTextField();
        t4.setBounds(190,180,200,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4); 
     
     ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
     Image i2 =i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
     ImageIcon i3= new ImageIcon(i2);
     JLabel l6=new JLabel(i3);
     l6.setBounds(580,50,250,250);
     add(l6);
     
     b1 =new JButton("Create");
     b1.setFont(new Font("Tahona", Font.BOLD,14));
     b1.setForeground(new Color(133,193,233));
     b1.setBackground(Color.WHITE);
     b1.addActionListener(this);
     b1.setBounds(80,250,100,30);
     p1.add(b1);
     
     b2 =new JButton("Back");
     b2.setFont(new Font("Tahona",Font.BOLD,14 ));
     b2.setForeground(new Color(133,193,233));
     b2.setBackground(Color.WHITE);
     b2.addActionListener(this);
     b2.setBounds(250,250,100,30);
     p1.add(b2);
     }
 
    public void actionPerformed(ActionEvent ae){
        
		String username = t1.getText();
            String name =t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer =t4.getText();
         
   try{
            Conn con = new Conn();

            if(ae.getSource() == b1){
               String sql ="INSERT INTO ACCOUNT VALUES('"+username+"', '"+name+"', '"+password+"', '"+security+"', '"+answer+"')";

		PreparedStatement st = con.c.prepareStatement(sql);


		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(this, "Account Created Successfully "); 
                    this.setVisible(false);
              new Loading(username).setVisible(true);
                }

                
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new Login().setVisible(true);

            }
        }catch(Exception e){
                System.out.println(e);
        }
    }
}     


          


     

  

