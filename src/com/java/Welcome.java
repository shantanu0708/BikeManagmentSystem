package com.java;
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

class Welcome extends JFrame implements ActionListener
{
	ImageIcon img1 = new ImageIcon("Honda_showroom_img.png");
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10; 
    Font f,f1,f2;  
    JButton b1;
    Color Very_Dark_Red = new Color(153,0,0);
    Color Very_Dark_Blue = new Color(0,0,153);
    Color Light_Yellow = new Color(255,255,153);
    Welcome() 
    {
    	setTitle("Welcome");
    	Image img2 = img1.getImage().getScaledInstance(1530, 780, Image.SCALE_DEFAULT);
    	img1 = new ImageIcon(img2);
		setVisible(true);
		setBounds(0,0,1545,820);
		// setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	   	setLayout(null);
	   	
		l = new JLabel(img1);
       	add(l);
	   	l.setBounds(0,0,1530,780);
	   	
		l1 = new JLabel("WELCOME TO HONDA SHOWROOM");
		l2 = new JLabel("Developed By:-");
		l3 = new JLabel("Sarthak Shital Patil");
		l4 = new JLabel("Shantanu Pravin Patil");
		l5 = new JLabel("Pravin Ravindra Sutar");
		l6 = new JLabel("Sejal Sanjay More");
		l7 = new JLabel("Shravani Abhaykumar Gudale");
		l8 = new JLabel("Maithili Ajit Kamble");
		l9 = new JLabel("Under The Guidence Of:-");
		l10 = new JLabel("Mr. Amit Dighe sir");
			
		f = new Font("Modern No. 20",Font.BOLD,50);
		f1 = new Font("Modern No. 20",Font.BOLD,35);
        f2 = new Font("Modern No. 20",Font.BOLD,40);
        
		l1.setFont(f);
		l1.setBounds(350,40,858,50);
		l1.setOpaque(true);
		l1.setBackground(Color.LIGHT_GRAY);
		l1.setForeground(Very_Dark_Red);
		l.add(l1);
	
		l2.setFont(f1);
		l2.setBounds(10,220,225,32);
		l2.setOpaque(true);
		l2.setBackground(Color.GRAY);
        l2.setForeground(Light_Yellow);
		l.add(l2);
		
		l3.setFont(f2);
		l3.setBounds(250,250,357,37);
		l3.setOpaque(true);
		l3.setBackground(Color.GRAY);
        l3.setForeground(Color.PINK);
		l.add(l3);
		
		l4.setFont(f2);
		l4.setBounds(250,315,399,37);
		l4.setOpaque(true);
		l4.setBackground(Color.GRAY);
        l4.setForeground(Color.PINK);
		l.add(l4);
		
		l5.setFont(f2);
		l5.setBounds(250,380,402,37);
		l5.setOpaque(true);
		l5.setBackground(Color.GRAY);
        l5.setForeground(Color.PINK);
		l.add(l5);
		
		l6.setFont(f2);
		l6.setBounds(720,250,323,37);
		l6.setOpaque(true);
		l6.setBackground(Color.GRAY);
        l6.setForeground(Color.PINK);
		l.add(l6);
		
		l7.setFont(f2);
		l7.setBounds(720,315,531,37);
		l7.setOpaque(true);
		l7.setBackground(Color.GRAY);
        l7.setForeground(Color.PINK);
		l.add(l7);
		
		l8.setFont(f2);
		l8.setBounds(720,380,384,37);
		l8.setOpaque(true);
		l8.setBackground(Color.GRAY);
        l8.setForeground(Color.PINK);
		l.add(l8);

		l9.setFont(f1);
		l9.setBounds(10,450,375,32);
		l9.setOpaque(true);
		l9.setBackground(Color.GRAY);
        l9.setForeground(Light_Yellow);
		l.add(l9);
		
		l10.setFont(f2);
		l10.setBounds(390,485,348,37);
		l10.setOpaque(true);
		l10.setBackground(Color.GRAY);
        l10.setForeground(Color.PINK);
		l.add(l10);

    	b1=new JButton("!!Let's Start!!");
    	b1.setForeground(Color.RED);
    	b1.setFont(f);
    	b1.setBounds(590,590,400,65);
    	l.add(b1);
    	
    	b1.setToolTipText("To Click On Next Button ");
    	b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()== b1)
    	{
    		setVisible(false);
            new Login();
    	}	
    }	
    
    public static void main(String[] args) 
    {
    	new Welcome();
    }
}