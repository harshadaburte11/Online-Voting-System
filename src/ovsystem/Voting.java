package ovsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import javax.swing.border.*;


public class Voting extends JFrame 
{
    private static final long serialVersionUID = 1L;
    private JPanel c;
    private JTextField vid;
    Connection con;
    Statement st;
	String vid1;
	private JButton b1,b2;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7 ;
	private JRadioButton r1,r2,r3,r4,r5,r6,r7;
   
    
     public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                      Voting frame = new Voting();                   
	                    frame.setVisible(true);
	                    frame.setTitle(" Voting Form for CM ");
	                    frame.setSize(800,800);
	                   frame.setLocation(250,30);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Voting() 
	{
    	try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs_db","root","tiger");
			
			 st=con.createStatement();
			
			
			
	
	    }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);
        c= new JPanel();
        c.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(c);
        c.setLayout(null);
        c.setBackground(Color.gray);  
        JLabel lh = new JLabel(" Voting For CM");
        lh.setFont(new Font("Times New Roman", Font.BOLD, 42));
        lh.setBounds(180, 35, 500, 50);
        lh.setForeground(Color.blue);
        c.add(lh);

 		
		l0 = new JLabel("Voter ID  :");
        l0.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l0.setBounds(140, 130, 120, 40);
        l0.setForeground(Color.black);
        c.add(l0);
		
		vid = new JTextField();
        vid.setFont(new Font("Times New Roman",Font.PLAIN,30));
        vid.setBounds(290,130,228,35);
        vid.setForeground(Color.cyan);
        //vid.setText(vid1);
        c.add(vid);
        //vid.setColumns(10);
		
	    l1 = new JLabel(" ");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l1.setBounds(330, 200, 180, 35);
        l1.setForeground(Color.cyan);
        try
        {
        	ResultSet rs=st.executeQuery("select name from candidatedb where party='BJP' AND position='CM'");
        	while(rs.next())
        	{
        		l1.setText(rs.getString("name"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        c.add(l1);

        l2= new JLabel("");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l2.setBounds(330, 270, 180, 35);
        l2.setForeground(Color.cyan);
        try
        {
        	ResultSet rs=st.executeQuery("select name from candidatedb where party='Shiv-Sena' AND position='CM'");
        	while(rs.next())
        	{
        		l2.setText(rs.getString("name"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        c.add(l2);
		
		l3= new JLabel("");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l3.setBounds(330, 340, 180, 35);
        l3.setForeground(Color.cyan);
        try
        {
        	ResultSet rs=st.executeQuery("select name from candidatedb where party='Congress' AND position='CM'");
        	while(rs.next())
        	{
        		l3.setText(rs.getString("name"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        c.add(l3);
		
		l4= new JLabel("");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l4.setBounds(330, 410, 180, 35);
        l4.setForeground(Color.cyan);
        try
        {
        	ResultSet rs=st.executeQuery("select name from candidatedb where party='AAP' AND position='CM'");
        	while(rs.next())
        	{
        		l4.setText(rs.getString("name"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        c.add(l4);
		
		l5= new JLabel("");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l5.setBounds(330, 480, 180, 35);
        l5.setForeground(Color.cyan);
        try
        {
        	ResultSet rs=st.executeQuery("select name from candidatedb where party='BSP' AND position='CM'");
        	while(rs.next())
        	{
        		l5.setText(rs.getString("name"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        c.add(l5);
		
		l6= new JLabel("");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l6.setBounds(330, 555, 180, 35);
        l6.setForeground(Color.cyan);
        try
        {
        	ResultSet rs=st.executeQuery("select name from candidatedb where party='CPM' AND position='CM'");
        	while(rs.next())
        	{
        		l6.setText(rs.getString("name"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        c.add(l6);
		
		l7= new JLabel("");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l7.setBounds(330, 625, 180, 35);
        l7.setForeground(Color.cyan);
        try
        {
        	ResultSet rs=st.executeQuery("select name from candidatedb where party='SJP' AND position='CM'");
        	while(rs.next())
        	{
        		l7.setText(rs.getString("name"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        c.add(l7);
		
		 
		  ButtonGroup bg=new ButtonGroup();
		 r1= new JRadioButton("BJP");
		 r2=new JRadioButton("Shiv-Sena");
		 r3=new JRadioButton("Congress");
		 r4=new JRadioButton("AAP");
		 r5=new JRadioButton("BSP");
		 r6=new JRadioButton("CPM");
		 r7=new JRadioButton("SJP");
		 bg.add(r1);
		 bg.add(r2);
		 bg.add(r3);
		 bg.add(r4);
		 bg.add(r5);
		 bg.add(r6);
		 bg.add(r7);
        r1.setFont(new Font("Tahoma",Font.PLAIN,20));
	    r2.setFont(new Font("Tahoma",Font.PLAIN,20));
		r3.setFont(new Font("Tahoma",Font.PLAIN,20));
		r4.setFont(new Font("Tahoma",Font.PLAIN,20));
		r5.setFont(new Font("Tahoma",Font.PLAIN,20));
		r6.setFont(new Font("Tahoma",Font.PLAIN,20));
		r7.setFont(new Font("Tahoma",Font.PLAIN,20));
		
        r1.setBounds(195,200,110,40);
	    r2.setBounds(195,270,120,40);
		r3.setBounds(195,340,110,40);
		r4.setBounds(195,410,110,40);
		r5.setBounds(195,480,110,40);
		r6.setBounds(195,555,110,40);
		r7.setBounds(195,625,110,40);
        c.add(r1);
		c.add(r2);
		c.add(r3);
		c.add(r4);
		c.add(r5);
		c.add(r6);
		c.add(r7);
       
	   b1= new JButton(" Vote ");
	    b1.setFont(new Font("Times New Roman",Font.PLAIN,22));
        b1.setBounds(200,690,200,50);
         b1.setBackground(Color.cyan);
        c.add(b1);
		
		b2= new JButton(" Next ");
	    b2.setFont(new Font("Times New Roman",Font.PLAIN,22));
        b2.setBounds(430,690,200,50);
         b2.setBackground(Color.cyan);
        c.add(b2);
		
		b1.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
				String uId=vid.getText();
				if(uId.isEmpty())
		        {   
					JOptionPane.showMessageDialog(b1,"Enter Valid Id");
					
		        }
				String query = "SELECT * FROM voterdb WHERE id='"+uId+"'";
				try
				{
		    	 ResultSet rs=st.executeQuery(query);
					//int x=st.executeUpdate(query);
					if(rs.next())
					{
						
					
					
			    if(r1.isSelected())
			    {    
			    	try
			    	{
			    	 int cnt=1;
			    	 
						
			          int i=st.executeUpdate("insert into vcm(vid,bjp)values ('"+uId+"','"+cnt+"')");
			          JOptionPane.showMessageDialog(b1,"Thanks for Voting");
			          /*Main pg=new Main();
		         		pg.setVisible(true);
		         		setVisible(false);
		         		pg.setSize(1200,900);*/
						
						
			         }
			    	catch(Exception ex)
			    	{
			           ex.printStackTrace();
			    	}
			    }    
		    	if(r2.isSelected())
		    	{  
		    		//uParty="Shiv-Sena";
		    		try
			    	{
			    	 int cnt=1;
			          int i=st.executeUpdate("insert into vcm(vid,shivsena)values ('"+uId+"','"+cnt+"')");
			          JOptionPane.showMessageDialog(b1,"Thanks for Voting");
			         /* Main pg=new Main();
		         		pg.setVisible(true);
		         		setVisible(false);
		         		pg.setSize(1200,900);*/
			    	}
			    	catch(Exception ex)
			    	{
			           ex.printStackTrace();
			    	}
			    }   
		    	
				if(r3.isSelected())
		    	{  
		    		//uParty="Congress";
					try
			    	{
			    	 int cnt=1;
			          int i=st.executeUpdate("insert into vcm(vid,Congress)values ('"+uId+"','"+cnt+"')");
			          JOptionPane.showMessageDialog(b1,"Thanks for Voting");
			         /* Main pg=new Main();
		         		pg.setVisible(true);
		         		setVisible(false);
		         		pg.setSize(1200,900);*/
			    	}
			    	catch(Exception ex)
			    	{
			           ex.printStackTrace();
			    	}
			    }   
		    		
				if(r4.isSelected())
		    	{  
		    		//uParty="AAP";
		    		try
			    	{
			    	 int cnt=1;
			          int i=st.executeUpdate("insert into vcm(vid,AAP)values ('"+uId+"','"+cnt+"')");
			          JOptionPane.showMessageDialog(b1,"Thanks for Voting");
			          /*MainPage pg=new MainPage();
		         		pg.setVisible(true);
		         		setVisible(false);
		         		pg.setSize(1200,900);*/
			    	}
			    	catch(Exception ex)
			    	{
			           ex.printStackTrace();
			    	}
			    }   
		    
				if(r5.isSelected())
		    	{  
		    		//uParty="BSP";
					try
			    	{
			    	 int cnt=1;
			          int i=st.executeUpdate("insert into vcm(vid,BSP)values ('"+uId+"','"+cnt+"')");
			          JOptionPane.showMessageDialog(b1,"Thanks for Voting");
			         /* MainPage pg=new MainPage();
		         		pg.setVisible(true);
		         		setVisible(false);
		         		pg.setSize(1200,900);*/
			    	}
			    	catch(Exception ex)
			    	{
			           ex.printStackTrace();
			    	}
			    }   
		    	
				if(r6.isSelected())
		    	{  
		    		//uParty="CPM";
					try
			    	{
			    	 int cnt=1;
			          int i=st.executeUpdate("insert into vcm(vid,CPM)values ('"+uId+"','"+cnt+"')");
			          JOptionPane.showMessageDialog(b1,"Thanks for Voting");
			          /*MainPage pg=new MainPage();
		         		pg.setVisible(true);
		         		setVisible(false);
		         		pg.setSize(1200,900);*/
			    	}
			    	catch(Exception ex)
			    	{
			           ex.printStackTrace();
			    	}
			    }   
		    	
				if(r7.isSelected())
		    	{  
		    		//uParty="SJP";
					try
			    	{
			    	 int cnt=1;
			          int i=st.executeUpdate("insert into vcm(vid,SJP)values ('"+uId+"','"+cnt+"')");
			          JOptionPane.showMessageDialog(b1,"Thanks for Voting");
			         /* MainPage pg=new MainPage();
		         		pg.setVisible(true);
		         		setVisible(false);
		         		pg.setSize(1200,900);*/
			          
			    	}
			    	catch(Exception ex)
			    	{
			           ex.printStackTrace();
			    	}
			    } 
					}
						else
						{
							JOptionPane.showMessageDialog(b1,"Voter ID does not Exit");	
						}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
		    				
			    }
			}
		});
		b2.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e1)
			{
            	Voting1 v1=new Voting1();         //code for next page
            	v1.vid1=vid1;
            	v1.setVisible(true);
         		setVisible(false);
         		v1.setSize(800,800);
         		v1.setLocation(250,30);
			}
		});
		
			
	}
}


