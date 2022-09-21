
package quizapplication.frontend.pages.user;

import java.awt.Color;
import java.awt.Component;
import javax.swing.*;
import quizapplication.frontend.assets.ImagesPaths;
import quizapplication.frontend.components.MenuBar;
import quizapplication.frontend.components.functional.RegisterListener;
import quizapplication.frontend.constants.Theme;

public class RegisterWindow {
    JFrame frame;
    JPanel panel;
    JLabel usernameLabel;
    JLabel imageLabel;
    JLabel loginLabel;
    JButton registerButton;
    JTextField usernameTextField;
    ImageIcon image;
    
     public void open() {
        frame = new JFrame("Register Window");
        
        panel = new JPanel();        
        
        usernameLabel = new JLabel("Enter username: ");
        usernameTextField = new JTextField(12);
        
        image = new ImageIcon(ImagesPaths.REGISTER_IMAGE);
        imageLabel = new JLabel(image);
        
        registerButton = new JButton("Register");
        registerButton.addActionListener(new RegisterListener(this, usernameTextField));
        
        loginLabel = new JLabel("already have an account? go to menu");
        
        panel.add(imageLabel);
        
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        
        panel.add(registerButton);
        
        panel.add(loginLabel);
        
        Theme.layout(frame, panel);
        
        frame.setVisible(true);
        
    }
    
    public void close(){
        frame.setVisible(false);
    }
}
