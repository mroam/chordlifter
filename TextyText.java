import javax.swing.*;  // or import javax.swing.JOptionPane;

/**
 * A String with some special tricks to let us practice.
 *
 * @author Mike Roam
 * @version 2022e.May18
 * 
 * 
 */
public class TextyText
{
    private String myText = null;  // can be multi-line, e.g.  "lineOne\nlineTwo" beware OBOB!
    private String[] myLines = null; // mirrors myText, gets changed whenever myText changes!

    /**
     * Constructor for objects of class TextyText
     */
    public TextyText()
    {
        myText = "empty text";
        myLines = new String[]{"empty text"};
    }

    /**
     * Constructor for objects of class TextyText
     */
    public TextyText( String newText)
    {
        myText = newText;
        this.splitIntoLines( );
    }

    /**
     * setter
     */
    public void setText( String newText)
    {
        myText = newText;
        this.splitIntoLines( );
    }

    /**
     * getter
     */
    public String getText( )
    {
        return myText;
    }

    /**
     * Using Swing JOptionPane dialog box
     * (have to import javax.swing.*; )
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

    /**
     * Returns one of the lines of myText.
     * Let's stay alert to counting from zero (by Java) or from one (me).
     * e.g. "lineOne\nlineTwo\nlineThree".getLine(2) will return "lineTwo"
     */
    public String getLine(int wantedLineNum)
    {
        if (wantedLineNum < 1) {
            return "";
        }
        if (myText == null) {
            return "";  // throw new 
        }
        if (wantedLineNum > myLines.length ) {   /* Obob?? How could we tell? */
             /* No parentheses on length when measuring an array[].length, 
             * but use parentheses when measuring String.length( )! */
            return "";
        }
        return myLines[wantedLineNum - 1]; // yes, minus one! (0, 1, 2)
    }

    /**
     * having trouble with \n  so using  '/n' for now?
     * (typing "lineone\nlinetwo" into blueJ runtime for getText() gets
     * "illegal escape character" message)
     */
    public void splitIntoLines( )
    {
        myLines = myText.split( "/n" );
    }

} // class TextyText
