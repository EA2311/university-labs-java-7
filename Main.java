package onpu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String s[]) {
        final JFrame f = new JFrame("Paint");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setBounds(0,0, 1000, 1000);
        JOptionPane.showMessageDialog((Component) null, "Welcome!\nClick anywhere to start drawing.\nUse only arrow keys.\nPress SPACE to clear field.");
        final Canvas c = new KeyDraw();
        f.add(c);
        f.setVisible(true);
    }
}
