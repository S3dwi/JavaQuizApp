/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication.frontend.components.functional;

import java.awt.event.*;
import quizapplication.frontend.pages.HomeWindow;
import quizapplication.frontend.pages.question.AllQuestionsWindow;

/**
 *
 * @author anmar
 */
public class AllQuestionsListener implements ActionListener {
    HomeWindow homeWindow;
    public AllQuestionsListener(HomeWindow homeWindow) {
        this.homeWindow = homeWindow;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
       homeWindow.close();
       
       AllQuestionsWindow allQuestionsWindow = new AllQuestionsWindow();
       allQuestionsWindow.open(homeWindow.userId);
    }  
}
