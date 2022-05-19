import javax.swing.*;  // or import javax.swing.JOptionPane;

/**
 * A String with some special tricks to let us practice.
 *
 * @author Mike Roam
 * @version 2022e.May18
 */
public class TextyText
{
    String myText = null;

    /**
     * Constructor for objects of class TextyText
     */
    public TextyText()
    {
        myText = "empty text";
    }

    /**
     * Constructor for objects of class TextyText
     */
    public TextyText( String newText)
    {
        myText = newText;
    }

    
    /**
     * 
     */
    public void setText( String newText)
    {
        myText = newText;
    }

    
    /**
     * 
     */
    public String getText( )
    {
        return myText;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void askUserForText( )
    {
        // JOptionPane bob = new JOptionPane( );
        JOptionPane.showMessageDialog(null, "Hi!");
        
        String bunchaWords = JOptionPane.showInputDialog("Please give me words");
        this.setText(bunchaWords);

    }


    /**
     * returns the (y+1)th word of our text. 
     * "word" is anything between spaces. What about dog-food"
     * Eg "hi there".word(0) returns "hi"
     */
    public String word(int y)
    {
        // put your code here
        return "zoiks";
    }

    
}
