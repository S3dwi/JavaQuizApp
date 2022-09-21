/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication.frontend.components.functional;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import quizapplication.backend.models.Question;
import quizapplication.frontend.pages.HomeWindow;
import quizapplication.frontend.pages.question.AllQuestionsWindow;
import quizapplication.frontend.pages.question.OneQuestionWindow;

/**
 *
 * @author anmar
 */
public class OneQuestionListener implements ActionListener {
    AllQuestionsWindow allQuestionsWindow;
    Question oneQuestion;
    
    public OneQuestionListener(AllQuestionsWindow allQuestionsWindow, Question oneQuestion) {
        this.allQuestionsWindow = allQuestionsWindow;
        this.oneQuestion = oneQuestion;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
       allQuestionsWindow.close();
       
       OneQuestionWindow oneQuestionWindow = new OneQuestionWindow();
       oneQuestionWindow.open(oneQuestion);
    }  
}
