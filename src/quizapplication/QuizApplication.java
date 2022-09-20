package quizapplication;

import quizapplication.backend.models.Question;
import quizapplication.frontend.pages.HomeWindow;
import quizapplication.frontend.pages.user.RegisterWindow;
import quizapplication.frontend.pages.user.LoginWindow;
import quizapplication.frontend.pages.question.CreateQuestionWindow;
import quizapplication.frontend.pages.question.AllQuestionsWindow;
import quizapplication.frontend.pages.question.OneQuestionWindow;
public class QuizApplication {

    public static void main(String[] args) {
        
        AllQuestionsWindow questionsWindow = new AllQuestionsWindow();
        questionsWindow.open();
        CreateQuestionWindow createQuestionWindow = new CreateQuestionWindow();
        createQuestionWindow.open();
        HomeWindow homeWindow = new HomeWindow();
        homeWindow.open();
        LoginWindow loginWindow = new LoginWindow();
        loginWindow.open();
        RegisterWindow registerWindow = new RegisterWindow();
        registerWindow.open();
            
    }
    
}
