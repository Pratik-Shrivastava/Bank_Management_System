package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
//we have to import package for calendar class.
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;


    SignupOne()
    {
        //we need to generate random number for the form.
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L + 1000L));
        getContentPane().setBackground(Color.WHITE);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setSize(800, 800);
        setVisible(true);
        setLocation(350, 10);
        setLayout(null);

        JLabel formNo = new JLabel("APPLICATION FORM NO. "+random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);


        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 150, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 150, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 150, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 100, 30);
        male.setBackground(Color.WHITE);
        male.setForeground(Color.BLACK);
        male.setFont(new Font("Raleway", Font.BOLD, 18));
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(420, 290, 100, 30);
        female.setForeground(Color.BLACK);
        female.setBackground(Color.WHITE);
        female.setFont(new Font("Raleway", Font.BOLD, 18));
        add(female);

        //Now we want that either of the two gender is selected.
        //This can be done using the button class.
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 150, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 150, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        married.setForeground(Color.BLACK);
        married.setFont(new Font("Raleway", Font.BOLD, 18));
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(420, 390, 120, 30);
        unmarried.setBackground(Color.WHITE);
        unmarried.setForeground(Color.BLACK);
        unmarried.setFont(new Font("Raleway", Font.BOLD, 18));
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(560, 390, 100, 30);
        other.setBackground(Color.WHITE);
        other.setForeground(Color.BLACK);
        other.setFont(new Font("Raleway", Font.BOLD, 18));
        add(other);

        //Now we want that either of the two gender is selected.
        //This can be done using the button class.
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 150, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 150, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 150, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 150, 30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);

        //now we have to add next button
        JButton next = new JButton("Next");
        next.setBounds(620, 660, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 18));
        next.addActionListener(this);
        add(next);










    }
    public void actionPerformed(ActionEvent ae)
    {
        String formno = String.valueOf(random);
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = dateChooser.getDateEditor().getUiComponent().getToolTipText();
        String gender = null;
        if(male.isSelected())
        {
            gender="Male";
        }
        else
        {
            gender="Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected())
        {
            marital = "Married";
        }
        else if(unmarried.isSelected())
        {
            marital = "Unmarried";
        }
        else
        {
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();

        //Now we will create a hit in database.
        try
        {
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);

            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
       // "Stirng"+variable+"String"

    }
    public static void main(String[] args) {

        new SignupOne();

    }
}
