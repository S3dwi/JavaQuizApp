/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication.frontend.components.functional;

import java.awt.event.*;
import quizapplication.frontend.pages.HomeWindow;
import quizapplication.frontend.pages.question.AllQuestionsWindow;
import quizapplication.frontend.pages.question.CreateQuestionWindow;
import quizapplication.frontend.pages.user.LoginWindow;

/**
 *
 * @author anmar
 */
public class MenuListener implements ActionListener {
    int index;
    int userId;
    
    public MenuListener(int index, int userId) {
        this.index = index;
        this.userId = userId;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(index == 2){
            LoginWindow loginWindow = new LoginWindow();
            loginWindow.open();
        }
        if(index == 3){
            AllQuestionsWindow allQuestionsWindow = new AllQuestionsWindow();
            allQuestionsWindow.open(userId);
        }
        if(index == 4){
            CreateQuestionWindow createQuestionWindow = new CreateQuestionWindow();
            createQuestionWindow.open(userId);
        }
        if(index == 5){
            HomeWindow homeWindow = new HomeWindow();
            homeWindow.open(userId);
        }
    }
    
}
