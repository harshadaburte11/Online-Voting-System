package ovsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import javax.swing.border.*;


public class Voter extends JFrame 
{
    private static final long serialVersionUID = 1L;
    private JPanel c;
    private JTextField id,name,mob,adhar,age,gender;
   
    private JRadioButton r1;
    private JRadioButton r2;
    private JButton b1;
    String uGender;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    

      public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                      Voter frame = new Voter();                   
                    frame.setVisible(true);
                    frame.setTitle("Voter Page");
                    frame.setSize(850,900);
                    frame.setLocation(250,60);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Voter() 
	{
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);
        c= new JPanel();
        c.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(c);
        c.setLayout(null);
        c.setBackground(Color.gray);  
        JLabel lh = new JLabel("Voter Information");
        lh.setFont(new Font("Times New Roman", Font.BOLD, 42));
        lh.setBounds(300, 52, 500, 50);
       
        c.add(lh);

 		
	    l1 = new JLabel("ID");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l1.setBounds(80, 152, 120, 43);
        c.add(l1);

        l2= new JLabel("Name");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setBounds(80, 235, 120, 43);
        c.add(l2);

        l3= new JLabel("Mobile");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setBounds(80, 310, 120, 43);
        c.add(l3);
		
		  l4= new JLabel("Adhar_No");
         l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l4.setBounds(80,390, 120, 43);
        c.add(l4);
		
		  l5= new JLabel("Age");
         l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l5.setBounds(80,481, 120, 43);
        c.add(l5);
		
		 l6= new JLabel("Gender");
         l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l6.setBounds(80,567, 120, 43);
        c.add(l6);
		
		
		ButtonGroup bg=new ButtonGroup();
		 r1= new JRadioButton("Male");
		 r2=new JRadioButton("Female");
		 bg.add(r1);
		 bg.add(r2);
        r1.setFont(new Font("Tahoma",Font.PLAIN,20));
	    r2.setFont(new Font("Tahoma",Font.PLAIN,20));
        r1.setBounds(200,567,100,40);
	    r2.setBounds(310,567,110,40);
        c.add(r1);
		c.add(r2);
		  
        id = new JTextField();
	    id.setFont(new Font("Tahoma",Font.PLAIN,20));
        id.setBounds(200,151,228,40);
        c.add(id);
        id.setColumns(10);

        name = new JTextField();
        name.setFont(new Font("Tahoma",Font.PLAIN,32));
        name.setBounds(200, 235, 228, 40);
        c.add(name);
        name.setColumns(10);

        mob= new JTextField();
        mob.setFont(new Font("Tahoma",Font.PLAIN,32));
        mob.setBounds(200, 315, 228, 40);
        c.add(mob);
        mob.setColumns(10);

        adhar = new JTextField();
        adhar.setFont(new Font("Tahoma",Font.PLAIN,32));
        adhar.setBounds(200,400,228,40);
        c.add(adhar);
        adhar.setColumns(10);
		
		age= new JTextField();
        age.setFont(new Font("Tahoma",Font.PLAIN,32));
        age.setBounds(200,487,228,40);
        c.add(age);
        age.setColumns(10);
			
        b1= new JButton("Submit");
		
        b1.setFont(new Font("Tahoma",Font.PLAIN,22));
        b1.setBounds(550,570,150,65);
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
												
													try
												{
													Class.forName("com.mysql.cj.jdbc.Driver");
													Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs_db","root","tiger");
													String query = "INSERT INTO voterdb values('" + uId + "','" + uName +"','" + uMobile +"','" + uAdhar_NO +"','" + uAge +"','" + uGender +"')";
													Statement st=con.createStatement();
													int x=st.executeUpdate(query);
													if(x>0)
													{
														 JOptionPane.showMessageDialog(b1,"Welcome ," + msg + "Information Saved Successfully");
														 Voting vt=new Voting();
														 Thread.sleep(1000);
										            		vt.setVisible(true);
										            		setVisible(false);
										            		vt.setSize(800,800);
										            		vt.setLocation(250,30);

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
										//}
									//}
									
								}
								
							}
						}
					}
				}
				
				
			}
		});
			
	}
}

