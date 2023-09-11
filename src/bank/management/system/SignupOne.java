package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignupOne extends JFrame{
    SignupOne()
    {
        //we need to generate random number for the form.
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L + 1000L));
        getContentPane().setBackground(Color.WHITE);

        JLabel formNo = new JLabel("APPLICATION FORM NO. "+random);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 10);
        JLabel head = new JLabel("Page 2: Additional Details");
        setLayout(null);
        head.setFont(new Font("Oswards", Font.BOLD, 28));
        add(head);

    }
    public static void main(String[] args) {

        new SignupOne();

    }
}
