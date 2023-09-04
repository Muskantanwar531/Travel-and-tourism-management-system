package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
    JTextField t1, t2,t3,t4,t5;
    JButton b1,b2;
   
    public static void main(String[] args){
        new ForgotPassword().setVisible(true);
    }
   public ForgotPassword(){
        setBounds(300,150,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Forgot Password");
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.jpg"));
        Image i2 =i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(580,70,200,200);
        add(l6);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(30,30,500,280);
        p.setBackground(new Color(0,95,193));
        add(p);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(40,20,100,25);
        l1.setFont(new Font("Tahona", Font.BOLD, 14));
        p.add(l1);
        
        t1 =new JTextField();
        t1.setBounds(220,20,150,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
        
        b1 =new JButton("Search");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(380,20,100,25);
        b1.addActionListener(this);
        p.add(b1);
        
        
        
        JLabel l2 = new JLabel("Name");
        l2.setBounds(40,60,100,25);
        l2.setFont(new Font("Tahona", Font.BOLD, 14));
        p.add(l2);
        
        t2 =new JTextField();
        t2.setBounds(220,60,150,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);
       
         JLabel l3 = new JLabel("Password ");
        l3.setBounds(40,100,170,25);
        l3.setFont(new Font("Tahona", Font.BOLD, 14));
        p.add(l3);
        
        t3 =new JTextField();
        t3.setBounds(220,100,150,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);
        
        JLabel l4 = new JLabel("Answer");
        l4.setBounds(40,140,170,25);
        l4.setFont(new Font("Tahona", Font.BOLD, 14));
        p.add(l4);
        
        t4 =new JTextField();
        t4.setBounds(220,180,150,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        
        
        JLabel l5 = new JLabel("Your security Question ");
        l5.setBounds(40,180,170,25);
        l5.setFont(new Font("Tahona", Font.BOLD, 14));
        p.add(l5);
        
        t5 =new JTextField();
        t5.setBounds(220,140,150,25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);
        
        b2 =new JButton("Back");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(150,240,100,25);
        b2.addActionListener(this);
        p.add(b2);
    }
   
   public void actionPerformed(ActionEvent ae){
        try{
            Conn con = new Conn();
            if(ae.getSource() == b1){
                String sql = "select * from account";
		PreparedStatement st = con.c.prepareStatement(sql);

		
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("password"));
                    t5.setText(rs.getString("answer"));
                     t4.setText(rs.getString("security"));
                   
		}

            } 
           
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Login().setVisible(true);

            }
        }catch(Exception e){

        }
    }

} 