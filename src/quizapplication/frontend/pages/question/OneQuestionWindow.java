
package quizapplication.frontend.pages.question;

import javax.swing.*;
import quizapplication.backend.models.Question;


public class OneQuestionWindow {
    JFrame frame;
    JLabel titleLabel;
    JButton correctBtn, wrongBtn;
    JPanel panel;
    Question oneQuestion;
    public OneQuestionWindow(Question oneQuestion) {
        this.oneQuestion = oneQuestion;
    }
    public void open(){
        
        frame = new JFrame(oneQuestion.title+" Window");
        
        titleLabel = new JLabel(oneQuestion.title);
        panel.add(titleLabel);
        
        correctBtn = new JButton(oneQuestion.correctAnswer);
        panel.add(correctBtn);
        
        wrongBtn = new JButton(oneQuestion.wrongAnswer);
        panel.add(wrongBtn);
        
        frame.add(panel);
        frame.setSize(1000,1000);
        frame.setLocation(200,100);
        frame.setVisible(true);
        
        
    }

    public void close(){
        frame.setVisible(false);
    }
}
