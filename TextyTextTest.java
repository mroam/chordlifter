
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
    
    

    @Test
    public void userText()
    {
        TextyText banjo = new TextyText();
        banjo.askUserForText();   // I put in by hand: (with quotes) "sometimes\nmelancholy leaves me breathless"
        assertEquals("sometimes\nmelancholy leaves me breathless", banjo.getText());
    }
}


