/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication.frontend.components.functional;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import quizapplication.frontend.pages.HomeWindow;
import quizapplication.frontend.pages.question.AllQuestionsWindow;
import quizapplication.frontend.pages.question.CreateQuestionWindow;
import quizapplication.backend.models.Question;


/**
 *
 * @author anmar
 */
public class CreateQuestionListener implements ActionListener {
    HomeWindow homeWindow;
    CreateQuestionWindow createQuestionWindow;
    JTextField questionTextField;
    JTextField rightAnswerTextField;
    JTextField wrongAnswerTextField;
    public int userId;
    boolean goTo;
    public CreateQuestionListener(HomeWindow homeWindow) {
        this.goTo = true;
        this.homeWindow = homeWindow;
    }

    public CreateQuestionListener(CreateQuestionWindow createQuestionWindow, 
                                  JTextField questionTextField,
                                  JTextField rightAnswerTextField,
                                  JTextField wrongAnswerTextField,
                                  int userId
    ) {
        this.goTo = false;
        this.createQuestionWindow = createQuestionWindow;
        this.questionTextField = questionTextField;
        this.rightAnswerTextField = rightAnswerTextField;
        this.wrongAnswerTextField = wrongAnswerTextField;
        this.userId = userId;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
       if(goTo){ //if only open create page
        homeWindow.close();

        CreateQuestionWindow newCreateQuestionWindow = new CreateQuestionWindow();
        newCreateQuestionWindow.open(homeWindow.userId);           
       }else{ //if create question
           System.out.println(this.userId);
           Question newQuestion = new Question(
                   questionTextField.getText(),
                   rightAnswerTextField.getText(),
                   wrongAnswerTextField.getText()
           );
           newQuestion.userId = this.userId;
           newQuestion.create();
           createQuestionWindow.close();
           HomeWindow newHomeWindow = new HomeWindow();
           newHomeWindow.open(this.userId); 
       }
    }  
}
