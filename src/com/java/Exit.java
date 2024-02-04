package com.java;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exit extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel l1,l2,l3;
	ImageIcon img,img1;
	JPanel p1;
	Font f,f1;
	public Exit()
	{
	    setSize(1540,820);
		setTitle("Exit Details");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(null);
	    setVisible(true);
	    
		f = new Font("Modern No. 20",Font.BOLD,40);
        f1 = new Font("Modern No. 20",Font.BOLD,50);
        	
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(450,100,600,250);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setBorder(BorderFactory.createTitledBorder("Exit System...."));
		p1.setVisible(true);
		add(p1);
			 
	    l2 = new JLabel("!!!Thank's For Visit Showroom!!!");
	    l2.setBounds(30,60,700,40);
	    l2.setFont(f);
	    l2.setForeground(Color.RED);	
		p1.add(l2);
		
		img = new ImageIcon("folded-hands-emoji.png");
		Image img3 = img.getImage().getScaledInstance(100,80,Image.SCALE_DEFAULT);
		img = new ImageIcon(img3);
		l3 = new JLabel(img);
	    l3.setBounds(245,130,100,80);	
		p1.add(l3);
		             
		b1 = new JButton("Main Menu");
		b1.setBounds(450,600,288,50);
		b1.setFont(f1);
		b1.setBackground(Color.lightGray);
		b1.setBorder(BorderFactory.createLineBorder(Color.RED,2));
		b1.setToolTipText("To Set A Current Main Menu of System...");
		add(b1);
		
		b2 = new JButton("OUT");
		b2.setBounds(930,600,150,50);
		b2.setFont(f1);
		b2.setBackground(Color.lightGray);
		b2.setBorder(BorderFactory.createLineBorder(Color.RED,2));
		b2.setToolTipText("To Quit The Current Menu of System...");
		add(b2);

		img1 = new ImageIcon("a.jpg");
		Image img2 = img1.getImage().getScaledInstance(1540,820,Image.SCALE_DEFAULT);
		img1 = new ImageIcon(img2);
		l1 = new JLabel(img1);
		l1.setBounds(0,0,1540,820);
		add(l1); 
			  
		b1.addActionListener(this);	
		b2.addActionListener(this);    
	}
	
    public  void actionPerformed(ActionEvent a)
    {
    	if(a.getSource() == b1)
    	{
    		int p = JOptionPane.showConfirmDialog(null,"Are You Sure To Home Menu", "Quit ", JOptionPane.YES_NO_OPTION);
			if(p == JOptionPane.OK_OPTION) 
			{
				setVisible(false);
				new Main();
			}
    	 }
    	if(a.getSource() == b2)
    	{
	        int p = JOptionPane.showConfirmDialog(null,"Are you sure to Quit?", "Home Menu?", JOptionPane.YES_NO_OPTION);
			if(p == JOptionPane.OK_OPTION)
			{
		    	System.exit(0);
            }
    	}
    }
 
    public static void main (String[] args) 
	{
    	new Exit();
    }
}
