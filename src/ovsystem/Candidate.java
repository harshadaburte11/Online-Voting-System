package ovsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import javax.swing.border.*;


public class Candidate extends JFrame 
{
    private static final long serialVersionUID = 1L;
    private JPanel c;
    private JTextField id,name,mob,adhar,age,gender,party1;
   
    private JRadioButton r1;
    private JRadioButton r2;
	private JComboBox cb1;
	private JComboBox cb2;
    private JButton b1;
    String uGender;
    Connection con;
    Statement st;
     String uName1;
     String uPass1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    

      public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                      Candidate frame = new Candidate();                   
                    frame.setVisible(true);
                    frame.setTitle("Candidate Page");
                  // frame.setSize(1200,1700);
                    frame.setLocation(250,60);
                    frame.setSize(850,700);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

public void setName()
{}
    public Candidate() 
	{
    	//System.out.println("Username="+uName);
    	//System.out.println("Password="+uPass);
    	try
    	{
    	Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs_db","root","tiger");
		 st=con.createStatement();
    	}
    	catch(Exception e)
    	{
    	   e.printStackTrace();
    	}
    	
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);
        c= new JPanel();
        c.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(c);
        c.setLayout(null);
        c.setBackground(Color.gray);  
        JLabel lh = new JLabel("Candidate Information");
        lh.setFont(new Font("Times New Roman", Font.BOLD, 35));
        lh.setBounds(235, 30, 400, 45);
        lh.setForeground(Color.blue);
        c.add(lh);

 		
	    l1 = new JLabel("ID");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l1.setBounds(100, 125, 120, 30);
        c.add(l1);

        l2= new JLabel("Name");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l2.setBounds(100, 175, 120, 30);
        
        c.add(l2);

        l3= new JLabel("Mobile");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l3.setBounds(100, 225, 120, 30);
        c.add(l3);
		
		  l4= new JLabel("Adhar_No");
         l4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l4.setBounds(100,275, 120, 30);
        c.add(l4);
		
		  l5= new JLabel("Age :");
         l5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l5.setBounds(100,320, 120, 30);
        c.add(l5);
		
		 l6= new JLabel("Gender :");
         l6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l6.setBounds(100,370, 120, 30);
        c.add(l6);

         l7= new JLabel("Party");
         l7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l7.setBounds(100,415, 100, 30);
        c.add(l7);
		
		String party[]={"BJP","Shiv-Sena","Congress","AAP","BSP","CPM","SJP"};
		JComboBox cb=new JComboBox(party);
		cb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       cb.setBounds(200,415,228,40);
		c.add(cb);
		
		l8= new JLabel("Position");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l8.setBounds(100,460,120, 40);
        c.add(l8);
		String position[]={"PM","CM","Guardian Minister","Arogya Mantri","Minister of Education"};
		JComboBox cb1=new JComboBox(position);
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        cb1.setBounds(200,460,228,40);
		c.add(cb1);
		
		
		ButtonGroup bg=new ButtonGroup();
		 r1= new JRadioButton("Male");
		 r2=new JRadioButton("Female");
		 bg.add(r1);
		 bg.add(r2);
        r1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    r2.setFont(new Font("Tahoma",Font.PLAIN,20));
        r1.setBounds(200,370, 100, 30);
	    r2.setBounds(310,370,110,30);
        c.add(r1);
		c.add(r2);
		  
        id = new JTextField();
	    id.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        id.setBounds(200, 125, 228, 30);
        c.add(id);
        id.setColumns(10);

        name = new JTextField();
        name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        name.setBounds(200, 175, 228, 30);
        try
        {
        	ResultSet rs=st.executeQuery("select * from regcdtdb where  username='"+ uName1+"' and password='"+uPass1+"'");
        	while(rs.next())
        	{
        		
        		name.setText(rs.getString("firstname")+" "+rs.getString("lastname"));
        	}
        }
        catch (Exception e) {
			e.printStackTrace();
        }

        c.add(name);
        name.setColumns(10);

        mob= new JTextField();
        mob.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mob.setBounds(200, 225, 228, 30);
        c.add(mob);
        mob.setColumns(10);

        adhar = new JTextField();
        adhar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        adhar.setBounds(200, 275, 228, 30);
        c.add(adhar);
        adhar.setColumns(10);
		
		age= new JTextField();
        age.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        age.setBounds(200,325 , 228, 30);
        c.add(age);
        age.setColumns(10);
			
        b1= new JButton("Submit");
		
        b1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        b1.setBounds(550,570, 150,50);
        b1.setBackground(Color.cyan);
        c.add(b1);	
		
		
		b1.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
				String uId=id.getText();
				String uName=name.getText();
			    String uMobile=mob.getText();
				String uAdhar_NO=adhar.getText();
				String uAge=age.getText();
			    
			    if(r1.isSelected())
			    {    
			         uGender="male";
			    }    
		    	if(r2.isSelected())
		    	{  
		    		uGender="female";
		    	} 
				String uParty=(String)cb.getItemAt(cb.getSelectedIndex());
				String uPosition=(String)cb1.getItemAt(cb1.getSelectedIndex());
				
				
				int len=uMobile.length();// length of mobile no
				int len_A=uAdhar_NO.length();// length of adhar number always 12
				String msg=" "+uName;
				msg+="\n";
				if(uId.isEmpty())
				{
					JOptionPane.showMessageDialog(b1,"Enter Valid Id");
				}else 
				{
					if(uName.isEmpty()) 
					{
						JOptionPane.showMessageDialog(b1,"Enter Valid Name");
					}
					else
					{
						if(uMobile.isEmpty()||len!=10) 
						{
							JOptionPane.showMessageDialog(b1,"Enter Valid Mobile Number");
						}
						else
						{
							if(uAdhar_NO.isEmpty()||len_A!=12) 
							{
								JOptionPane.showMessageDialog(b1,"Enter Valid Adhar Number");
							}
							else
							{
								if(uAge.isEmpty()) 
								{
									JOptionPane.showMessageDialog(b1,"Enter Valid Age");
								}
								else
								{
									if(uGender.isEmpty()) 
									{
										JOptionPane.showMessageDialog(b1,"Select Gender");
									}
									else
									{
										if(uParty.isEmpty()) 
										{
											JOptionPane.showMessageDialog(b1,"Select Valid Party");
										}
										else
										{
											if(uPosition.isEmpty()) 
											{
												JOptionPane.showMessageDialog(b1,"Select Valid  Position");
											}
											else
											{
												System.out.println(uGender);
													try
												{
													
													String query = "INSERT INTO candidatedb values('" + uId + "','" + uName +"','" + uMobile +"','" + uAdhar_NO +"','" + uAge +"','" + uGender +"','" 
													+ uParty +"','" + uPosition +"')";
													
													int x=st.executeUpdate(query);
													if(x>0)
													{
														 JOptionPane.showMessageDialog(b1,"Welcome ," + msg + "Information Saved Successfully");
														 Login lg=new Login();
														 Thread.sleep(1000);
										            		lg.setVisible(true);
										            		setVisible(false);
										            		lg.setSize(800,660);
										            		lg.setLocation(250,100);
													}
													else
													{
													   System.out.println("Error occured While storing data");
								                    }
													con.close();
													
											
											    }
												catch(Exception ex)
												{
													ex.printStackTrace();
												}
												
											}
										}
									}
									
								}
								
							}
						}
					}
				}
				
				
			}
		});
			
	}
}