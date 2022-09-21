package quizapplication.frontend.constants;

import java.awt.*;
import javax.swing.*;
import quizapplication.frontend.components.MenuBar;

public class Theme {
    static Color PRIMARY_COLOR;
    static Color FONT_COLOR;
    static Font FONT;
    static GridLayout DEFAULT_LAYOUT;
    
    static int FRAME_HEIGHT = 1000;
    static int FRAME_WIDTH = 1000;
    
    static int X_POSITION = 200;
    static int Y_POSITION = 100;
    
    static int PANEL_HEIGHT = 0;
    static int PANEL_WIDTH = 0;
    
    public static void layout(JFrame frame, JPanel panel){
        PRIMARY_COLOR = new Color(255, 255, 255);
        FONT_COLOR = new Color(255, 0, 0);
        FONT = new Font("Monospaced", Font.BOLD, 25);
        DEFAULT_LAYOUT = new GridLayout(0, 1);

        MenuBar.create(frame);
        
        frame.add(layoutPanel(panel));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_HEIGHT, FRAME_WIDTH);
        frame.setLocation(X_POSITION, Y_POSITION);
    }
    
    private static JPanel layoutPanel(JPanel panel){
        panel.setFont(FONT);
        panel.setLayout(DEFAULT_LAYOUT);
        panel.setBackground(PRIMARY_COLOR);
        panel.setForeground(FONT_COLOR);
        
        return panel;
    }
}
