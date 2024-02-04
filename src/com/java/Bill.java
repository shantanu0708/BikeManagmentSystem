package com.java;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Bill extends Frame implements ActionListener,ItemListener
{
	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement ps;
	Font f1;
	Choice c;
	String acname,amname;
	Button b1,b2,b3,b4,b5,b6;
	TextField t1,t2,t3,t4,t5,t6;
	int k,abno,aprize,aqty,astock;
	Label l1,l2,l3,l4,l5,l6,l8,l9,l10,l11,l12;
	public Bill()
	{
		super("bill  Form");
		f1 = new Font("Arial",Font.BOLD,18);
		setFont(f1);
		setBackground(Color.orange);
		setForeground(Color.black);
		
		setBounds(300,5,800,700);
		setLayout(null);
		setVisible(true);
		
		c = new Choice();
		l1 = new Label("Bill No"); 
		l2 = new Label("Enter Bill No");
		l3 = new Label("Enter Customer Name");
		l4 = new Label("Enter Model Name");
		l5 = new Label("Enter Model Stock");
		l6 = new Label("Enter Model Prize");
		l8 = new Label("Bill Details Form");
		l9 = new Label("_____________________");
		l11 = new Label("Today's :-");
		l12 = new Label("Enter Model quantity");
		
		t1 = new TextField();
		t2 = new TextField();
	    t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		t6 = new TextField();
		
		b1 = new Button("Save");
		b2 = new Button("Update");
		b3 = new Button("Delete");
		b4 = new Button("Clear");
		b5 = new Button("Exit");
		b6 = new Button("Total");
		
		l1.setBounds(80,180,250,30);
		l2.setBounds(80,230,250,30);
		l3.setBounds(80,280,250,30);
		l4.setBounds(80,330,250,30);
		l5.setBounds(80,380,200,30);
		l6.setBounds(80,430,180,30);
		l8.setBounds(250,50,350,50);
		l9.setBounds(250,64,280,50);
		l11.setBounds(595,40,85,50);
		l12.setBounds(80,480,200,30);
		
		l8.setForeground(new Color(255, 00, 10));
		l8.setFont(new Font("Comic Sans MS",Font.ITALIC ,28));
		l9.setForeground(new Color(255, 00, 10));
		l9.setFont(new Font("Comic Sans MS",Font.ITALIC ,25));
		
		c.setBounds(340,180,200,30);
		t1.setBounds(340,230,200,30);
		t2.setBounds(340,280,200,30);
		t3.setBounds(340,330,200,30);
		t4.setBounds(340,380,200,30);
	    t5.setBounds(340,430,200,30);
	    t6.setBounds(340,480,200,30);
		
		b1.setBounds(80,550,80,50);
		b1.setBackground(Color.white);
		b2.setBounds(200,550,80,50);
		b2.setBackground(Color.white);
		b3.setBounds(320,550,80,50);
		b3.setBackground(Color.white);
		b4.setBounds(440,550,80,50);
		b4.setBackground(Color.white);
	    b5.setBounds(560,550,80,50);
		b5.setBackground(Color.white);
		b6.setBounds(660,550,80,50);
		b6.setBackground(Color.white);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l8);
        add(l9);
        add(l11);
        add(l12);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(c);
		add(t5);
		add(t6);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		c.addItemListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		String strdate;
	    GregorianCalendar cal;
	    cal = new GregorianCalendar();
	    strdate = cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+(cal.get(Calendar.YEAR));
	    l10 = new Label(strdate);
	    add(l10);
	    l10.setBounds(690,40,90,50);
	    try
        {	
	   		Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RR","root","root");
			st = con.createStatement();
			rs = st.executeQuery("select * from bill");
			while(rs.next())
			{
				c.add(rs.getString("bno"));
			}
			con.close();
	    }
	    catch(Exception obj)
	    {
	    	System.out.println(obj);
	    }
	}
	
	public void itemStateChanged(ItemEvent e)
	{
      	String str = c.getSelectedItem();
        int n = Integer.parseInt(str);
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RR","root","root");
			st = con.createStatement();
			rs = st.executeQuery("select * from bill where bno="+n);
    		rs.next();
    		t1.setText(rs.getString("bno"));
    		t2.setText(rs.getString("cname"));
			t3.setText(rs.getString("mname"));
			t4.setText(rs.getString("stock"));
			t5.setText(rs.getString("prize"));
			t6.setText(rs.getString(""));
		}
		catch(Exception en)
		{
			System.out.println(en);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("Exit"))
		{
			setVisible(false);
			new Main();
		}
		if(str.equals("Clear"))
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
			t5.setText(" ");
			t6.setText(" ");
		}
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RR","root","root");
			st = con.createStatement();
			if(str.equals("Save"))
			{
				abno = Integer.parseInt(t1.getText());
	            acname = t2.getText();
	            amname = t3.getText();
	            astock = Integer.parseInt(t4.getText());
	            aprize = Integer.parseInt(t5.getText());
				String str1 = "insert into bill values( "+abno+",'"+acname+"','"+amname+"',"+astock+","+aprize+")";
				int k = st.executeUpdate(str1);
				if(k>0)
				{
					JOptionPane.showMessageDialog(null,"Record is added");
			    }
				con.close();
			}
			if(str.equals("Update"))
			{
				abno = Integer.parseInt(t1.getText());
	            acname = t2.getText();
	            amname = t3.getText();
	            astock = Integer.parseInt(t4.getText());
	            aprize = Integer.parseInt(t5.getText());
				String str2 = "Update bill set cname='"+acname+"',mname='"+amname+"',stock="+astock+",prize="+aprize+" where bno="+abno+"";
				int k = st.executeUpdate(str2);
				if(k>0)
				{
					JOptionPane.showMessageDialog(null,"Record Updated Successfully ");
				}
				con.close();
			}
			if(str.equals("Delete"))
			{
				abno = Integer.parseInt(t1.getText());
				String str3 = "Delete * from bill where bno="+abno+"";
				int k = st.executeUpdate(str3);
				if(k>0)
				{
				   JOptionPane.showMessageDialog(null,"Record Deleted Successfully ");
				}
				con.close();
			}
			if(str.equals("Total"))
			{
				aprize = Integer.parseInt(t5.getText());
				aqty = Integer.parseInt(t6.getText());
				int total = aprize*aqty;
				JOptionPane.showMessageDialog(null,"Total="+total);
				con.close();
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}	
	}
	public static void main(String args[])
	{
		new Bill();
	}
}
				