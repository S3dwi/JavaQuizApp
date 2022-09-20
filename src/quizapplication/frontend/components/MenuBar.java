
package quizapplication.frontend.components;

import javax.swing.*;


public class MenuBar {
    public static void create(JFrame frame){
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem item1 = new JMenuItem("Register Window");
        JMenuItem item2 = new JMenuItem("Login Window");
        JMenuItem item3 = new JMenuItem("All Questions Window");
        JMenuItem item4 = new JMenuItem("Create Question Window");
        JMenuItem item5 = new JMenuItem("Home Window");
        
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
    }
}
