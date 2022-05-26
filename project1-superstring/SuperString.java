// import javafx.scene.control.*;    // for TextInputDialog
// Extra info available at https://chordseasy.com/song/33119/never-gonna-give-you-up

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A String with some special tricks to let us practice.
 * Wants to have the "line i", "word j", and "char k" methods of LiveCode.
 * Alternative approach to consider: make a string manipulator that receives Strings.
 *
 * @author Mike Roam
 * @version 2022e.May26
 */
public class SuperString {
    private String myText = null;  // can be multi-line, e.g.  "lineOne\nlineTwo" beware OBOB!

    private ArrayList<String> myLines = new ArrayList<String>(); // Used for cache; 
    // what if we only use it when a getLine() is called? Do we need one for chars & words?
    // Is this premature optimization?
    // needs to import java.util.ArrayList
    // was: private String[] myLines = null; // mirrors myText, gets changed whenever myText changes!

    /**
     * Constructor for objects of class SuperString.
     * This constructor without arguments uses a placeholder "empty text"
     */
    public SuperString() {
        myText = "empty text";
        myLines.add("empty text");
        /* alternative: array String[]  instead of ArrayList<String>
        myLines = new String[]{"empty text"}; */
        /* Note: various array initializations:
        String[] myStringArray = new String[3];
        String[] myStringArray = {"a", "b", "c"};
        String[] myStringArray = new String[]{"a", "b", "c"};  <== after construction
         */
    }

    /**
     * Constructor for objects of class SuperString
     */
    public SuperString(String newText) {
        myText = newText;
        this.splitIntoLines();
    }

    /**
     * setter
     */
    public void setText(String newText) {
        myText = newText;
        this.splitIntoLines();
    }

    /**
     * getter
     */
    public String getText() {
        return myText;
    }

    /**
     * Using Swing JOptionPane dialog box
     * (have to import javax.swing.*; )
     * <p>
     * See JavaFX example below
     */
    public void askUserForText() {
        // JOptionPane bob = new JOptionPane( );
        JOptionPane.showMessageDialog(null, "Hi!");

        String bunchaWords = JOptionPane.showInputDialog("Please give me words");
        this.setText(bunchaWords);
    }

    /**
     * based upon code in
    <a href="https://examples.javacodegeeks.com/desktop-java/javafx/dialog-javafx/javafx-dialog-example/">...</a>
    and
    <a href="https://www.geeksforgeeks.org/javafx-textinputdialog/">...</a>
    and reference
    <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextInputDialog.html">...</a>

    had to
    import javafx.scene.control.*
     */
    public void askJavaFXUserForText() {
        /* Don't run this yet, gets "Error: uninitialized .."
        which implies to me that we don't have a running javaFX thing yet.
        Maybe the "TextDialogExample" can show how to do this. */
        /*
        TextInputDialog dialog = new TextInputDialog("line1/nline2");
        dialog.setTitle("my text asker");
        dialog.setHeaderText("Enter some text, or use default value.");

        java.util.Optional<String> result = dialog.showAndWait();
        String entered = "none.";

        if (result.isPresent() ) {
        entered = result.get();
        }
        // manipulates the Dialog: actionStatus.setText("Text entered: " + entered);
        this.setText( entered );
         */
    }

    /**
     * reading from text file
     * from
     * https://stackoverflow.com/questions/37769481/javafx-gui-that-opens-a-text-file-how-to-read-whats-in-text-file-and-edit-save
     *
     * has to    import java.io.*     and java.util.ArrayList
     */
    public void readTextFromFile( String fileName /* e.g. "file.txt" */) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
            String currLine;
            // StringBuffer allTheLines = new StringBuffer();
            ArrayList<String> allTheLines = new ArrayList<>();
            while ((currLine = reader.readLine()) != null)
            // System.out.println(currLine);
                allTheLines.add(currLine);
            myText = allTheLines.toString();  // Is this crazy?
            myText = String.join("/n", allTheLines);
            myLines = allTheLines;  // completely replaces it

        } catch (IOException e) {
            e.printStackTrace();
        }
        /* Here's an alternative that allows some parsing, from
        https://stackoverflow.com/questions/37769481/javafx-gui-that-opens-a-text-file-how-to-read-whats-in-text-file-and-edit-save
        try (Scanner scanner = new Scanner(new File("file.txt"))) {
        while (scanner.hasNext())
        System.out.println(scanner.next());
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
        }
        Note: https://prutor.ai/difference-between-scanner-and-bufferreader-class-in-java/
        says,
        "java.util.Scanner class is a simple text scanner which can parse primitive types
        and strings. It internally uses regular expressions to read different types.

        "Java.io.BufferedReader class reads text from a character-input stream, buffering
        characters so as to provide for the efficient reading of sequence of characters"
         */
    }

    /**
     * returns the (y+1)th word of our text. 
     * "word" is anything between spaces. What about dog-food"
     * Eg "hi there".word(0) returns "hi"
     * 
     * How to do? Hint: check getLine( ) and splitIntoLines( )
     */
    public String getWord(int y)
    {
        System.out.println("getChar() doesn't work yet");
        return "yoiks";
    }

    /**
     * returns the (y+1)th char of our text.  Watch and test for OBOBs!
     * "char" is any character. Hmmm, what about unicode?
     * Eg "hi there".char(1) returns "h"
     * Note: I'm using String rather than char or Character, so I can use my 
    fake wrongslash /n linebreaks!
     * Hint: See String in API:
     * <a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html"
    https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html</a>
     * Hint: check String.charAt(int i)    which also work for unicode, see CodePointAt for details
     */
    public String getChar(int i)
    {
        // put your code here
        System.out.println("getChar() doesn't work yet");
        return "m";
    }

    /**
     * find chord i, starting count at ONE so watch & test for OBOBs.
     */
    public String getChord(int i) {
        // put your code here
        System.out.println("getChord(i) doesn't work yet");
        return "{Gm}";
    }

    /**
     * Would we want to number the chords? 
     * If so, this could (when written) find the char offset into the string of chord number I
     * Or not bother, instead while processing just keep pulling off first lyrics & first chord?
     * If we cached all chords AND their locations we could later get their locations again,
     * but does anybody need that?
     */
    public int indexOfChord(int i) {
        //can say "String.indexOf( "{Gm}") but hoow do we find loc of second or third Gm?
        System.out.println("indexOfChord(i) doesn't work yet");
        return 5;
    }

    /**
     * Should be "" if current info is starting with a chord?
     * Could alternatively be a static method which both receives and returns Strings. (Receive SuperString??)
     */    
    String getFirstLyric( ) {
        System.out.println("getFirstLyric( ) doesn't work yet");
        return "Temp";
    }

    /**
     * Handy song manipulation, does NOT mess with this.myText( )
     * Could alternatively be a static method which both receives and returns Strings. (Receive SuperString??)
     */
    String chopFirstLyric( ) {
        String after = null;
        System.out.println("chopFirstLyric( ) doesn't work yet");
        after = "Temp";
        return after;
    }

    /**
     * Should be "" if current info is starting with a lyric?
     * Might return "{F G Em Am}  or {F}
     * Could alternatively be a static method which both receives and returns Strings. (Receive SuperString??)
     */    
    String getFirstChord( ) {
        System.out.println("getFirstChord( ) doesn't work yet");
        return "Temp";
    }

    /**
     * Handy song manipulation, does NOT mess with this.myText( )
     * Could alternatively be a static method which both receives and returns Strings. (Receive SuperString??)
     */
    String chopFirstChord( ) {
        String after = null;
        System.out.println("chopFirstLyric( ) doesn't work yet");
        after = "Temp";
        return after;
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
        if (wantedLineNum > myLines.size() ) {   /* Obob?? How could we tell? :) */
            /* No parentheses on length when measuring an array[].length, 
             * but use parentheses when measuring String.length( )! */
            return "";
        }
        // return myLines[wantedLineNum - 1]; // yes, minus one! (0, 1, 2)
        return myLines.get(wantedLineNum - 1 );  // yes, minus one! How can we be sure?
    }

    /**
     * having trouble with \n  so using  '/n' for now?
     * (typing "lineone\nlinetwo" into blueJ runtime for getText() gets
     * "illegal escape character" message)
     *
     * See
     */
    public void splitIntoLines( )
    {
        String[] theLines = myText.split( "/n" );
        /* if myLines were merely array of String, we'd be done. */
        /* The trick in the next line is the cast. Oops, compiles but doesn't work. See
         * https://beginnersbook.com/2015/05/java-string-to-arraylist-conversion/ */
        // myLines = (ArrayList<String>) Arrays.asList( theLines );
        myLines.clear( );  // faster than ArrayList.removeAll() but leaves nulls.
        for (String aLine : theLines) {
            //for (int i = 0; i < theLines.size(); i++){
            myLines.add(aLine);   // not "append!" 
        }
    }

} // class SuperString
