package quizapplication.frontend.pages;

import java.awt.Color;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;

public class HomeWindow {
    JFrame frame;
    
    public void open() {
        frame = new JFrame("Home Window");
        MenuBar.create(frame);
        JButton createButton = new JButton("Create a question");
        JButton showAllButton = new JButton("Show all questions");
        
        JPanel panel1 = new JPanel();
        panel1.add(createButton);
        panel1.add(showAllButton);
        
        frame.add(panel1);
        
        frame.setSize(1000, 1000);
        frame.setLocation(200, 100);
        panel1.setBackground(Color.BLUE);
        
        frame.setVisible(true);
    }
    
    public void close(){
        frame.setVisible(false);
    }
}

// input -> output
// Textfield

// input -> output
// Buttons -> popup
