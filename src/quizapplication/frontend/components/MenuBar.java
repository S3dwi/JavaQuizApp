
package quizapplication.frontend.components;

import javax.swing.*;
import quizapplication.frontend.components.functional.MenuListener;
import quizapplication.frontend.components.functional.RegisterListener;


public class MenuBar {
    public static int userId = 0;
    public static void create(JFrame frame){
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
//        JMenuItem item1 = new JMenuItem("Register Window");
        JMenuItem item2 = new JMenuItem("Login Window");
        JMenuItem item3 = new JMenuItem("All Questions Window");
        JMenuItem item4 = new JMenuItem("Create Question Window");
        JMenuItem item5 = new JMenuItem("Home Window");
        
        item2.addActionListener(new MenuListener(2, userId));
        item3.addActionListener(new MenuListener(3, userId));
        item4.addActionListener(new MenuListener(4, userId));
        item5.addActionListener(new MenuListener(5, userId));
        
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
    }
}
