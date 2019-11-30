package onpu;

import java.awt.*;
import java.awt.event.*;
public class KeyDraw extends Canvas {
    private int lastX=500, lastY=300;
    private int ex=500, ey=300;
    static private boolean clear=false;
    public KeyDraw () {
        super();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    ey = ey + 5;
                    repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    ey = ey - 5;
                    repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    ex = ex - 5;
                    repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ex = ex + 5;
                    repaint();
                }
                if (e.getKeyChar() == ' ') {
                    clear = true;
                    repaint();
                }
            }
        });
    }

    public void update(Graphics g) {
        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX=ex;
            lastY=ey;
        }
    }
}

