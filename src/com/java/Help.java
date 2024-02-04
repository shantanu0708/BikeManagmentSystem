package com.java;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Help extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	ImageIcon img,img1;
	JPanel p1,p2;
	Font f,f1,f2;
	public Help()
	{
	    setSize(1540,820);
		setLayout(null);
		setTitle("Help Details");
    	setForeground(Color.black);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		f = new Font("Modern No. 20",Font.BOLD,40);
        f1 = new Font("Modern No. 20",Font.BOLD,30);
        f2 = new Font("Modern No. 20",Font.BOLD,20);
        
        img1 = new ImageIcon("oo.jpg");
        Image img2 = img1.getImage().getScaledInstance(450,180,Image.SCALE_DEFAULT);
		img1 = new ImageIcon(img2);
		l2 = new JLabel(img1);
		l2.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		l2.setBounds(550,0,450,180);
		add(l2);
         
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(1200,250,300,160);
		p1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		p1.setVisible(true);
		add(p1);
		
		l8 = new JLabel("***** Visit In Showroom *****");
	    l8.setBounds(20,10,270,20);
	    l8.setForeground(Color.BLACK);	
	    l8.setFont(f2);
		p1.add(l8);
        
		l9 = new JLabel("\" Honda Showroom \"");
	    l9.setBounds(65,40,180,20);
	    l9.setForeground(Color.BLACK);
	    l9.setFont(f2);
		p1.add(l9);
                 
		l10 = new JLabel("Radhanagari Road,");
	    l10.setBounds(70,70,165,20);
	    l10.setForeground(Color.BLACK);
	    l10.setFont(f2);
		p1.add(l10);
		            
		l11 = new JLabel(" Kolhapur,");
	    l11.setBounds(100,100,155,20);
	    l11.setForeground(Color.BLACK);
	    l11.setFont(f2);
		p1.add(l11);
		            
		l12 = new JLabel(" 416001.");
	    l12.setBounds(115,130,120,20);
	    l12.setForeground(Color.BLACK);
	    l12.setFont(f2);
		p1.add(l12);
		
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(420,510,700,270);
		p2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		p2.setVisible(true);
		add(p2);
        
		l3 = new JLabel("Honda Showroom Management System");
	    l3.setBounds(15,5,668,40);
	    l3.setForeground(Color.RED);
	    l3.setFont(f);
		p2.add(l3);
		
		l4 = new JLabel(" Web side:- \" www.HondaBikes@.com \"");
	    l4.setBounds(30,55,600,30);
	    l4.setForeground(Color.BLACK);
	    l4.setFont(f1);
		p2.add(l4);
		
		l5 = new JLabel(" Contact Number:-");
	    l5.setBounds(30,95,260,30);
	    l5.setForeground(Color.BLACK);
	    l5.setFont(f1);
		p2.add(l5);
		
		l6 = new JLabel("Honda Helpline:- \t\t1800113121 (Toll-Free),");
	    l6.setBounds(65,135,548,30);
	    l6.setForeground(Color.BLACK);
	    l6.setFont(f1);
		p2.add(l6);
		          
		l7 = new JLabel("\nShantanu Patil:- \t\t8446246172.");
	    l7.setBounds(65,175,385,30);
	    l7.setForeground(Color.BLACK)  ;	
	    l7.setFont(f1);
		p2.add(l7);
		 
		b1 = new JButton("Main");
		b1.setBounds(220,210,250,50);
		b1.setFont(f1);
		b1.setBackground(Color.lightGray);
		b1.setToolTipText("To Set A Current Main Menu of System...");
		p2.add(b1);
	    b1.addActionListener(this);
		
		img = new ImageIcon("New_cb350 cc Honda.jpeg");
		Image img3 = img.getImage().getScaledInstance(1540,810,Image.SCALE_DEFAULT);
		img = new ImageIcon(img3);
		l1 = new JLabel(img);
		l1.setBounds(0,0,1540,810);
		add(l1);
	}
	
    public  void actionPerformed(ActionEvent a)
    {
    	if(a.getSource() == b1)
    	{
    		int p = JOptionPane.showConfirmDialog(null,"Are You Sure To Home Menu", "Quit  Help Page?", JOptionPane.YES_NO_OPTION);
			if(p == JOptionPane.OK_OPTION) 
			{
				setVisible(false);
				new Main();
			}
    	}
    }
 
	public static void main (String[] args) 
	{
		new Help();	
    }
}
