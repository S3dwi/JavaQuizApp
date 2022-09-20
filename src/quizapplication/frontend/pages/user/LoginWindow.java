package quizapplication.frontend.pages.user;


import java.awt.Color;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;

public class LoginWindow {
    JFrame frame;
    
    public void open() {
        frame = new JFrame("Login Window");
        MenuBar.create(frame);
        frame.setLocation(200, 100);
        JTextField usernameTextField = new JTextField(12);
        JLabel usernameLabel = new JLabel("Enter username: ");
        
        JPanel panel1 = new JPanel();
        panel1.add(usernameLabel);
        panel1.add(usernameTextField);
        
        frame.add(panel1);
        frame.setSize(1000, 1000);
        
        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        panel1.add(button);
        
        frame.setLocation(200, 100);
        panel1.setBackground(Color.MAGENTA);
        frame.setVisible(true);
        
    }
    
    public void close(){
        frame.setVisible(false);
    }
}
