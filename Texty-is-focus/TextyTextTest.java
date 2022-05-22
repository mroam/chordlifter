
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TextyTextTest.
 *
 * @author  Mike Roam
 * @version 2022 May 19
 */
public class TextyTextTest
{
    /**
     * Default constructor for test class TextyTextTest
     */
    public TextyTextTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void getWord2()
    {
        TextyText textyTex1 = new TextyText("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");
        assertEquals("for", textyTex1.getWord(2));
    }

    @Test
    public void getWord2yoiks()
    {
        TextyText textyTex1 = new TextyText("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");
        assertEquals("yoi" + "ks", textyTex1.getWord(2));
    }

    /*     * * * Silly to test this unless we know what the user is going to insert. Need to mock up!
    @Test
    public void userText()
    {
    TextyText banjo = new TextyText();
    banjo.askUserForText();   // I put in by hand: (with quotes) "sometimes\nmelancholy leaves me breathless"
    assertEquals("sometimes\nmelancholy leaves me breathless", banjo.getText());
    }
     */

    /**
     * Trying to test getLine(x).
     * Edge cases: 
     * [ ] null TextyText
     * [ ] using non-arg constructor (which makes "<empty text>"
     * [ ] empty TextyText
     * [ ] index out of bounds
     */
    @Test
    public void getLine()
    {
        // let's try null!
        /* can it survive? NO: Can't call methods on a non-existent object, and can't
         * prevent someone from calling methods on a non-existent object.
         * IF we also have a static getLine( TextText myStr, int i )  THEN we could notice null
         * and return "".
         */
        TextyText txtOne = null; 
        // assertEquals("", txtOne.getLine(-1) );
        // assertEquals("", txtOne.getLine(0) );
        // assertEquals("", txtOne.getLine(1) );
        // assertEquals("", txtOne.getLine(2) );

        // let's try empty but constructed. (non-arg constructor makes "<empty text>" !)
        txtOne = new TextyText( ); // can it survive?
        assertEquals("", txtOne.getLine(-1) );
        assertEquals("", txtOne.getLine(0) );
        assertEquals("empty text", txtOne.getLine(1) );
        assertEquals("", txtOne.getLine(2) );

        // one liner without trailing '/n'
        txtOne.setText("line1");
        assertEquals("", txtOne.getLine(-1));
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("", txtOne.getLine(2));

        // one liner WITH trailing '/n'
        txtOne.setText("line1/n");
        assertEquals("", txtOne.getLine(-1));
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("", txtOne.getLine(2));

        
        // two liner WITH trailing '/n'
        txtOne.setText("line1/nline2/n");
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("line2", txtOne.getLine(2));
        assertEquals("", txtOne.getLine(3));

        // two liner without trailing '/n'
        txtOne.setText("line1/nline2");
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("line2", txtOne.getLine(2));
        assertEquals("", txtOne.getLine(3));

        // two liner WITH trailing '/n'
        txtOne.setText("line1/nline2/n");
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("line2", txtOne.getLine(2));
        assertEquals("", txtOne.getLine(3));

        // three liner
        txtOne = new TextyText("line1/nline2/nline3");
        assertEquals("line1/nline2/nline3", txtOne.getText());
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("line2", txtOne.getLine(2));
        assertEquals("line3", txtOne.getLine(3));
        assertEquals("", txtOne.getLine(4));

        // // user input... silly to test
        // // txtOne.askUserForText();  // if we could be sure they use "line1/nline2"
        // txtOne.setText("line1/nline2");
        // assertEquals("", txtOne.getLine(0));
        // assertEquals("line1", txtOne.getLine(1));
        // assertEquals("line2", txtOne.getLine(2));
        // assertEquals("", txtOne.getLine(3));
    } // getLine( )

    /**
     * TODO make a more difficult test
     * [ ] with line breaks (?? can words wrap line: no, /n counts as space. Right??)
     * 
     */
    @Test
    public void getWord()
    {
        TextyText txtOne = new TextyText("word1 word2  word.3");
        assertEquals("", txtOne.getWord(-1));
        assertEquals("", txtOne.getWord(0));
        assertEquals("wordl", txtOne.getWord(1));
        assertEquals("word2", txtOne.getWord(2));
        assertEquals("word.3", txtOne.getWord(2));
        assertEquals("", txtOne.getWord(10));
    }

    /**
     * TODO make a more difficult test
     * [ ] with line breaks (?? can words wrap line: no, /n counts as a char or NO??)
     */
    @Test
    public void getChar()
    {
        TextyText txtOne = new TextyText("line1");
        assertEquals("", txtOne.getChar(-1));
        assertEquals("", txtOne.getChar(0));
        assertEquals("l", txtOne.getChar(1));
        assertEquals("i", txtOne.getChar(2));
        assertEquals("", txtOne.getChar(10));
    }
} // class TextyTextTest


