package quizapplication.frontend.components.functional;

import java.awt.event.*;
import javax.swing.JTextField;
import quizapplication.backend.models.User;
import quizapplication.frontend.pages.user.LoginWindow;
import quizapplication.frontend.pages.user.RegisterWindow;

public class RegisterListener implements ActionListener {
    JTextField usernameTextField;
    RegisterWindow registerWindow;
    public RegisterListener(RegisterWindow registerWindow, JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
        this.registerWindow = registerWindow;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
       if(usernameTextField.getText().length() > 50) return;

       User user = new User(this.usernameTextField.getText());
       
       user.register();
       
       registerWindow.close();
       
       LoginWindow loginWindow = new LoginWindow();
       loginWindow.open();
    }  
}
