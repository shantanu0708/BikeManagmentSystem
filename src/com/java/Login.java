package com.java;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends Frame implements ActionListener
{
	Label l1,l2;
	JTextField t1;
	JPasswordField t2;
	Button b1,b2;
	Font f,f1;
	public String loginname;
    public String loginpass;
	Login()
	{
		super("Login");
	    f1 = new Font("Lucida Calligraphy",Font.BOLD,25);
	    f = new Font("Modern No. 20",Font.BOLD,30);
        setFont(f1);
        
        setBackground(Color.ORANGE);
        setForeground(Color.RED);
		setBounds(300,5,900,700);
		setLayout(null);
		setVisible(true);
		
		l1 = new Label("Enter Username:");
		l2 = new Label("Enter Passward:");
		
		t1 = new JTextField();
		t1.setFont(f);
		t2 = new JPasswordField();
		t2.setFont(f);
		
		b1 = new Button("Login");
		b2 = new Button("Exit");

		l1.setBounds(200,120,196,50);
		add(l1);
		l2.setBounds(200,200,192,50);
		add(l2);
		
		t1.setBounds(430,125,200,40);
		add(t1);
		t2.setBounds(430,205,200,40);
		add(t2);
		
		b1.setBounds(280,320,100,50);
		add(b1);
		b2.setBounds(480,320,100,50);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		
		if(str.equals("Exit"))
		{
			System.exit(0);
		}
		loginname = t1.getText().trim();
		loginpass = t2.getText().trim();
		
		if(str.equals("Login"))
		{
			 if(t1.getText().equals("shantanu") && t2.getText().equals("shantanu"))
			 {
				JOptionPane.showMessageDialog(null,"You Have successfully Login");
				setVisible(false);
				new Main();    
			 } 
			 else
			 {
			  	JOptionPane.showMessageDialog(null,"Invalid UserName And Passward");
			 }
		}		
    }
   
    public static void main(String args[])
    {
    	new Login();
    }
}