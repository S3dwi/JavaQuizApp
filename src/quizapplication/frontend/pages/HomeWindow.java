package quizapplication.frontend.pages;

import java.awt.Color;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;
import quizapplication.frontend.components.functional.AllQuestionsListener;
import quizapplication.frontend.components.functional.CreateQuestionListener;
import quizapplication.frontend.constants.Theme;

public class HomeWindow {
    JFrame frame;
    JPanel panel;
    JButton createButton;
    JButton showAllButton;
    public int userId;
    
    public void open(int userId){
        this.userId = userId;
        MenuBar.userId = this.userId;
        
        frame = new JFrame("Home Window");
        panel = new JPanel();
        
        createButton = new JButton("Create a question");
        createButton.addActionListener(new CreateQuestionListener(this));
        
        showAllButton = new JButton("Show all questions");
        showAllButton.addActionListener(new AllQuestionsListener(this));
        
        panel.add(createButton);
        panel.add(showAllButton);
        
        Theme.layout(frame, panel);
        
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
