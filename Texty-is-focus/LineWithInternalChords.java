
/**
 *  LineWithInternalChords has chords interspersed within lyrics, e.g. "{Am} At first I was afraid..."
 *
 * @author Mike Roam
 * @version 2022 May 19
 */
public class LineWithInternalChords
{
    // Hmmm, should I use array of Strings for multiLine, like LWLC,
    // or split by '\n' or "/n"...??
    private String myLine = null;

    /**
     * Constructor for objects of class LineWithInternalChords
     */
    public LineWithInternalChords( )
    {
        // initialise instance variables

    }

    /**
     * Constructor for objects of class LineWithInternalChords
     */
    public LineWithInternalChords(String newMyLine )
    {
        if (newMyLine == null) {
            myLine = "";
        } else {
            myLine = newMyLine;
        }
    }

    /**
     * 
     */
    public void setMyLine(String newMyLine)
    {
        if (newMyLine == null) {
            myLine = "";
        } else {
            myLine = newMyLine;
        }
    }


    /**
     * Convert our chordsInternal to chordsLifted
     */
    public LinesWithLiftedChords toLifted( )
    {
        LinesWithLiftedChords myLiftedLines = ChordShifter.liften(this);
        return myLiftedLines;
    }

    /**
     * Hmmm, want real '\n' or place-holder "/n"??
     */
    public String toString( )
    {
        /*  fancy way if myLines is array of String: 
         StringBuilder myStr = new StringBuilder( );  // fast but not thread safe
        for (String s : myLines) {
            myStr.append( s ); //  "\n" ); // yeah, wrong slant
        }
        return myStr.toString( );
        */
        return myLine;
    }

} // class LineWithInternalChords
