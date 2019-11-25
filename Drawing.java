package onpu;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.JFrame;
public class Drawing extends JFrame {

    LeftCanvas lcanvas = new LeftCanvas();
    RightCanvas rcanvas = new RightCanvas();

    public Drawing() {
        super("Laba9.1");
        addComponents();
        pack();
        setVisible(true);
        setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void addComponents() {
        setLayout(new GridLayout(1,2));
        add(lcanvas);
        add(rcanvas);
    }
    public void paint(Graphics g) {
        lcanvas.repaint();
        rcanvas.repaint();
    }
}

class LeftCanvas extends Canvas {
    public LeftCanvas() {
        super();
    }
    public void paint (Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(0,175,360,175);
        g.setColor(Color.black);
        g.drawRect(40,270,60,30);
        g.drawRect(100,230,50,70);
        g.drawOval(50,300,20,20);
        g.drawOval(115,300,20,20);
        g.drawRect(55,220,10,50);
        g.drawRect(115,240,20,30);

        int[] arrayX = {50, 90, 130,90};
        int[] arrayY = {95,110,95,80};
        Polygon poly = new Polygon(arrayX, arrayY, 4);
        g.drawPolygon(poly);

        arrayX[0]=90;
        arrayX[1]=110;
        arrayX[2]=97;
        arrayY[0]=80;
        arrayY[1]=70;
        arrayY[2]=82;
        Polygon poly1 = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly1);

        arrayX[0]=90;
        arrayX[1]=110;
        arrayX[2]=97;
        arrayY[0]=110;
        arrayY[1]=120;
        arrayY[2]=108;
        Polygon poly2 = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly2);

        arrayX[0]=130;
        arrayX[1]=160;
        arrayX[2]=145;
        arrayX[3]=160;
        arrayY[0]=95;
        arrayY[1]=110;
        arrayY[2]=95;
        arrayY[3]=80;
        Polygon poly3 = new Polygon(arrayX, arrayY, 4);
        g.drawPolygon(poly3);

        g.drawOval(65,93,4,3);
        g.fillOval(65,93,4,3);
    }
}
class RightCanvas extends Canvas {
    public RightCanvas() {
        super();
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(0,0,0,400);
        g.drawLine(0,175,360,175);

        g.setColor(Color.black);
        g.drawOval(50,215,100,100);
        g.drawOval(85,217,30,30);
        g.drawOval(85,283,30,30);
        g.drawOval(85,250,30,30);
        g.drawOval(56,235,30,30);
        g.drawOval(114,235,30,30);
        g.drawOval(114,267,30,30);
        g.drawOval(56,267,30,30);

        int[] arrayX = {50, 130, 130};
        int[] arrayY = {110,110,70};
        Polygon poly = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly);
        g.setColor(Color.lightGray);
        g.fillPolygon(poly);
        g.setColor(Color.black);

        arrayX[0]=55;
        arrayX[1]=45;
        arrayX[2]=55;
        arrayY[0]=106;
        arrayY[1]=85;
        arrayY[2]=80;
        Polygon poly1 = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly1);
        g.setColor(Color.lightGray);
        g.fillPolygon(poly1);
        g.setColor(Color.black);

        arrayX[0]=63;
        arrayX[1]=75;
        arrayX[2]=65;
        arrayY[0]=106;
        arrayY[1]=95;
        arrayY[2]=90;
        Polygon poly2 = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly2);
        g.setColor(Color.lightGray);
        g.fillPolygon(poly2);
        g.setColor(Color.black);

        arrayX[0]=63;
        arrayX[1]=75;
        arrayX[2]=80;
        arrayY[0]=120;
        arrayY[1]=110;
        arrayY[2]=117;
        Polygon poly3 = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly3);
        g.setColor(Color.lightGray);
        g.fillPolygon(poly3);
        g.setColor(Color.black);

        arrayX[0]=100;
        arrayX[1]=110;
        arrayX[2]=120;
        arrayY[0]=123;
        arrayY[1]=98;
        arrayY[2]=110;
        Polygon poly4 = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly4);
        g.setColor(Color.lightGray);
        g.fillPolygon(poly4);
        g.setColor(Color.black);

        arrayX[0]=130;
        arrayX[1]=130;
        arrayX[2]=170;
        arrayY[0]=110;
        arrayY[1]=105;
        arrayY[2]=105;
        Polygon poly5 = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly5);
        g.setColor(Color.lightGray);
        g.fillPolygon(poly5);
        g.setColor(Color.black);
        g.drawOval(58,106,3,3);
        g.fillOval(58,106,3,3);
    }
}