
package quizapplication.frontend.pages.question;

import javax.swing.*;
import quizapplication.backend.models.Question;
import quizapplication.frontend.components.functional.AnswerQuestionListener;
import quizapplication.frontend.constants.Theme;


public class OneQuestionWindow {
    JFrame frame;
    JLabel titleLabel;
    JButton correctBtn, wrongBtn;
    JPanel panel;
    public void open(Question oneQuestion){
        frame = new JFrame(oneQuestion.title+" Window");
        panel = new JPanel();
        
        titleLabel = new JLabel("Question: "+oneQuestion.title);
        
        correctBtn = new JButton("1) "+oneQuestion.correctAnswer);
        correctBtn.addActionListener(new AnswerQuestionListener(this.frame, true));
        
        wrongBtn = new JButton("2) "+oneQuestion.wrongAnswer);
        correctBtn.addActionListener(new AnswerQuestionListener(this.frame, false));
        
        panel.add(titleLabel);
        
        panel.add(correctBtn);
        
        panel.add(wrongBtn);
        
        Theme.layout(frame, panel);
        
        frame.setVisible(true);
        
        
    }

    public void close(){
        frame.setVisible(false);
    }
}
