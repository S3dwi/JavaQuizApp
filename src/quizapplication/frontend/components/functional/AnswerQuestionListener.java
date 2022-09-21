/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication.frontend.components.functional;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author anmar
 */
public class AnswerQuestionListener implements ActionListener{
    boolean isCorrect;
    JFrame frame;
    public AnswerQuestionListener(JFrame frame, boolean isCorrect) {
        this.isCorrect = isCorrect;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isCorrect){
            JOptionPane.showMessageDialog(frame, "Correct Answer!");
        }else{
            JOptionPane.showMessageDialog(frame, "WRONG ANSWER!");
            
        }
    }
    
    
}
