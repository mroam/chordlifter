
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TextyTextTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
    public void word2()
    {
        TextyText textyTex1 = new TextyText("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");
        assertEquals("for", textyTex1.word(2));
    }

    @Test
    public void word2zoiks()
    {
        TextyText textyTex1 = new TextyText("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");
        assertEquals("zoi" + "ks", textyTex1.word(2));
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

    @Test
    public void split()
    {
        TextyText txtOne = new TextyText("line1/nline2/nline3");
        assertEquals("line1/nline2/nline3", txtOne.getText());
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("line2", txtOne.getLine(2));
        assertEquals("line3", txtOne.getLine(3));
        assertEquals("", txtOne.getLine(4));
        
        // txtOne.askUserForText();  // if we could be sure they use "line1/nline2"
        txtOne.setText("line1/nline2");
        assertEquals("", txtOne.getLine(0));
        assertEquals("line1", txtOne.getLine(1));
        assertEquals("line2", txtOne.getLine(2));
        assertEquals("", txtOne.getLine(3));
        
        // assertEquals("line1/nline2", txtOne.word(1));
    }
}



