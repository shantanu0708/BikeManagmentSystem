package com.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Bikesreport extends JFrame
{
	Connection con;
	Statement st;
	ResultSet rs;
	String head[] = {"mno","mname","color","qty","prize"};
	String arr[][] = new String[50][50];
	public Bikesreport()
	{
		super("Bikes Report");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RR","root","root");
			st = con.createStatement();
			rs = st.executeQuery("select * from bikes");
			int i = 0;
			while(rs.next())
			{
				arr[i][0] = rs.getString("mno");
				arr[i][1] = rs.getString("mname");
				arr[i][2] = rs.getString("color");
				arr[i][3] = rs.getString("qty");
				arr[i][4] = rs.getString("prize");
				i++;
			}
			JTable jt = new JTable(arr,head);
			JScrollPane pane = new JScrollPane(jt);
			getContentPane().add(pane);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		setSize(800,800);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Bikesreport();
	}
}