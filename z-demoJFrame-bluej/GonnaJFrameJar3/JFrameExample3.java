import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Point;
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
 * combined with his "Simple Array Game: Day 2 - Converting to GUI"
 * at <a href="https://youtu.be/vu-o42XBkVk">https://youtu.be/vu-o42XBkVk</a>
 * 
 * unlike JFrameExample1, this has paint & JComponent
 * like JFrameExample2, this is extending JComponent and has paint
 * unlike JFrameExample2, this implements MouseListener
 */
public class JFrameExample3 extends JComponent implements MouseListener
{
    // instance variables
    String myMsg = "howdy";

    /**
     * Constructor for objects of class JFrameExample2
     */
    public JFrameExample3()
    {
        addMouseListener( this ); // is this cool way to do it??
        // can I call main? Nah, main calls me!
    }

    /**
     * hmmm, would this work for canvas? Probably not JavaFX?
     * was "paint" in JFrameExample2, now is paintComponent
     */
    public void paintComponent(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(50,40,30,20);
        g.drawString(myMsg, 100, 100);
    }
    
    /**
     * run me!
     */
    public static void main(String[ ] arg)
    {
        JFrame myFrame = new JFrame("Testing our JFrame!");
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize(500,500);
        myFrame.add( new JFrameExample3() ); 
        myFrame.setVisible(true);
        myFrame.getContentPane().setBackground(Color.RED);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        Point whereClicked = new Point( e.getX( ), e.getY( ) );
        // System.out.println("Clicked at " + whereClicked );
        myMsg = "Clicked at " + whereClicked;
        repaint( );
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    
}
