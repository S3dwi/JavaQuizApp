
package quizapplication.frontend.pages.question;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import quizapplication.backend.models.Question;
import quizapplication.frontend.components.MenuBar;
import quizapplication.frontend.components.functional.OneQuestionListener;
import quizapplication.frontend.constants.Theme;

public class AllQuestionsWindow {
    JButton questionButton;
    JFrame frame;
    JPanel panel;
    
    public void open(int userId){
        frame = new JFrame("All Questions Window");
        panel = new JPanel();
        
        Question questionObject = new Question();
        questionObject.userId = userId;
        
        ArrayList<Question> questions = questionObject.getAll();
        
        for(Question question: questions){
            questionButton = new JButton(question.title);
            questionButton.addActionListener(new OneQuestionListener(this, question));
         
            panel.add(questionButton);
        }
        
        Theme.layout(frame, panel);
        
        frame.setVisible(true);
        
    }
    public void close(){
        frame.setVisible(false);
    }
}