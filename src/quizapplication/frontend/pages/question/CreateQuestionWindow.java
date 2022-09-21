
package quizapplication.frontend.pages.question;

import java.awt.Color;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;
import quizapplication.frontend.components.functional.CreateQuestionListener;
import quizapplication.frontend.constants.Theme;
public class CreateQuestionWindow {
    JFrame frame;
    JPanel panel;
    JLabel questionLabel;
    JLabel rightAnswerLabel;
    JLabel wrongAnswerLabel;
    JTextField questionTextField;
    JTextField rightAnswerTextField;
    JTextField wrongAnswerTextField;
    JButton createButton;
    public void open(int userId){
          
        frame = new JFrame("Create a Question");
        panel = new JPanel();
          
        questionTextField = new JTextField(20);
        questionLabel = new JLabel("Enter your question: ");

        
        rightAnswerTextField = new JTextField(20);
        rightAnswerLabel = new JLabel("Enter the right answer: ");

        
        wrongAnswerTextField = new JTextField(20);
        wrongAnswerLabel = new JLabel("Enter the wrong answer: ");

        createButton = new JButton("Create Question");
        createButton.addActionListener(new CreateQuestionListener(this, 
                                                        questionTextField,
                                                        rightAnswerTextField,
                                                        wrongAnswerTextField,
                                                        userId));
        
        panel.add(questionLabel);
        panel.add(questionTextField);
        
        panel.add(rightAnswerLabel);
        panel.add(rightAnswerTextField);
        
        panel.add(wrongAnswerLabel);
        panel.add(wrongAnswerTextField);
        
        panel.add(createButton);

        Theme.layout(frame, panel);
        
        frame.setVisible(true);
    }
    
    public void close(){
        frame.setVisible(false);
    }
    
}
