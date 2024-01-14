package ovsystem;
import java.awt.Color;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Registration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton,btnNewButton1,b3;
   // Registration frame1;
    int flag=0;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration frame = new Registration();                   
                    frame.setVisible(true);
                    frame.setTitle("Register Page");
                    frame.setLocation(200,60);
             		
                    frame.setSize(800,670);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Registration()
	{
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        //setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.gray);
		
        JLabel lblNewUserRegister = new JLabel("New Registration");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setForeground(Color.blue);
        lblNewUserRegister.setBounds(252, 30, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First Name :");
        lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblName.setBounds(100, 120, 110, 35);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last Name :");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel.setBounds(100, 193, 110, 35);
        contentPane.add(lblNewLabel);

        firstname = new JTextField();
        firstname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        firstname.setBounds(214, 120, 228, 35);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lastname.setBounds(214, 193, 228, 35);
        contentPane.add(lastname);
        lastname.setColumns(10);

       

        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblUsername.setBounds(100, 266, 110, 35);
        contentPane.add(lblUsername);
        
        username = new JTextField();
        username.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        username.setBounds(214, 266, 228, 35);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblPassword.setBounds(100, 339, 110, 35);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile No :");
        lblMobileNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblMobileNumber.setBounds(100, 412, 150, 35);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mob.setBounds(214, 412, 228, 35);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passwordField.setBounds(214, 339, 228, 35);
        contentPane.add(passwordField);
        //Button For Candidate Registration
        
        btnNewButton = new JButton("Register As Candidate");
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = passwordField.getText();

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) 
				{
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }

                try
				{
                	Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs_db", "root", "tiger");

                    String query = "INSERT INTO regcdtdb values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x>0)
						{
                    	  JOptionPane.showMessageDialog(btnNewButton,"Welcome, " + msg + "Registration sucessfully ");
                    	  Login ln=new Login();
                  		setVisible(false);
                  		ln.setVisible(true);
                  		
                  		ln.setSize(800,660);
                  		ln.setLocation(250,100);

                        } 
						else 
						{
                        
                           System.out.println("data not inserted successfully");
                        }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        btnNewButton.setBounds(100, 500, 250, 35);
        btnNewButton.setForeground(Color.black);
        contentPane.add(btnNewButton);
        btnNewButton.setBackground(Color.cyan);
        
        //Button for Voter Registration

       btnNewButton1 = new JButton("Register As Voter");
        
        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
            	
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = passwordField.getText();

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) 
				{
                    JOptionPane.showMessageDialog(btnNewButton1, "Enter a valid mobile number");
                }

                try
				{
                	Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs_db", "root", "tiger");

                    String query = "INSERT INTO regisdb values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x>0)
						{
                    	  JOptionPane.showMessageDialog(btnNewButton1,"Welcome, " + msg + "Registration sucessfully ");
                    	  Login ln=new Login();
                  		setVisible(false);
                  		ln.setVisible(true);

                  		ln.setSize(800,660);
                  		ln.setLocation(250,100);

                        } 
						else 
						{
                        
                           System.out.println("data not inserted successfully");
                        }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
        btnNewButton1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        btnNewButton1.setBounds(400, 500, 250, 35);
        btnNewButton1.setForeground(Color.black);
        btnNewButton1.setBackground(Color.cyan);
        contentPane.add(btnNewButton1);
        
       //button for login
        b3 = new JButton("Already Registered");
        
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
            	
                
                        Login ln=new Login();
                  		setVisible(false);
                  		ln.setVisible(true);

                  		ln.setSize(800,660);
                  		ln.setLocation(250,100);
            }

                        
        });
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBounds(250, 580, 230, 35);
        b3.setForeground(Color.black);
        b3.setBackground(Color.cyan);
        contentPane.add(b3);

        
        
		
    }
}

