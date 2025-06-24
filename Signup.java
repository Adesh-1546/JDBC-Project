package com.BankManagementSys;

import java.awt.*; 
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.util.Random;

import java.awt.event.*;


public class Signup extends JFrame implements ActionListener{
	
	JTextField namebox,fatherbox,dob,emailbox,addressbox,citybox;
	JButton next;
	JRadioButton male,female,others,married,Notmarried;
	JDateChooser datechose;
	long random;
	
	
	public Signup() {
		setLayout(null);
		
		//random number
		Random ran = new Random();
		random =Math.abs((ran.nextLong() % 9000L + 1000L));
		
		//title
		JLabel formno = new JLabel ("APPLICATION FORM NO. " + random);
		formno.setFont(new Font ("Raleway",Font.BOLD,33));
		formno.setBounds(140,45,600,40);
		add(formno);
		
		//personal detail
		JLabel personaldetail = new JLabel ("Page 1 : Personal Details");
		personaldetail.setFont(new Font ("Raleway",Font.BOLD,25));
		personaldetail.setBounds(250,95,600,38);
		add(personaldetail);
		
		//name
		JLabel name = new JLabel ("Name : ");
		name.setFont(new Font ("Raleway",Font.BOLD,20));
		name.setBounds(110,175,100,25);
		add(name);
		//box
		namebox = new JTextField();
		namebox.setBounds(270, 174, 370, 30);      //(left,top,width,height)
		namebox.setFont(new Font("Arial", Font.BOLD, 14));
		add(namebox);
		
		//father name
		JLabel fathername = new JLabel ("Father's name : ");
		fathername.setFont(new Font ("Raleway",Font.BOLD,20));
		fathername.setBounds(110,220,400,25);
		add(fathername);
		//father box
		fatherbox = new JTextField();
		fatherbox.setBounds(270, 220, 370, 30);      //(left,top,width,height)
		fatherbox.setFont(new Font("Arial", Font.BOLD, 14));
		add(fatherbox);
		
		//dob
		JLabel dob = new JLabel ("Date of Birth : ");
		dob.setFont(new Font ("Raleway",Font.BOLD,20));
		dob.setBounds(110,265,400,25);
		add(dob);
		
		datechose = new JDateChooser();
		datechose.setBounds(270, 265, 370, 30);
		add(datechose);
		
		
		//Gender
		JLabel gender = new JLabel ("Gender : ");
		gender.setFont(new Font ("Raleway",Font.BOLD,20));
		gender.setBounds(110,308,400,25);
		add(gender);
		
		//radio button
		male = new JRadioButton("Male");
		male.setBounds(270, 308, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(350, 308, 80, 30);
		female.setBackground(Color.WHITE);
		add(female);
		
		others = new JRadioButton("Other");
		others.setBounds(440, 308, 60, 30);
		others.setBackground(Color.WHITE);
		add(others);
		
		//group buttons
		ButtonGroup genstatus = new ButtonGroup();
		genstatus.add(male);
		genstatus.add(female);
		genstatus.add(others);
		
		
		
		//email
		JLabel email = new JLabel ("Email : ");
		email.setFont(new Font ("Raleway",Font.BOLD,20));
		email.setBounds(110,350,400,25);
		add(email);
		//email box
		emailbox = new JTextField();
		emailbox.setBounds(270, 348, 370, 30);      //(left,top,width,height)
		emailbox.setFont(new Font("Arial", Font.BOLD, 14));
		add(emailbox);
		
		//maritial
		JLabel maritial = new JLabel ("Maritial Status : ");
		maritial.setFont(new Font ("Raleway",Font.BOLD,20));
		maritial.setBounds(110,390,400,25);
		add(maritial);
		
		//radio buttons
		married = new JRadioButton("Married");
		married.setBounds(270, 390, 100, 30);
		married.setBackground(Color.WHITE);
		add(married);
		
		Notmarried = new JRadioButton("UnMarried");
		Notmarried.setBounds(370, 390, 100, 30);
		Notmarried.setBackground(Color.WHITE);
		add(Notmarried);
		
		//group buttons
		ButtonGroup marstatus = new ButtonGroup();
		marstatus.add(married);
		marstatus.add(Notmarried);
		
		//address
		JLabel address = new JLabel ("Address : ");
		address.setFont(new Font ("Raleway",Font.BOLD,20));
		address.setBounds(110,430,400,25);
		add(address);
		//address box
		addressbox = new JTextField();
		addressbox.setBounds(270, 430, 370, 30);      //(left,top,width,height)
		addressbox.setFont(new Font("Arial", Font.BOLD, 14));
		add(addressbox);
		
		//city
		JLabel city = new JLabel ("City : ");
		city.setFont(new Font ("Raleway",Font.BOLD,20));
		city.setBounds(110,475,400,25);
		add(city);
		//city box
		citybox = new JTextField();
		citybox.setBounds(270, 475, 370, 30);      //(left,top,width,height)
		citybox.setFont(new Font("Arial", Font.BOLD, 14));
		add(citybox);
		
		
		//button
		next = new JButton("NEXT");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD,14));
		next.setBounds(560, 550, 80, 30);
		next.addActionListener(this);
		add(next);
		
		
		
		
		//set background white
		getContentPane().setBackground(Color.WHITE);
		
		//set Size, visibility and location
		setSize(780,700);
		setVisible(true);
		setLocation(350,60);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String formno =" " + random;
		String name = namebox.getText();  //set text
		String fname = fatherbox.getText();  //set text
		String dob = ((JTextField)datechose.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		}else if (female.isSelected()) {
			gender = "Female";
		}else {
			gender = "Other";
		}
		String email = emailbox.getText();
		String maritial = null;
		if (married.isSelected()) {
			maritial = "Married";
		}else if (Notmarried.isSelected()) {
			maritial = "Unmarried";
		}
		String address = addressbox.getText();
		String city = citybox.getText();
		
		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}else {
				Connectivity con = new Connectivity();
				String query = "insert into signup(Form_no,Name,Father_name,DOB,Gender,email,Maritial,Address,City) values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritial+"','"+address+"','"+city+"')";
				con.s.executeUpdate(query);
				
				setVisible(false); // close current form
				new SignupTwo(formno).setVisible(true);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		new Signup();
	}

}
