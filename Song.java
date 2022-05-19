
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (2022 Jan 27)
 * 
 * This is not just a simple text song, it is probably a tree of somekind.
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int x;
    private String myText;    // unchangeable! should we use StringBuffer 

    Metadata myMetaData;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     * 
     * Idea: pop up a text or file dialog to get some text.
     * Text could have info about what format it is in: smooshed or lifted,
     * and which version of our data.
     * And specifications about whether brackets prefer spaces around them.
     */
    public void getText( )
    {
        // could put up a file dialog 
        myText = "Don't sit under the apple tree {Am} with anybody else.";
    } // getText( )

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String play( )
    {
        // put your code here
        // something digital happens with the speaker
        System.out.print( myText ); // "Shoo wah diddy diddy");
        return myText; // "Shoo wah diddy diddy";
    } // play( )

    
    /**
     * spit out a version of the song in which chords are on the line above
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String makeLineRaised(  )
    {
        // put your code here
        return "   [Am]\nhi   bob";
    }

    
    
    
}  // class Song
