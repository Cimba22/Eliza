import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleChatBot extends JFrame{

    final String TITLE_OF_PROGRAM = "Eliza — your personal life bot)";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    JTextArea dialogue; //area for dialog
    JCheckBox ai; // enable/disable AI
    JTextArea message; //field for entering message
    //SimpleBot sbot;

    public static void main(String[] args) {
        new SimpleChatBot();
    }

    SimpleChatBot() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);

        setVisible(true);
    }
}
