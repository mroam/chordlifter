
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
public class LinesWithLiftedChords
{
    // instance variables - replace the example below with your own
    String[] chordLines = new String[100]; // not cool but must specify.
    String[] lyricLines = new String[100]; // better: java.util.ArrayList<String> 
    int currLine = 0;  // beware OBOB!

    /**
     * Constructor for objects of class LinesWithLiftedChords
     */
    public LinesWithLiftedChords()
    {
        // initialise instance variables
    }
    
    /**
     * Constructor for objects of class LinesWithLiftedChords
     */
    public LinesWithLiftedChords(String newChords, String newLyrics)
    {
        if (newChords == null) {
            chordLines[currLine] = "";
        } else {
            chordLines[currLine] = newChords;
        }
        if (newLyrics == null) {
            lyricLines[currLine] = "";
        } else {
            lyricLines[currLine] = newLyrics;
        }
    }

    /**
     * appending a chord(s) will require lengthening the lyricLines also to stay matched.
     */
    public void appendChords( String newChords )
    {
        // err: chordLines[currLine].append( newChord );
        if (chordLines[currLine] == null) {
            chordLines[currLine] = newChords;
        } else {
            chordLines[currLine] += newChords;
        }
        makeLinesSameLength( );
    }

    /**
     * appending lyrics will require lengthening the chordLines also to stay matched.
     */
    public void appendLyrics( String newLyrics )
    {
        // err: chordLines[currLine].append( newChord );
        if (lyricLines[currLine] == null) {
            lyricLines[currLine] = newLyrics;
        } else {
            lyricLines[currLine] += newLyrics;
        }
        makeLinesSameLength( );
    }

    /**
     * Make the lyric and chord lines be the same length.
     * Not public, not to be used by outsiders.
     */
    void makeLinesSameLength( ) {
        if (lyricLines[currLine] == null) {
            lyricLines[currLine] = "";
        }
        if (chordLines[currLine] == null) {
            chordLines[currLine] = "";
        }
        int lyricLineSize = lyricLines[currLine].length( );
        int chordLineSize = chordLines[currLine].length( );
        if (lyricLineSize < chordLineSize) {
            lyricLines[currLine] += Boss.spaces(chordLineSize - lyricLineSize, '.');
        } else if (lyricLineSize < chordLineSize) {
            chordLines[currLine] += Boss.spaces(lyricLineSize - chordLineSize, '.');
        } else { 
            // do nothing since already sameLength 
        }
    }

    /**
     * Throws a "\n" (or System.getProperty("line.separator"); ) onto both lines
     */
    public void beginNextLines( )
    {
        if (lyricLines[currLine] == null) {
            lyricLines[currLine] = "";
        }
        if (chordLines[currLine] == null) {
            chordLines[currLine] = "";
        }
        ++currLine;
        lyricLines[currLine] = "";
        chordLines[currLine] = "";    
    }

    /**
     * Convert our chordsLifted to chordsInternal 
     */
    public LineWithInternalChords toFlattened( )
    {
        LineWithInternalChords myFlatLine = ChordShifter.flatten(this);
        return myFlatLine;
    }
    
    /**
     * Might want to use '\n' instead of "/n" 
     * (I've had trouble getting them from BlueJ's GUI
     */
    public String toString()
    {
        StringBuilder myText = new StringBuilder( );  // fast but not thread safe
        for (int i = 0; i < currLine; ++i) {
            if (lyricLines[currLine] == null) {
                lyricLines[currLine] = "";
            }
            if (chordLines[currLine] == null) {
                chordLines[currLine] = "";
            }
            myText.append( chordLines[ i ] + "\n" ); // yeah, wrong slant for now, GUI
            myText.append( lyricLines[ i ] + "\n" ); // yeah, wrong slant
        }
        return myText.toString( );
    }

} // class LinesWithLiftedChords
