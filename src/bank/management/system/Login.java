package bank.management.system;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login()
    {
        //We have to set the title for the frame.
        setTitle("AUTOMATED TELLER MACHINE");

        //defines dimensions of the frame.
        setSize(800, 480);

        //by default the frame is hidden from user's visibility.
        setVisible(true);
        //now we can see the frame.

        //by default the frame will start from the top left.
        //so we have to set the location of the frame.
        setLocation(350, 200);

        //Now we have to add image to our frame
        //ClassLoader.getSystemResource() is used to pick image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));

        //now we have to place the image on the frame, we cannot directly place a icon on frame.
        //JLabel label = new JLabel(i1);
        //add(label);

        //we want to change the size of the image
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);

        //we cannot directly label the image, need to convert image to image icon
        ImageIcon i3 = new ImageIcon(i2);

        JLabel label = new JLabel(i3);
        //we have to change the location of the image.
        label.setBounds(40, 10, 100, 100);
        //but still we will face problem because we have layouts which are default.
        setLayout(null);
        add(label);

        //we want to change the color of the frame.
        getContentPane().setBackground(Color.WHITE);

        //now we want to add some texts in the frame.
        JLabel text = new JLabel("Welcome to ATM");
        //set the bounds of the text as we had change the layout to null
        text.setBounds(200, 40, 400, 40);

        //we want to change the font of the text.
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);

        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Osward",Font.BOLD, 28));
        cardNo.setBounds(120, 150, 400, 40);
        add(cardNo);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD, 28));
        pin.setBounds(120, 230, 400, 40);
        add(pin);

        //now we want to add


    }

    public static void main(String[] args) {
        new Login();

    }
}
