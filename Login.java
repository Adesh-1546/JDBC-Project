package com.BankManagementSys;

import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton clear, signup, login;
	JTextField cardText;
	JPasswordField pinText;
	
	public Login() {
		//for title
		setTitle("Automatic Teller Machine");
		
		//layout null
		setLayout(null); 
		
		//for importing images
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);    // for seeing on desktop
		
		
		
		// now icon size is changed .. now for location
		label.setBounds(120, 12, 100, 100);      //(left,top,width,height)
		add(label);
		
		
		
		//background color
		getContentPane().setBackground(Color.WHITE);		
		//for WELCOME TO ATM label
		JLabel text = new JLabel ("Welcome to ATM");
		text.setBounds(250,45,400,40);                   //(left,top,width,height)              
		text.setFont(new Font("Osward",Font.BOLD, 38));
		add(text);
		
		JLabel cardno = new JLabel ("Card Number :");
		cardno.setBounds(100,150,300,40);               //(left,top,width,height)
		cardno.setFont(new Font("Osward",Font.BOLD, 25));
		add(cardno);
		
		//for box in front of card-number and pin
		 cardText = new JTextField();
		cardText.setBounds(320, 150, 250, 40);      //(left,top,width,height)
		cardText.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardText);
		
		JLabel pin = new JLabel ("Password : ");
		pin.setBounds(110,220,300,40);        //(left,top,width,height)
		pin.setFont(new Font("Osward",Font.BOLD, 25));
		add(pin);
		
		//for box in front of card-number and pin
		 pinText = new JPasswordField();
		pinText.setBounds(320, 220, 250, 40);  //(left,top,width,height)
		pinText.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinText);
		
		
		
		//BUTTONS
		clear = new JButton("CLEAR");
		clear.setBounds(320, 310, 100, 30);
		clear.setBackground(Color.BLACK);
		clear.setBackground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		 signup = new JButton("SIGN UP");
		signup.setBounds(470, 310, 100, 30);
		signup.setBackground(Color.BLACK);
		signup.setBackground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		 login = new JButton("LOGIN");
		login.setBounds(320, 360, 250, 30);
		login.setBackground(Color.BLACK);
		login.setBackground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		
		// set size, visibility and location of screen
		setSize(780,480);
		setVisible(true);
		setLocation(350,200);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == clear) {
			cardText.setText("");
			pinText.setText("");
			
		}else if (ae.getSource() == signup) {
			setVisible(false); // hide login page
		    new Signup(); 
			
		}else if (ae.getSource() == login){
			
		}
		
	}
	
	public static void main(String[] args) {
		new Login();
	}

}