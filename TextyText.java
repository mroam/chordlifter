import javafx.scene.control.*;    // for TextInputDialog
import java.io.*;       // for BufferedReader
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import javax.swing.*;  // or import javax.swing.JOptionPane;

/**
 * A String with some special tricks to let us practice.
 * Wants to have the "line i", "word j", and "char k" methods of LiveCode.
 *
 * @author Mike Roam
 * @version 2022e.May18
 */
public class TextyText {
    private String myText = null;  // can be multi-line, e.g.  "lineOne\nlineTwo" beware OBOB!

    private ArrayList<String> myLines = new ArrayList<String>();
    // was: private String[] myLines = null; // mirrors myText, gets changed whenever myText changes!

    // maybe a java.util.ArrayList<String> would be better?

    /**
     * Constructor for objects of class TextyText
     */
    public TextyText() {
        myText = "empty text";
        myLines.add("empty text");
        /* myLines = new String[]{"empty text"};*/
        /* Note: various array initializations:
        String[] myStringArray = new String[3];
        String[] myStringArray = {"a", "b", "c"};
        String[] myStringArray = new String[]{"a", "b", "c"};  <== after construction
         */
    }

    /**
     * Constructor for objects of class TextyText
     */
    public TextyText(String newText) {
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

    /** based upon code in
    https://examples.javacodegeeks.com/desktop-java/javafx/dialog-javafx/javafx-dialog-example/
     and
     https://www.geeksforgeeks.org/javafx-textinputdialog/
     and reference
     https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextInputDialog.html


     had to
     import javafx.scene.control.*
     */
    public void askJavaFXUserForText() {
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
        /* The trick in the next line is the cast. See
        * https://beginnersbook.com/2015/05/java-string-to-arraylist-conversion/ */
        myLines = (ArrayList<String>) Arrays.asList( theLines );
    }

} // class TextyText
