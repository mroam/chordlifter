
/**
 * ChordShifter... 
 * one idea is this knows how to change a LineWithInternalChords into a
 * LineWithLiftedChords, and vice versa. Another idea is that those Line
 * classes know how to convert themselves into each other (and toString, too).
 *
 * @author Mike Roam
 * @version 2022 May 20
 */
public class ChordShifter
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ChordShifter
     */
    public ChordShifter()
    {
        // initialise instance variables
        
    }

    /**
     * Doesn't work yet
     */
    public static LineWithInternalChords flatten(LinesWithLiftedChords myLWLC)
    {
        System.out.println("flatten doesn't work yet; thanks for trying!");
        return new LineWithInternalChords( );
    }
    
    /**
     * Doesn't work yet
     */
    public static LinesWithLiftedChords liften(LineWithInternalChords myLWIC)
    {
        System.out.println("liften doesn't work yet; thanks for trying!");
        LinesWithLiftedChords myLiftedLines = new LinesWithLiftedChords( );
        myLiftedLines.appendLyrics("I've never seen a ");
        myLiftedLines.appendChords("D");
        myLiftedLines.appendLyrics("diamond in the flesh");
        myLiftedLines.beginNextLines( );
        myLiftedLines.appendLyrics("I cut my ");
        myLiftedLines.appendChords("D");
        myLiftedLines.appendLyrics("teeth on wedding rings in the movies");
        return myLiftedLines;
    }
} // class ChordShifter
