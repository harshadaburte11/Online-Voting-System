package ovsystem;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import javax.swing.border.*;


public class SeeResult extends JFrame 
{
    private static final long serialVersionUID = 1L;
    private JPanel c;
    private JTextField username;
	private JPasswordField password;
	private JButton b1,b2,b3;
	private JLabel l1,l2;
    
     public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	SeeResult frame = new SeeResult();                   
	                    frame.setVisible(true);
	                    frame.setTitle("See Result ");
	                    frame.setSize(700,600);
	                    frame.setLocation(250,100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
   }


    public SeeResult() 
	{
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);
        c= new JPanel();
        c.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(c);
        c.setLayout(null);
        c.setBackground(Color.gray);  
        JLabel lh = new JLabel("To See Result");
        lh.setFont(new Font("Times New Roman", Font.BOLD, 42));
        lh.setBounds(180, 35, 500, 50);
        lh.setForeground(Color.blue);
        c.add(lh);

 		
	    l1 = new JLabel("Username");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l1.setBounds(110, 130, 180, 35);
        l1.setForeground(Color.black);
        c.add(l1);

        l2= new JLabel("Password");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l2.setBounds(110, 200, 180, 35);
        l2.setForeground(Color.black);

        c.add(l2);
		
        username = new JTextField();
        username.setFont(new Font("Times New Roman",Font.PLAIN,20));
        username.setBounds(240,130,228,35);
        c.add(username);
        username.setColumns(10);
	    
		 password=new JPasswordField();
		 password.setBounds(240,200,228,35);
         c.add(password);
         password.setColumns(10);
       
	    
		
      /*b1= new JButton("LOGIN as Voter ");
	    b1.setFont(new Font("Times New Roman",Font.PLAIN,22));
        b1.setBounds(100,300,270,40);
         b1.setBackground(Color.cyan);
        c.add(b1);
        
        b2= new JButton(" Open Result ");
	    b2.setFont(new Font("Times New Roman",Font.PLAIN,22));
        b2.setBounds(435,300,270,40);
        b2.setBackground(Color.cyan);
        c.add(b2);*/
        
        b2= new JButton(" Open Result ");
	    b2.setFont(new Font("Times New Roman",Font.PLAIN,22));
        b2.setBounds(270,350,200,40);
        b2.setBackground(Color.cyan);
        c.add(b2);
        
        
		b2.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
				 String uName=username.getText();
				String uPass=password.getText();
			 
				//String msg=" "+uName;
				//msg+="\n";
				if(uName.isEmpty())
				{
					JOptionPane.showMessageDialog(b2,"Enter Valid Name");
				}
					else
					{
						
						try
						{
							//Class.forName("com.mysql.cj.jdbc.Driver");
							//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs_db","root","tiger");
							//String query = "SELECT * FROM regisdb WHERE username='"+ uName+"' and password='"+uPass+"'";
							//Statement st=con.createStatement();
							//ResultSet rs=st.executeQuery(query);
							//int x=st.executeUpdate(query);
							if(uName.equals("admin")&& uPass.equals("admn"))
							{
							  JOptionPane.showMessageDialog(b2,"Welcome , Now You can see Result ");
							  Result r =new Result();
							  //r.uName1=uName;
							  //r.uPass1=uPass;
			        
			            	    setVisible(false);
			            		r.setVisible(true);
			            		r.setSize(900,650);
			            		r.setLocation(200,60);

							}
							else
							{
								JOptionPane.showMessageDialog(b2, "You are not an Admin");
						    }
							//con.close();
													
											
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
					    }
												
				    }			
							
			}
		});
		
		/*b2.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
				String uName=username.getText();
				String uPass=password.getText();
			 
				String msg=" "+uName;
				msg+="\n";
				if(uName.isEmpty())
				{
					JOptionPane.showMessageDialog(b2,"Enter Valid Name");
				}
					else
					{
						
						try
						{
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs_db","root","tiger");
							String query = "SELECT * FROM regcdtdb WHERE username='"+ uName+"' and password='"+uPass+"'";
							Statement st=con.createStatement();
							ResultSet rs=st.executeQuery(query);
							//int x=st.executeUpdate(query);
							if(rs.next())
							{
							  JOptionPane.showMessageDialog(b2,"Welcome ," + msg + "Now you can see Result ");
							  Result r =new Result();
							  //r.uName1=uName;
							  //r.uPass1=uPass;
			        
			            	    setVisible(false);
			            		r.setVisible(true);
			            		r.setSize(900,650);
			            		r.setLocation(200,60);

							}
							else
							{
								JOptionPane.showMessageDialog(b2, "You are not a Candidate");
						    }
							con.close();
													
											
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
					    }
												
				    }			
							
			}
		});*/
		
		/*b3.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
            	Registration rg=new Registration();
        		//frame1=new Registration();
        	    setVisible(false);
        		rg.setVisible(true);
        		rg.setSize(800,670);
        		rg.setLocation(250,60);
			}
		});*/

		
	}
}


