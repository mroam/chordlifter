
/**
 * Holds chords and lyrics separately
 * in separate lines. There are several ways
 * to do this: currently trying to have two
 * parallel arrays of Strings, with each array item
 * counting as a line of text.
 *
 * @author Mike Roam
 * @version 2022 May 19
 */
public class LineFancy
{
    // instance variables - replace the example below with your own
    String[] chordLines;
    String[] lyricLines;
    int currLine = 1;  // beware OBOB

    /**
     * Constructor for objects of class LineFancy
     */
    public LineFancy()
    {
        // initialise instance variables
    }

    /**
     * appending a chord will require lengthening the lyricLines also to stay matched.
     */
    public void appendChord( String newChord )
    {
        // err: chordLines[currLine].append( newChord );
        chordLines[currLine] += newChord;
    }
}
