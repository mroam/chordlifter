import javax.swing.JFrame;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics; // enables paint(Graphics g)
/**
 * Write a description of class JFrameExample here.
 *
 * @author Mike Roam
 * @version 2022 Jun 6
 * based on Kyle Dencker's "BlueJ- Getting Started with JFrames"
 * video tutorial at 
 * <a href="https://youtu.be/zuV3JHnSdno">https://youtu.be/zuV3JHnSdno</a>
 * 
 * unlike JFrameExample1, this is extending JComponent and has paint
 */
public class JFrameExample2 extends JComponent
{
    // instance variables 

    /**
     * Constructor for objects of class JFrameExample2
     */
    public JFrameExample2()
    {
        // initialise instance variables
        // can I call main?
    }

    /**
     * hmmm, would this work for canvas? Probably not JavaFX?
     */
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(50,50,50,50);
    }
    
    /**
     * run me!
     */
    public static void main(String[ ] arg)
    {
        JFrame myFrame = new JFrame("Testing our JFrame!");
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize(500,500);
        myFrame.add( new JFrameExample2() ); 
        myFrame.setVisible(true);
        myFrame.getContentPane().setBackground(Color.RED);
    }
}
