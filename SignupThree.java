package com.BankManagementSys;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupThree extends JFrame implements ActionListener {

    JButton submit;
    JTextField depositbox;
    JComboBox<String> securityq;
    JTextField securityansbox;
    String formno;

    public SignupThree(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM -- PAGE 3");

        JLabel label = new JLabel("Page 3: Final Details");
        label.setFont(new Font("Raleway", Font.BOLD, 25));
        label.setBounds(250, 70, 400, 30);
        add(label);

        // Security question
        JLabel secq = new JLabel("Security Question:");
        secq.setFont(new Font("Raleway", Font.BOLD, 20));
        secq.setBounds(100, 150, 200, 30);
        add(secq);

        String[] questions = {"Your first pet?", "Mother's maiden name?", "Your nickname?", "Favourite color?"};
        securityq = new JComboBox<>(questions);
        securityq.setBounds(300, 150, 350, 30);
        securityq.setFont(new Font("Arial", Font.PLAIN, 14));
        add(securityq);

        // Security answer
        JLabel ans = new JLabel("Answer:");
        ans.setFont(new Font("Raleway", Font.BOLD, 20));
        ans.setBounds(100, 200, 200, 30);
        add(ans);

        securityansbox = new JTextField();
        securityansbox.setBounds(300, 200, 350, 30);
        add(securityansbox);

        // Deposit
        JLabel deposit = new JLabel("Initial Deposit:");
        deposit.setFont(new Font("Raleway", Font.BOLD, 20));
        deposit.setBounds(100, 250, 200, 30);
        add(deposit);

        depositbox = new JTextField();
        depositbox.setBounds(300, 250, 350, 30);
        add(depositbox);

        // Submit button
        submit = new JButton("SUBMIT");
        submit.setBounds(550, 350, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.addActionListener(this);
        add(submit);

        getContentPane().setBackground(Color.WHITE);

        setSize(780, 500);
        setLocation(350, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String secq = (String) securityq.getSelectedItem();
        String answer = securityansbox.getText();
        String deposit = depositbox.getText();

        try {
            if (answer.equals("") || deposit.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all details");
            } else {
                Connectivity con = new Connectivity();
                String query = "insert into signupthree values('" + formno + "', '" + secq + "', '" + answer + "', '" + deposit + "')";
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account created successfully!");
                setVisible(false);
                new Login().setVisible(true); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignupThree("1234");
    }
}
