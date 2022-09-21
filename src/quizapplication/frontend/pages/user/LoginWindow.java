package quizapplication.frontend.pages.user;


import java.awt.Color;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;
import quizapplication.frontend.components.functional.LoginListener;
import quizapplication.frontend.constants.Theme;

public class LoginWindow {
    JFrame frame;
    JPanel panel;
    JLabel usernameLabel;
    JLabel imageLabel;
    JButton loginButton;
    JTextField usernameTextField;
    ImageIcon image;
    
    public void open() {
        frame = new JFrame("Login Window");
        panel = new JPanel();
        
        usernameTextField = new JTextField(12);
        usernameLabel = new JLabel("Enter username: ");
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginListener(this, usernameTextField));
        
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        
        panel.add(loginButton);
        
        Theme.layout(frame, panel);
        
        frame.setVisible(true);
        
    }
    
    public void close(){
        frame.setVisible(false);
    }
}
