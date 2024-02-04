package com.java;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main extends Frame implements ActionListener
{
	MenuBar menubar;
	Menu customer,employee,bikes,bill,report,help,exit;
	MenuItem cd,ed,bd,bf,cr,er,br,bbr,he,ex;
	Font f1;
	Image img;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	ImageIcon img1,img2,img3,img4,img5,img6,img7;
	public Main()
	{
	    f1 = new Font("Arial",Font.BOLD,20);
	    setTitle("Welcome");
		setSize(1540,820);
		setLayout(null);
		setVisible(true);

		menubar = new MenuBar();
		customer = new Menu("Customer");
		employee = new Menu("Employee");
		bikes = new Menu("Bikes");
		bill = new Menu("Bill");
		report = new Menu("Report");
		help = new Menu("Help");
		exit = new Menu("Exit");

		cd = new MenuItem("Customer Details");
		ed = new MenuItem("Employee Details");
		bd = new MenuItem("Bikes Details");
		bf = new MenuItem("Bill Form");
		cr = new MenuItem("Customer Report");
		er = new MenuItem("Employee Report");
		br = new MenuItem("Bikes Report");
		bbr = new MenuItem("Bill Report");
		he = new MenuItem("Help");
		ex = new MenuItem("quit");

	    setMenuBar(menubar);
		menubar.add(customer);
		menubar.add(employee);
		menubar.add(bikes);
		menubar.add(bill);
		menubar.add(report);
		menubar.add(help);
		menubar.add(exit);

		customer.add(cd);
		employee.add(ed);
		bikes.add(bd);
		bill.add(bf);
		report.add(cr);
		report.add(er);
		report.add(br);
		report.add(bbr);
		help.add(he);
		exit.add(ex);
		
		img1 = new ImageIcon("bikes image\\Honda Shine.jpg");
		img = img1.getImage().getScaledInstance(530,430,Image.SCALE_DEFAULT);
		img1 = new ImageIcon(img);
		l1 = new JLabel(img1);
		l1.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
        l1.setBounds(65,105,420,310);
		add(l1);
		
		img2 = new ImageIcon("bikes image\\New_Honda_Activa.jpg");
		img = img2.getImage().getScaledInstance(420,310,Image.SCALE_DEFAULT);
		img2 = new ImageIcon(img);
		l2 = new JLabel(img2);
		l2.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
        l2.setBounds(65,430,420,310);
		add(l2);
		
		img3 = new ImageIcon("bikes image\\Honda CBR650R.jpg");
		img = img3.getImage().getScaledInstance(420,310,Image.SCALE_DEFAULT);
		img3 = new ImageIcon(img);
		l3 = new JLabel(img3);
		l3.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
        l3.setBounds(1050,105,420,310);
		add(l3);
		
		img4 = new ImageIcon("bikes image\\Honda CB300R.jpg");
		img = img4.getImage().getScaledInstance(420,310,Image.SCALE_DEFAULT);
		img4 = new ImageIcon(img);
		l4 = new JLabel(img4);
		l4.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
        l4.setBounds(1050,430,420,310);
		add(l4);
		
		img5 = new ImageIcon("bikes image\\Honda GB350.jpg");
		img = img5.getImage().getScaledInstance(520,310,Image.SCALE_DEFAULT);
		img5 = new ImageIcon(img);
		l5 = new JLabel(img5);
		l5.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
        l5.setBounds(510,430,520,310);
		add(l5);
		
		img6 = new ImageIcon("honda_logo.jpg");
		l6 = new JLabel(img6);
		l6.setBounds(680,110,190,200);
		add(l6);
		
		img7 = new ImageIcon("background_showroom1.jpg");
		img = img7.getImage().getScaledInstance(1540,820,Image.SCALE_DEFAULT);
		img7 = new ImageIcon(img);
		l7 = new JLabel(img7);
		l7.setBounds(0,0,1540,820);
		add(l7);
		
		cd.addActionListener(this);
        ed.addActionListener(this);	
        bd.addActionListener(this);
        bf.addActionListener(this);
        cr.addActionListener(this);
        er.addActionListener(this);
        br.addActionListener(this);
        bbr.addActionListener(this);
        he.addActionListener(this);
		ex.addActionListener(this);
    }
	
	public void actionPerformed(ActionEvent ea)
    {
       	String str = ea.getActionCommand();
       	if(str.equals("Customer Details")) 
       	{    
       		setVisible(false);
       		new Customer();
        }
        if(str.equals("Employee Details"))
        {
        	setVisible(false);
        	new Employee();
        }
        if(str.equals("Bikes Details"))
        {
        	setVisible(false);
        	new Bikes();
        }
        if(str.equals("Customer Report"))
        {
          	new Customerreport();
        }
        if(str.equals("Employee Report"))
        {
          	new Employeereport();
        }
        if(str.equals("Bikes Report"))
        {
          	new Bikesreport();
        }
        if(str.equals("Bill Form"))
        {
        	setVisible(false);
        	new Bill();
        }
        if(str.equals("Bill Report"))
        {
          	new Billreport();
        }
        if(str.equals("Help"))
        {
        	setVisible(false);
        	new Help();
        }
        if(str.equals("quit"))
        {
        	setVisible(false);
        	new Exit();
        }  
    }
	
    public static void main(String args[])
    {
		new Main();
	}
}