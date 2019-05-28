package com.auribises.view;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

import com.auribises.model.Customer;


public class AddCustomerGUI implements ActionListener{
	
	//Frame
	// GUI Components
	JFrame fr; // Reference Variable
	JLabel lblTitle, lblName, lblPhone, lblEmail;
	JTextField txtName, txtPhone, txtEmail;
	JButton btn;
	JPanel pnlTitle, pnlName, pnlPhone, pnlEmail, pnlButton, pnlAll;
	
	JRadioButton rbMale;
	JRadioButton rbFeMale;
	
	JScrollBar scroll;
		
	public AddCustomerGUI(){
		//fr = new JFrame("Add Customer");
		fr = new JFrame();
		fr.setTitle("Add Customer");
		
		lblTitle = new JLabel("Add Customer Details:");
		
		lblName = new JLabel();
		lblName.setText("Enter Customer Name");
		
		lblPhone = new JLabel("Enter Customer Phone");
		lblEmail = new JLabel("Enter Customer Email");
		
		txtName = new JTextField(16);
		txtPhone = new JTextField(16);
		txtEmail = new JTextField(16);
		
		btn = new JButton("Submit");
		
		//ClickHandler handler = new ClickHandler();
		//btn.addActionListener(handler);
		
		btn.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlPhone = new JPanel();
		pnlEmail = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
	}
	
	public void showGUI(){
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlPhone.add(lblPhone);
		pnlPhone.add(txtPhone);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlButton.add(btn);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlPhone);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		
		
		fr.setSize(400, 400);
		fr.setVisible(true);
		
	}
	

	/*class ClickHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) { // event handler
			System.out.println(">> Button Clicked");
		}
		
	}*/


	@Override
	public void actionPerformed(ActionEvent e) {
		Date date = new Date();
		
		
		Customer customer = new Customer();
		customer.name = txtName.getText();
		customer.phone = txtPhone.getText();
		customer.email = txtEmail.getText();
		
		System.out.println(">> Button Clicked at "+date);
		System.out.println(customer);
		
		try {
			// 1. Load The Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
			
			// 2. Create the Connection with Database
			String url = "jdbc:mysql://localhost/auridb";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created");
			
			// 4. Execute SQL Statement
			String sql = "insert into Customer values(null, ?, ?, ?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, customer.name);
			stmt.setString(2, customer.phone);
			stmt.setString(3, customer.email);
		
			
			int i = stmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> 4. SQL Statement Executed");
			}else{
				System.out.println(">> 4. SQL Statement Failed");
			}
			
			con.close();
			
		}catch(Exception exc ){
			System.out.println("Some Excetion: "+exc);
		}
	}
	
}


