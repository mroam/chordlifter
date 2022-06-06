import javax.swing.JFrame;
import java.awt.Color;

/**
 * Write a description of class JFrameExample here.
 *
 * @author Mike Roam
 * @version 2022 Jun 6
 * based on Kyle Dencker's "BlueJ- Getting Started with JFrames"
 * video tutorial at 
 * <a href="https://youtu.be/zuV3JHnSdno">https://youtu.be/zuV3JHnSdno</a>
 * 
 */
public class JFrameExample1
{
    // instance variables 

    /**
     * Constructor for objects of class JFrameExample1
     */
    public JFrameExample1()
    {
        // initialise instance variables
        // can I call main?
    }

    /**
     * run me!
     */
    public static void main(String[ ] arg)
    {
        JFrame myFrame = new JFrame("Testing our JFrame!");
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize(500,500);
        
        myFrame.setVisible(true);
        myFrame.getContentPane().setBackground(Color.RED);
    }
}
