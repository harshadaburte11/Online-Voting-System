package ovsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import javax.swing.border.*;


public class Result extends JFrame 
{
    private static final long serialVersionUID = 1L;
    private JPanel c;
    private JTextField tl;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20  ,l21,l22,l23,l24,l25,l26,l27;
    Connection con;
    Statement st;
    ResultSet rs;
	private JComboBox cb1;
	//private JComboBox cb2;
    private JButton b1,b2;
     Integer cnt=4;
     String count;
    

      public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                      Result frame = new Result();                   
                    frame.setVisible(true);
                    frame.setTitle("Candidate Page");
                   // frame.setSize(1200,1000);
                    frame.setLocation(200,60);
                    frame.setSize(900,650);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Result() 
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
        
        JLabel lh = new JLabel(" RESULT ");
        lh.setFont(new Font("Times New Roman", Font.BOLD, 35));
        lh.setBounds(350, 30, 200, 45);
        lh.setForeground(Color.blue);
        c.add(lh);
        
        l1 = new JLabel("Position");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l1.setBounds(30,130, 120, 30);
        c.add(l1);

        l2= new JLabel("Candidate Name");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l2.setBounds(430, 130, 270, 30);
        c.add(l2);
        
        l6= new JLabel(" ");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l6.setBounds(430, 190, 270, 30);
       c.add(l6);
        
        l7= new JLabel("");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l7.setBounds(430, 230, 270, 30);
        c.add(l7);
        
        l8= new JLabel("");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l8.setBounds(430, 270, 150, 30);
        c.add(l8);
        
        l9= new JLabel("");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l9.setBounds(430, 310, 150, 30);
        c.add(l9);
        
        l10= new JLabel("");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l10.setBounds(430, 350, 150, 30);
        c.add(l10);
        
        l11= new JLabel("");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l11.setBounds(430, 390, 150, 30);
        c.add(l11);
        
        l12= new JLabel("");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l12.setBounds(430, 430, 150, 30);
        c.add(l12);
       
        
        
        l3= new JLabel("Total Vote");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l3.setBounds(700, 130, 120, 30);
        c.add(l3);
        
       
       l5= new JLabel("Party");
       l5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l5.setBounds(300, 130, 150, 30);
       c.add(l5);
       
       l14= new JLabel("BJP");
       l14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l14.setBounds(300, 190, 150, 30);
       c.add(l14);
       
       l15= new JLabel("Shiv Sena");
       l15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l15.setBounds(300, 230, 150, 30);
       c.add(l15);

       l16= new JLabel("Congress");
       l16.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l16.setBounds(300, 270, 150, 30);
       c.add(l16);
 
       l17= new JLabel("AAP");
       l17.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l17.setBounds(300, 310, 150, 30);
       c.add(l17);

       l18= new JLabel("CPM");
       l18.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l18.setBounds(300, 350, 150, 30);
       c.add(l18);
        
       l19= new JLabel("BSP");
       l19.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l19.setBounds(300, 390, 150, 30);
       c.add(l19);

       l20= new JLabel("SJP");
       l20.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       l20.setBounds(300, 430, 150, 30);
       c.add(l20);

		String position[]={"PM","CM","Guardian Minister","Arogya Mantri","Minister of Education"};

		JComboBox cb1=new JComboBox(position);
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        cb1.setBounds(15,190,200,25);
		c.add(cb1);
		  
        l27 = new JLabel("");
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l27.setBounds(700, 190, 150, 30);
        c.add(l27);
        
        l21 = new JLabel("cnt");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l21.setBounds(700, 230, 150, 30);
        c.add(l21);
        
        l22 = new JLabel("cnt");
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l22.setBounds(700, 270, 150, 30);
        c.add(l22);
        
        l23 = new JLabel("cnt");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l23.setBounds(700, 310, 150, 30);
        c.add(l23);
        
        l24 = new JLabel("");
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l24.setBounds(700, 350, 150, 30);
        c.add(l24);
        
        l25 = new JLabel("");
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l25.setBounds(700, 390, 150, 30);
        c.add(l25);
        
        l26 = new JLabel("cnt");
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l26.setBounds(700, 430, 150, 30);
        c.add(l26);
        
        
        b1= new JButton("See Result ");
	    b1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        b1.setBounds(320,550, 200,50);
        b1.setBackground(Color.cyan);
        c.add(b1);	
        
        b2= new JButton("Back");
	    b2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        b2.setBounds(540,550, 130,50);
        b2.setBackground(Color.cyan);
        c.add(b2);
        
        b1.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
            	
            	String uPosition=(String)cb1.getItemAt(cb1.getSelectedIndex());
            	if(uPosition.equals("PM"))
            	{
            		try
        	        {
        	        	rs=st.executeQuery("select name from candidatedb where party='bjp' AND position='PM'");
        	        	if(rs.next())
        	        	{
        	        		l6.setText(rs.getString("name"));
        	        	}
        	        	rs=st.executeQuery("select name from candidatedb where party='shiv-sena' AND position='PM'");
         	        	if(rs.next())
         	        	{
         	        		l7.setText(rs.getString("name"));
         	        	}
         	        	 rs=st.executeQuery("select name from candidatedb where party='congress' AND position='PM'");
         	        	if(rs.next())
         	        	{
         	        		l8.setText(rs.getString("name"));
         	        	}
         	        	 rs=st.executeQuery("select name from candidatedb where party='AAP' AND position='PM'");
         	        	if(rs.next())
         	        	{  
         	        		l9.setText(rs.getString("name"));
         	        	}
         	        	
          	        	 rs=st.executeQuery("select name from candidatedb where party='CPM' AND position='PM'");
          	        	if(rs.next())
          	        	{
          	        		l10.setText(rs.getString("name"));
          	        	}
          	        	 rs=st.executeQuery("select name from candidatedb where party='BSP' AND position='PM'");
           	        	if(rs.next())
           	        	{
           	        		l11.setText(rs.getString("name"));
           	        	}
          	        	 rs=st.executeQuery("select name from candidatedb where party='SJP' AND position='PM'");
          	        	if(rs.next())
          	        	{
          	        		l12.setText(rs.getString("name"));
          	        	}
          	        	//total logic 
          	        	
          	        	rs=st.executeQuery("select * from vpm where BJP=1 ");
          	        	while(rs.next())
          	        	{
          	        		cnt++;
          	        	}
          	        	count=cnt.toString();
          	        	l27.setText(count);
          	        	cnt=0;
          	        	
          	        	rs=st.executeQuery("select * from vpm where shivsena=1 ");
          	        	while(rs.next())
          	        	{
          	        		cnt++;
          	        	}
          	        	count=cnt.toString();
          	        	l21.setText(count);
          	        	cnt=0;
          	        	
          	            rs=st.executeQuery("select * from vpm where congress=1 ");
          	        	while(rs.next())
          	        	{
          	        		cnt++;
          	        	}
          	        	count=cnt.toString();
          	        	l22.setText(count);
          	        	cnt=0;
          	        	
          	        	 rs=st.executeQuery("select * from vpm where AAP=1 ");
           	        	while(rs.next())
           	        	{
           	        		cnt++;
           	        	}
           	        	count=cnt.toString();
           	        	l23.setText(count);
           	        	cnt=0;
           	        	
           	           rs=st.executeQuery("select * from vpm where CPM=1 ");
        	        	while(rs.next())
        	        	{
        	        		cnt++;
        	        	}
        	        	count=cnt.toString();
        	        	l24.setText(count);
        	        	cnt=0;
        	        	
        	        	 rs=st.executeQuery("select * from vpm where BSP=1 ");
         	        	while(rs.next())
         	        	{
         	        		cnt++;
         	        	}
         	        	count=cnt.toString();
         	        	l25.setText(count);
         	        	cnt=0;
         	        	
         	        	 rs=st.executeQuery("select * from vpm where sjp=1 ");
          	        	while(rs.next())
          	        	{
          	        		cnt++;
          	        	}
          	        	count=cnt.toString();
          	        	l26.setText(count);
          	        	cnt=0;
          	        	
        	        }
        	        catch (Exception ee) 
        	        {
        				ee.printStackTrace();
        			}
        	        
            	}
            	else
            		if(uPosition.equals("CM"))
                	{
                		try
            	        {
            	        	 rs=st.executeQuery("select name from candidatedb where party='bjp' AND position='CM'");
            	        	if(rs.next())
            	        	{
            	        		l6.setText(rs.getString("name"));
            	        	}
            	        	 rs=st.executeQuery("select name from candidatedb where party='shiv-sena' AND position='CM'");
             	        	if(rs.next())
             	        	{
             	        		l7.setText(rs.getString("name"));
             	        	}
             	        	 rs=st.executeQuery("select name from candidatedb where party='congress' AND position='CM'");
             	        	if(rs.next())
             	        	{
             	        		l8.setText(rs.getString("name"));
             	        	}
             	        	 rs=st.executeQuery("select name from candidatedb where party='AAP' AND position='CM'");
             	        	if(rs.next())
             	        	{
             	        		l9.setText(rs.getString("name"));
             	        	}
             	        	 rs=st.executeQuery("select name from candidatedb where party='BSP' AND position='CM'");
              	        	if(rs.next())
              	        	{
              	        		l10.setText(rs.getString("name"));
              	        	}
              	        	 rs=st.executeQuery("select name from candidatedb where party='CPM' AND position='CM'");
              	        	if(rs.next())
              	        	{
              	        		l11.setText(rs.getString("name"));
              	        	}
              	        	 rs=st.executeQuery("select name from candidatedb where party='SJP' AND position='CM'");
              	        	if(rs.next())
              	        	{
              	        		l12.setText(rs.getString("name"));
              	        	}
              	        	
              	        	//paste here
              	        	rs=st.executeQuery("select * from vcm where BJP=1 ");
              	        	while(rs.next())
              	        	{
              	        		cnt++;
              	        	}
              	        	count=cnt.toString();
              	        	l27.setText(count);
              	        	cnt=0;
              	        	
              	        	rs=st.executeQuery("select * from vcm where shivsena=1 ");
              	        	while(rs.next())
              	        	{
              	        		cnt++;
              	        	}
              	        	count=cnt.toString();
              	        	l21.setText(count);
              	        	cnt=0;
              	        	
              	            rs=st.executeQuery("select * from vcm where congress=1 ");
              	        	while(rs.next())
              	        	{
              	        		cnt++;
              	        	}
              	        	count=cnt.toString();
              	        	l22.setText(count);
              	        	cnt=0;
              	        	
              	        	 rs=st.executeQuery("select * from vcm where AAP=1 ");
               	        	while(rs.next())
               	        	{
               	        		cnt++;
               	        	}
               	        	count=cnt.toString();
               	        	l23.setText(count);
               	        	cnt=0;
               	        	
               	           rs=st.executeQuery("select * from vcm where CPM=1 ");
            	        	while(rs.next())
            	        	{
            	        		cnt++;
            	        	}
            	        	count=cnt.toString();
            	        	l24.setText(count);
            	        	cnt=0;
            	        	
            	        	 rs=st.executeQuery("select * from vcm where BSP=1 ");
             	        	while(rs.next())
             	        	{
             	        		cnt++;
             	        	}
             	        	count=cnt.toString();
             	        	l25.setText(count);
             	        	cnt=0;
             	        	
             	        	 rs=st.executeQuery("select * from vcm where sjp=1 ");
              	        	while(rs.next())
              	        	{
              	        		cnt++;
              	        	}
              	        	count=cnt.toString();
              	        	l26.setText(count);
              	        	cnt=0;
              	        	
            	        }
            	        catch (Exception ee) 
            	        {
            				ee.printStackTrace();
            			}
            	        
                	}
            		else
            			if(uPosition.equals("Minister of Education"))
                    	{
                    		try
                	        {
                	        	 rs=st.executeQuery("select name from candidatedb where party='bjp' AND position='Minister of Education'");
                	        	if(rs.next())
                	        	{
                	        		l6.setText(rs.getString("name"));
                	        	}
                	        	 rs=st.executeQuery("select name from candidatedb where party='shiv-sena' AND position='Minister of Education'");
                 	        	if(rs.next())
                 	        	{
                 	        		l7.setText(rs.getString("name"));
                 	        	}
                 	        	 rs=st.executeQuery("select name from candidatedb where party='congress' AND position='Minister of Education'");
                 	        	if(rs.next())
                 	        	{
                 	        		l8.setText(rs.getString("name"));
                 	        	}
                 	        	 rs=st.executeQuery("select name from candidatedb where party='AAP' AND position='Minister of Education'");
                 	        	if(rs.next())
                 	        	{
                 	        		l9.setText(rs.getString("name"));
                 	        	}
                 	        	 rs=st.executeQuery("select name from candidatedb where party='BSP' AND position='Minister of Education'");
                  	        	if(rs.next())
                  	        	{
                  	        		l10.setText(rs.getString("name"));
                  	        	}
                  	        	 rs=st.executeQuery("select name from candidatedb where party='CPM' AND position='Minister of Education'");
                  	        	if(rs.next())
                  	        	{
                  	        		l11.setText(rs.getString("name"));
                  	        	}
                  	        	 rs=st.executeQuery("select name from candidatedb where party='SJP' AND position='Minister of Education'");
                  	        	if(rs.next())
                  	        	{
                  	        		l12.setText(rs.getString("name"));
                  	        	}
                  	        	//paste here
                  	        	rs=st.executeQuery("select * from vem where BJP=1 ");
                  	        	while(rs.next())
                  	        	{
                  	        		cnt++;
                  	        	}
                  	        	count=cnt.toString();
                  	        	l27.setText(count);
                  	        	cnt=0;
                  	        	
                  	        	rs=st.executeQuery("select * from vem where shivsena=1 ");
                  	        	while(rs.next())
                  	        	{
                  	        		cnt++;
                  	        	}
                  	        	count=cnt.toString();
                  	        	l21.setText(count);
                  	        	cnt=0;
                  	        	
                  	            rs=st.executeQuery("select * from vem where congress=1 ");
                  	        	while(rs.next())
                  	        	{
                  	        		cnt++;
                  	        	}
                  	        	count=cnt.toString();
                  	        	l22.setText(count);
                  	        	cnt=0;
                  	        	
                  	        	 rs=st.executeQuery("select * from vem where AAP=1 ");
                   	        	while(rs.next())
                   	        	{
                   	        		cnt++;
                   	        	}
                   	        	count=cnt.toString();
                   	        	l23.setText(count);
                   	        	cnt=0;
                   	        	
                   	           rs=st.executeQuery("select * from vem where CPM=1 ");
                	        	while(rs.next())
                	        	{
                	        		cnt++;
                	        	}
                	        	count=cnt.toString();
                	        	l24.setText(count);
                	        	cnt=0;
                	        	
                	        	 rs=st.executeQuery("select * from vem where BSP=1 ");
                 	        	while(rs.next())
                 	        	{
                 	        		cnt++;
                 	        	}
                 	        	count=cnt.toString();
                 	        	l25.setText(count);
                 	        	cnt=0;
                 	        	
                 	        	 rs=st.executeQuery("select * from vem where sjp=1 ");
                  	        	while(rs.next())
                  	        	{
                  	        		cnt++;
                  	        	}
                  	        	count=cnt.toString();
                  	        	l26.setText(count);
                  	        	cnt=0;
                  	        	
                  	        	
                	        }
                	        catch (Exception ee) 
                	        {
                				ee.printStackTrace();
                			}
                	        
                    	}
            			else
            				if(uPosition.equals("Guardian Minister"))
                        	{
                        		try
                    	        {
                    	        	 rs=st.executeQuery("select name from candidatedb where party='bjp' AND position='Guardian Minister'");
                    	        	if(rs.next())
                    	        	{
                    	        		l6.setText(rs.getString("name"));
                    	        	}
                    	        	 rs=st.executeQuery("select name from candidatedb where party='shiv-sena' AND position='Guardian Minister'");
                     	        	if(rs.next())
                     	        	{
                     	        		l7.setText(rs.getString("name"));
                     	        	}
                     	        	 rs=st.executeQuery("select name from candidatedb where party='congress' AND position='Guardian Minister'");
                     	        	if(rs.next())
                     	        	{
                     	        		l8.setText(rs.getString("name"));
                     	        	}
                     	        	 rs=st.executeQuery("select name from candidatedb where party='AAP' AND position='Guardian Minister'");
                     	        	if(rs.next())
                     	        	{
                     	        		l9.setText(rs.getString("name"));
                     	        	}
                     	        	 rs=st.executeQuery("select name from candidatedb where party='BSP' AND position='Guardian Minister'");
                      	        	if(rs.next())
                      	        	{
                      	        		l10.setText(rs.getString("name"));
                      	        	}
                      	        	 rs=st.executeQuery("select name from candidatedb where party='CPM' AND position='Guardian Minister'");
                      	        	if(rs.next())
                      	        	{
                      	        		l11.setText(rs.getString("name"));
                      	        	}
                      	        	 rs=st.executeQuery("select name from candidatedb where party='SJP' AND position='Guardian Minister'");
                      	        	if(rs.next())
                      	        	{
                      	        		l12.setText(rs.getString("name"));
                      	        	}
                      	        	
                      	        	//paste here
                      	        	rs=st.executeQuery("select * from vgm where BJP=1 ");
                      	        	while(rs.next())
                      	        	{
                      	        		cnt++;
                      	        	}
                      	        	count=cnt.toString();
                      	        	l27.setText(count);
                      	        	cnt=0;
                      	        	
                      	        	rs=st.executeQuery("select * from vgm where shivsena=1 ");
                      	        	while(rs.next())
                      	        	{
                      	        		cnt++;
                      	        	}
                      	        	count=cnt.toString();
                      	        	l21.setText(count);
                      	        	cnt=0;
                      	        	
                      	            rs=st.executeQuery("select * from vgm where congress=1 ");
                      	        	while(rs.next())
                      	        	{
                      	        		cnt++;
                      	        	}
                      	        	count=cnt.toString();
                      	        	l22.setText(count);
                      	        	cnt=0;
                      	        	
                      	        	 rs=st.executeQuery("select * from vgm where AAP=1 ");
                       	        	while(rs.next())
                       	        	{
                       	        		cnt++;
                       	        	}
                       	        	count=cnt.toString();
                       	        	l23.setText(count);
                       	        	cnt=0;
                       	        	
                       	           rs=st.executeQuery("select * from vgm where CPM=1 ");
                    	        	while(rs.next())
                    	        	{
                    	        		cnt++;
                    	        	}
                    	        	count=cnt.toString();
                    	        	l24.setText(count);
                    	        	cnt=0;
                    	        	
                    	        	 rs=st.executeQuery("select * from vgm where BSP=1 ");
                     	        	while(rs.next())
                     	        	{
                     	        		cnt++;
                     	        	}
                     	        	count=cnt.toString();
                     	        	l25.setText(count);
                     	        	cnt=0;
                     	        	
                     	        	 rs=st.executeQuery("select * from vgm where sjp=1 ");
                      	        	while(rs.next())
                      	        	{
                      	        		cnt++;
                      	        	}
                      	        	count=cnt.toString();
                      	        	l26.setText(count);
                      	        	cnt=0;
                    	        }
                    	        catch (Exception ee) 
                    	        {
                    				ee.printStackTrace();
                    			}
                    	        
                        	}
            				else
            					if(uPosition.equals("Arogya Mantri"))
                            	{
                            		try
                        	        {
                        	        	 rs=st.executeQuery("select name from candidatedb where party='bjp' AND position='Arogya Mantri'");
                        	        	if(rs.next())
                        	        	{
                        	        		l6.setText(rs.getString("name"));
                        	        	}
                        	        	 rs=st.executeQuery("select name from candidatedb where party='shiv-sena' AND position='Arogya Mantri'");
                         	        	if(rs.next())
                         	        	{
                         	        		l7.setText(rs.getString("name"));
                         	        	}
                         	        	 rs=st.executeQuery("select name from candidatedb where party='congress' AND position='Arogya Mantri'");
                         	        	if(rs.next())
                         	        	{
                         	        		l8.setText(rs.getString("name"));
                         	        	}
                         	        	 rs=st.executeQuery("select name from candidatedb where party='AAP' AND position='Arogya Mantri'");
                         	        	if(rs.next())
                         	        	{
                         	        		l9.setText(rs.getString("name"));
                         	        	}
                         	        	 rs=st.executeQuery("select name from candidatedb where party='BSP' AND position='Arogya Mantri'");
                          	        	if(rs.next())
                          	        	{
                          	        		l10.setText(rs.getString("name"));
                          	        	}
                          	        	 rs=st.executeQuery("select name from candidatedb where party='CPM' AND position='Arogya Mantri'");
                          	        	if(rs.next())
                          	        	{
                          	        		l11.setText(rs.getString("name"));
                          	        	}
                          	        	 rs=st.executeQuery("select name from candidatedb where party='SJP' AND position='Arogya Mantri'");
                          	        	if(rs.next())
                          	        	{
                          	        		l12.setText(rs.getString("name"));
                          	        	}
                          	        	//paste here
                          	        	rs=st.executeQuery("select * from vam where BJP=1 ");
                          	        	while(rs.next())
                          	        	{
                          	        		cnt++;
                          	        	}
                          	        	count=cnt.toString();
                          	        	l27.setText(count);
                          	        	cnt=0;
                          	        	
                          	        	rs=st.executeQuery("select * from vam where shivsena=1 ");
                          	        	while(rs.next())
                          	        	{
                          	        		cnt++;
                          	        	}
                          	        	count=cnt.toString();
                          	        	l21.setText(count);
                          	        	cnt=0;
                          	        	
                          	            rs=st.executeQuery("select * from vam where congress=1 ");
                          	        	while(rs.next())
                          	        	{
                          	        		cnt++;
                          	        	}
                          	        	count=cnt.toString();
                          	        	l22.setText(count);
                          	        	cnt=0;
                          	        	
                          	        	 rs=st.executeQuery("select * from vam where AAP=1 ");
                           	        	while(rs.next())
                           	        	{
                           	        		cnt++;
                           	        	}
                           	        	count=cnt.toString();
                           	        	l23.setText(count);
                           	        	cnt=0;
                           	        	
                           	           rs=st.executeQuery("select * from vam where CPM=1 ");
                        	        	while(rs.next())
                        	        	{
                        	        		cnt++;
                        	        	}
                        	        	count=cnt.toString();
                        	        	l24.setText(count);
                        	        	cnt=0;
                        	        	
                        	        	 rs=st.executeQuery("select * from vam where BSP=1 ");
                         	        	while(rs.next())
                         	        	{
                         	        		cnt++;
                         	        	}
                         	        	count=cnt.toString();
                         	        	l25.setText(count);
                         	        	cnt=0;
                         	        	
                         	        	 rs=st.executeQuery("select * from vam  where sjp=1 ");
                          	        	while(rs.next())
                          	        	{
                          	        		cnt++;
                          	        	}
                          	        	count=cnt.toString();
                          	        	l26.setText(count);
                          	        	cnt=0;
                        	        }
                        	        catch (Exception ee) 
                        	        {
                        				ee.printStackTrace();
                        			}
                        	        
                            	}
            			
			}
		});
        b2.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e1)
			{
            	try
            	{
            	 Main pg=new Main();
	         		pg.setVisible(true);
	         		setVisible(false);
	         		pg.setSize(800,600);
	         		pg.setLocation(250,100);
            	}
            	catch(Exception ex)
            	{
            		System.out.println(ex);
            	}
			}
		});
		
	}
    
}