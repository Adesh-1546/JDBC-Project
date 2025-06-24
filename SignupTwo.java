package com.BankManagementSys;

import java.awt.*; 
import javax.swing.*;



import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
	
	JTextField adharbox,panbox;
	JButton next;
	JRadioButton male,female,others,Baccount,Saccount;
	JComboBox religion,category,income,qualification,occupation;
	
	long random;
	String formno;
	
	
	public SignupTwo(String formno) {
		this.formno = formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM -- PAGE 2");
		
		
		//additional detail
		JLabel additionaldetail = new JLabel ("Page 2: Additional Details");
		additionaldetail.setFont(new Font ("Raleway",Font.BOLD,25));
		additionaldetail.setBounds(250,70,600,38);
		add(additionaldetail);
		
		//religion
		JLabel name = new JLabel ("Religion : ");
		name.setFont(new Font ("Raleway",Font.BOLD,20));
		name.setBounds(110,175,100,25);
		add(name);
		
		String valreligion[] = {"Hindu","Muslim","Sikh","Cristian","Other"};
		religion = new JComboBox(valreligion);
		religion.setFont(new Font("Arial", Font.BOLD, 14));
		religion.setBounds(270, 174, 370, 30); 
		religion.setBackground(Color.white);
		add(religion);
		
		
		
		//father name
		JLabel fathername = new JLabel ("Category : ");
		fathername.setFont(new Font ("Raleway",Font.BOLD,20));
		fathername.setBounds(110,220,400,25);
		add(fathername);
		
		
		String valcategory[] = {"Open","OBC","SC","ST","Other"}; 
		category = new JComboBox(valcategory);
		category.setFont(new Font("Arial", Font.BOLD, 14));
		category.setBounds(270, 220, 370, 30); 
		category.setBackground(Color.white);
		add(category);
		
		
		//Income
		JLabel dob = new JLabel ("Income : ");
		dob.setFont(new Font ("Raleway",Font.BOLD,20));
		dob.setBounds(110,265,400,25);
		add(dob);
		
	
		
		String valincome[] = {"null","<1,50,000","<2,50,000","<5,00,000", "Other"}; 
		income = new JComboBox(valincome);
		income.setFont(new Font("Arial", Font.BOLD, 14));
		income.setBounds(270, 265, 370, 30); 
		income.setBackground(Color.white);
		add(income);
		
		
		
		
		//Gender
		JLabel gender = new JLabel ("Qualification : ");
		gender.setFont(new Font ("Raleway",Font.BOLD,20));
		gender.setBounds(110,308,400,25);
		add(gender);
		
		String valqualification[] = {"Graduate","Pre-graduate","Post-graduation","Doctrate", "Others"}; 
		qualification = new JComboBox(valqualification);
		qualification.setFont(new Font("Arial", Font.BOLD, 14));
		qualification.setBounds(270, 308, 370, 30); 
		qualification.setBackground(Color.white);
		add(qualification);
		
		
		
		
		//email
		JLabel email = new JLabel ("Occupation : ");
		email.setFont(new Font ("Raleway",Font.BOLD,20));
		email.setBounds(110,350,400,25);
		add(email);
		
		String valOccupation[] = {"Student","Self-employed","Business","Service","Retired", "Other"}; 
		occupation = new JComboBox(valOccupation);
		occupation.setFont(new Font("Raleway", Font.BOLD, 14));
		occupation.setBounds(270, 350, 370, 30); 
		occupation.setBackground(Color.white);
		add(occupation);
		
		
		//Account Type
		JLabel AccType = new JLabel ("Account Type: ");
		AccType.setFont(new Font ("Raleway",Font.BOLD,20));
		AccType.setBounds(110,390,400,25);
		add(AccType);
		
		//radio buttons
		Baccount = new JRadioButton("Business Account");
		Baccount.setBounds(270, 390, 150, 30);
		Baccount.setBackground(Color.WHITE);
		add(Baccount);
		
		Saccount = new JRadioButton("Saving Account");
		Saccount.setBounds(420, 390, 300, 30);
		Saccount.setBackground(Color.WHITE);
		add(Saccount);
		
		//group buttons
		ButtonGroup marstatus = new ButtonGroup();
		marstatus.add(Baccount);
		marstatus.add(Saccount);
		
		//address
		JLabel address = new JLabel ("ADHAR number:");
		address.setFont(new Font ("Raleway",Font.BOLD,20));
		address.setBounds(110,430,400,25);
		add(address);
		//address box
		adharbox = new JTextField();
		adharbox.setBounds(270, 430, 370, 30);      //(left,top,width,height)
		adharbox.setFont(new Font("Arial", Font.BOLD, 14));
		add(adharbox);
		
		//city
		JLabel city = new JLabel ("PAN number:");
		city.setFont(new Font ("Raleway",Font.BOLD,20));
		city.setBounds(110,475,400,25);
		add(city);
		//city box
		panbox = new JTextField();
		panbox.setBounds(270, 475, 370, 30);      //(left,top,width,height)
		panbox.setFont(new Font("Arial", Font.BOLD, 14));
		add(panbox);
		
		
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
		String formno = this.formno;
		String Sreligion = (String)religion.getSelectedItem();  //set text
		String Scategory = (String)category.getSelectedItem();
		String Sincome = (String)income.getSelectedItem();
		String Squalification = (String)qualification.getSelectedItem();
		String Soccupation = (String)occupation.getSelectedItem();
		String Account = null;
		if(Baccount.isSelected()) {
			Account = "Business";
		}else if (Saccount.isSelected()) {
			Account = "Saving";
		}
		String pan = panbox.getText();
		String adhar = adharbox.getText();
		
	
		
		
		try {
			
				Connectivity con = new Connectivity();
				String query = "insert into signuptwo values('"+formno+"','"+Sreligion+"','"+Scategory+"','"+Sincome+"','"+Squalification+"','"+Soccupation+"','"+Account+"','"+pan+"','"+adhar+"')";
				con.s.executeUpdate(query);
			
			
			setVisible(false);
			new SignupThree(formno).setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		new SignupTwo("");
	}

}
