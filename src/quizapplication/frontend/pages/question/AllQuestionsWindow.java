
package quizapplication.frontend.pages.question;

import java.awt.Color;
import javax.swing.*;
import quizapplication.backend.models.Question;
import quizapplication.frontend.components.MenuBar;

public class AllQuestionsWindow {
    JButton btn1,btn2,btn3,btn4,btn5;
    JFrame frame;
    JPanel panel;
    public void open(){
        frame = new JFrame("All Questions Window");
        MenuBar.create(frame);
        frame.setBounds(0, 0, 1000, 1000);
        panel = new JPanel();
        
        Question questions[] = {
            new Question("Title1","a","b"), 
            new Question("Title2","a","b"), 
            new Question("Title3","a","b")
        };  
        for(Question q:questions){
            btn1 = new JButton(q.title);
            panel.add(btn1);
        }

        

        
        frame.add(panel);
        frame.setLocation(200, 100);
        panel.setBackground(Color.RED);
        frame.setVisible(true);
        
    }
}