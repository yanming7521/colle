package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class HuaTu extends JPanel {
    public void paint (Graphics g) {
        Graphics2D g_2d = (Graphics2D)g;
        Arc2D arc = new Arc2D.Double(0,0,100,100,-90,-180,Arc2D.PIE);
        g_2d.setColor(Color.black);
        g_2d.fill(arc);
        g_2d.setColor(Color.white);
        arc.setArc(0,0,100,100,-90,180,Arc2D.PIE);
        g_2d.fill(arc);
        arc.setArc(25,0,50,50,-90,-180,Arc2D.PIE);
        g_2d.fill(arc);
        g_2d.setColor(Color.black);
        Ellipse2D ellipse2D = new Ellipse2D.Double(40,15,20,20);
        g_2d.fill(ellipse2D);
        arc.setArc(25,50,50,50,90,-180,Arc2D.PIE);
        g_2d.fill(arc);
        g_2d.setColor(Color.white);
        ellipse2D.setFrame(40,65,20,20);
        g_2d.fill(ellipse2D);
        g_2d.setColor(Color.black);
        arc.setArc(0,0,100,100,0,360,Arc2D.PIE);
        //g_2d.draw(arc);
        g_2d.setColor(Color.white);
        arc.setArc(0,120,100,100,0,360,Arc2D.PIE);
        g_2d.fill(arc);
        g_2d.setColor(Color.black);
        arc.setArc(0,240,100,100,0,360,Arc2D.PIE);
        g_2d.fill(arc);
        arc.setArc(120,120,100,100,0,360,Arc2D.PIE);
        g_2d.setColor(Color.yellow);
        g_2d.fill(arc);
        Rectangle2D rectangle2D = new Rectangle2D.Double(120,0,200,100);
        g_2d.setColor(Color.black);
        g_2d.draw(rectangle2D);
        rectangle2D.setFrame(123,3,195,95);
        g_2d.setColor(Color.black);
        g_2d.fill(rectangle2D);
//        Polygon polygon = new Polygon();
//        polygon.addPoint(150,10);
//        polygon.addPoint(100,90);
//        polygon.addPoint(210,90);
//        polygon.addPoint(260,10);
//        g_2d.draw(polygon);
    }

    public static void main(String[] args) {
        JFrame taiji = new JFrame();
        taiji.setSize(400,400);
        taiji.add(new HuaTu());
        taiji.setVisible(true);
        taiji.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
