
package quizapplication.frontend.pages.question;

import java.awt.Color;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;
public class CreateQuestionWindow {
     JFrame frame;
    public void open(){
          
        frame = new JFrame("Create a Question");
        MenuBar.create(frame);
          
        JTextField userTextField = new JTextField(20);
        JLabel userLabel = new JLabel("Enter your question: ");

        
        JTextField rightAnswerTextField = new JTextField(20);
        JLabel rightAnswerLabel = new JLabel("Enter the right answer: ");

        
        JTextField wrongAnswerTextField = new JTextField(20);
        JLabel wrongAnswerLabel = new JLabel("Enter the wrong answer: ");

     
        
        
        JPanel panel1 = new JPanel();
        panel1.add(userLabel);
        panel1.add(userTextField);
        panel1.add(rightAnswerTextField);
        panel1.add(rightAnswerLabel);
        panel1.add(wrongAnswerTextField);
        panel1.add(wrongAnswerLabel);
        
       
      
        panel1.setBackground(Color.YELLOW);
        frame.setForeground(Color.WHITE);
        
        frame.add(panel1);
        frame.setSize(1000, 1000);
        
        frame.setLocation(200,100);
        frame.setVisible(true);



    }
    
    public void close(){
        frame.setVisible(false);
    }
    
}
