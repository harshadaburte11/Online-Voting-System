package ovsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import javax.swing.border.*;


public class Main extends JFrame 
{
    private static final long serialVersionUID = 1L;
    private JPanel c;
    
   private JButton b1,b2;
    JLabel l1,l2;
    

      public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Main frame = new Main();                   
                    frame.setVisible(true);
                   // frame.setLocation(250,100);
                    frame.setTitle("Online Voting System");
                   // frame.setSize(800,600);
                    int i;
                    int x=1;
                    for(i=2;i<=600;i+=4,x++)
                    {
                    	frame.setLocation(600-((i+x)/2),400-(i/2));
                    	frame.setSize((i+x),i);
                        try
                        {
                            Thread.sleep(10);
                        }
                        catch (Exception e){}
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Main () throws Exception
	{
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);
        c= new JPanel();
        c.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(c);
        c.setLayout(null);
        c.setBackground(Color.pink);  
        JLabel lh = new JLabel(" Online Voting System");
        lh.setFont(new Font("Times New Roman", Font.BOLD, 70));
        lh.setBounds(30,60,700,100);
        c.add(lh);

 		
	    b1= new JButton("Proceed");
		
        b1.setFont(new Font("Tahoma",Font.PLAIN,30));
        b1.setBounds(480,450,170,50);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        c.add(b1);
        
		
        b2= new JButton("Admin");
	    b2.setFont(new Font("Tahoma",Font.PLAIN,30));
        b2.setBounds(280,450,170,50);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        c.add(b2);
		
		b1.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e) 
			{
            	 Login rg=new Login();
            	 try
            	 {
            	 Thread.sleep(500);
            	 }catch (Exception e1) 
            	 {
            		 System.out.println(e1);
					
				}
            	 
         		rg.setVisible(true);
         		setVisible(false);
         		rg.setTitle("Register Page");
         		rg.setLocation(250,100);
         		
                 rg.setSize(800,600);
			}
		});
		
		b2.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e) 
			{
            	 SeeResult sr =new SeeResult();
            			 sr.setVisible(true);
                  		setVisible(false);
                     	 sr.setSize(700,600);
                          sr.setLocation(250,100); 
            		
            	 
            	 
			}
		});
			
	}
}

