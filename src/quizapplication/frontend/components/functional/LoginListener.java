package quizapplication.frontend.components.functional;

import java.awt.event.*;
import javax.swing.JTextField;
import quizapplication.backend.models.User;
import quizapplication.frontend.pages.HomeWindow;
import quizapplication.frontend.pages.user.LoginWindow;

public class LoginListener implements ActionListener {
    JTextField usernameTextField;
    LoginWindow loginWindow;

    public LoginListener(LoginWindow loginWindow, JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
        this.loginWindow = loginWindow;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){       
       if(usernameTextField.getText().length() > 50) return;
       
       User user = new User(this.usernameTextField.getText());
       
       user = user.login();
       
       System.out.println(user.id + " " + user.username);
       
       loginWindow.close();
       
       HomeWindow homeWindow = new HomeWindow();
       homeWindow.open(user.id);
    }  
}
