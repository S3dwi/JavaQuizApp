
package quizapplication.frontend.pages.user;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;
public class RegisterWindow {
    JFrame frame;
     public void open() {
        frame = new JFrame("Register Window");
        MenuBar.create(frame);
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        
        frame.setLocation(200, 100);
        
        JLabel usernameLabel = new JLabel("Enter username: ");
        JTextField usernameTextField = new JTextField(12);
        
        ImageIcon image = new ImageIcon("C:\\Users\\PCD\\Documents\\NetBeansProjects\\JavaQuizzApplication\\src\\quizapplication\\frontend\\assets\\register.png");
        JLabel label = new JLabel(image);        
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton button = new JButton("Register");
        
        
        panel1.add(label);
        panel1.add(usernameLabel);
        panel1.add(usernameTextField);
        panel1.add(button);
        panel1.setBackground(Color.CYAN);
        
        frame.add(panel1);
        frame.setSize(1000, 1000);
        frame.setLocation(200, 100);
        frame.setVisible(true);
        
    }
    
    public void close(){
        frame.setVisible(false);
    }
}
