// should I be like intelliJ in starting all my nearby java programs with
// package com.michaelroam.hellomilton;
// or will that require me to put the files into a /com/michaelroam/hellomilton
// hierarchy like intelliJ does??

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SuperStringAtsakymoTest.
 *
 * @author  Mike Roam
 * @version 2022f Jun 03
 * 
 * Starting Mike's DIY, getLeadingLyric( ) is working.
 * ?? Do the tests worry sufficiently about null and "" strings??  TODO
 * 
 *
 * If junit isn't found, try IntelliJ's menu:        
 * File:ProjectStructure:ProjectSettings:Libraries: "+"        
 * choose fromMaven  (search w/ magnifyingGlass?) for something like        
 * org.junit.jupiter:junit-jupiter:5.8.2        
 *
 */
public class SuperStringAtsakymoTest
{
    /**
     * Default constructor for test class SuperStringAtsakymoTest
     */
    public SuperStringAtsakymoTest()
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

    // // note: intelliJ's version is spelling out com.michaelroam.chordlifter.SuperStringAtsakymo   ... overkill? courtesy? package? scope?
    @Test
    public void getWord2()
    {        
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");

        // do:
        String actual = supstr.getWord( 2 );

        // then 
        String expected = "for";
        assertEquals(expected, actual);
    }

    @Test
    public void getWord2yoiks()
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");

        // do:
        String actual = supstr.getWord( 2 );

        // then 
        String expected = "yoi" + "ks";
        assertEquals(expected, actual);
    }

    /**
     * 
     */
    @Test
    public void beginsWithChord( ) {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("{F G Em Am} /n {F}We're no strangers to {G}love.");
        assertTrue(supstr.beginsWithChord( ) );
        supstr = new SuperStringAtsakymo("");
        assertFalse(supstr.beginsWithChord( ) );
        supstr = new SuperStringAtsakymo(" {F G Em Am} /n {F}We're no strangers to {G}love."); // <== has leading blank
        assertTrue(supstr.beginsWithChord( ) );
        supstr = new SuperStringAtsakymo("We're no strangers to {G}love.");
        assertFalse(supstr.beginsWithChord( ) );
    }

    
    /**
     * testing the getChord( i )
     */
    @Test
    public void getChordI()
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("{F G Em Am} /n {F}We're no strangers to {G}love.");

        // do:
        String actual = supstr.getChord( -1 );

        // then
        String expected = "";
        assertEquals(expected, actual);
        // more tests, compressed
        assertEquals("", supstr.getChord( 0 ) );
        assertEquals("{F G Em Am}", supstr.getChord( 1 ) );
        assertEquals("{F}", supstr.getChord( 2 ) );
        assertEquals("{G}", supstr.getChord( 3 ) );
        assertEquals("", supstr.getChord( 4 ) );
    }

    /**
     * I guess this should be able to handle leading space " {F}" but NOT anything else
     */
    @Test
    public void getLeadingChord( )
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("{F}You know the rules and {G}so do I");

        // do:
        String actual = supstr.getLeadingChord( );

        // check:
        String expected = "{F}";
        assertEquals(expected, actual);
        // more tests, compressed
        supstr = new SuperStringAtsakymo(" {F G F}You know the rules and {G}so do I");
        assertEquals(" {F G F}", supstr.getLeadingChord() );  // keep leading space?? Probably.
        // supstr = new SuperStringAtsakymo(" You know the rules and {G}so do I");
        // assertEquals("", supstr.getLeadingChord);
    }

    @Test
    public void chopLeadingChord( )
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("{F}A full commitment's what I'm {G}thinking of");

        // do:
        String actual = supstr.chopLeadingChord( );

        // check: 
        String expected = "A full commitment's what I'm {G}thinking of";
        assertEquals(expected, actual);
    }

    @Test
    public void getLeadingLyric( )
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("Never gonna {F}give you {G}up, Never gonna {Em}let you {Am}down");
        // interesting: keep the space after "gonna" or NOT? What if it were deliberately two spaces??

        // do:
        String actual = supstr.getLeadingLyric( );

        // check: 
        String expected = "Never gonna ";
        assertEquals(expected, actual);
    }

    @Test
    public void chopLeadingLyric( )
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("Never gonna r{F}un a{G}round and d{E}esert{Am} you");

        // do:
        String actual = supstr.chopLeadingLyric( );

        // check: 
        String expected = "{F}un a{G}round and d{E}esert{Am} you";
        assertEquals(expected, actual);
    }

    /*     * * * Silly to test this unless we know what the user is going to insert. Need to mock up!
    @Test
    public void userText()
    {
    // given:
    SuperStringAtsakymo banjo = new SuperStringAtsakymo();
    banjo.askUserForText();   // I put in by hand: (with quotes) "sometimes\nmelancholy leaves me breathless"
    assertEquals("sometimes\nmelancholy leaves me breathless", banjo.getText());
    }
     */

    /**
     * Trying to test getLine(x).
     * Edge cases: 
     * [ ] null SuperStringAtsakymo
     * [ ] using non-arg constructor (which makes "<empty text>"
     * [ ] empty SuperStringAtsakymo
     * [ ] index out of bounds
     */
    @Test
    public void getLine()
    {
        // let's try null!?? 
        /* can it survive? NO: Can't call methods on a non-existent object, and can't
         * prevent someone from calling methods on a non-existent object.
         * IF we also have a static getLine( TextText myStr, int i )  THEN we could notice null
         * and return "".
         */

        // given:
        // SuperStringAtsakymo txtOne = null;

        // do:
        // String actual = supstr.getLine(-1);

        // check: 
        // String expected = "";
        // assertEquals(expected, actual);

        // assertEquals("", txtOne.getLine(-1) );
        // assertEquals("", txtOne.getLine(0) );
        // assertEquals("", txtOne.getLine(1) );
        // assertEquals("", txtOne.getLine(2) );

        // let's try empty but constructed. (non-arg constructor makes "<empty text>" !)
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo( ); // can it survive?

        // do:
        String actual = supstr.getLine(-1);

        // check: 
        String expected = "";
        assertEquals(expected, actual);

        // lots more tests, compressed, (not spelling out 'actual', 'expected').
        assertEquals("", supstr.getLine(0) );
        assertEquals("empty text", supstr.getLine(1) );
        assertEquals("", supstr.getLine(2) );

        // one liner without trailing '/n'
        // given:
        supstr.setText("line1");
        assertEquals("", supstr.getLine(-1));
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("", supstr.getLine(2));

        // one liner WITH trailing '/n'
        // given:
        supstr.setText("line1/n");
        assertEquals("", supstr.getLine(-1));
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("", supstr.getLine(2));

        // two liner WITH trailing '/n'
        // given:
        supstr.setText("line1/nline2/n");
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("", supstr.getLine(3));

        // two liner without trailing '/n'
        // given:
        supstr.setText("line1/nline2");
        // do and check:
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("", supstr.getLine(3));

        // two liner WITH trailing '/n'
        // given:
        supstr.setText("line1/nline2/n");
        // do and check:
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("", supstr.getLine(3));

        // three liner
        // given:
        supstr = new SuperStringAtsakymo("line1/nline2/nline3");
        // do and check:
        assertEquals("line1/nline2/nline3", supstr.getText());
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("line3", supstr.getLine(3));
        assertEquals("", supstr.getLine(4));

        // // user input... silly to test
        // // supstr.askUserForText();  // if we could be sure they use "line1/nline2"
        // supstr.setText("line1/nline2");
        // assertEquals("", supstr.getLine(0));
        // assertEquals("line1", supstr.getLine(1));
        // assertEquals("line2", supstr.getLine(2));
        // assertEquals("", supstr.getLine(3));
    } // getLine( )

    /**
     * TODO make a more difficult test
     * [ ] with line breaks (?? can words wrap line: no, /n counts as space. Right??)
     * 
     */
    @Test
    public void getWord()
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("");

        // do:
        String actual = supstr.getWord( -2 );

        // then 
        String expected = "";
        assertEquals(expected, actual);
        // =======

        // do:
        actual = supstr.getWord( 0 );

        // then 
        expected = "";
        assertEquals(expected, actual);
        // =======

        // given:
        supstr = new SuperStringAtsakymo("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");

        // do:
        actual = supstr.getWord( -2 );

        // then 
        expected = "";
        assertEquals(expected, actual);
        // =======

        // do:
        actual = supstr.getWord( 0 );

        // then 
        expected = "";
        assertEquals(expected, actual);
        // =======

        // do:
        actual = supstr.getWord( 2 );

        // then 
        expected = "for";
        assertEquals(expected, actual);

        // =======

        // do:
        actual = supstr.getWord( 6 );

        // then 
        expected = "Pay";
        assertEquals(expected, actual);

        // =======

        // do:
        actual = supstr.getWord( 200 );

        // then 
        expected = "";
        assertEquals(expected, actual);

        // given:
        supstr = new SuperStringAtsakymo("word1 word2  word.3");

        // do:
        actual = supstr.getWord(-1);

        // check: 
        expected = "";
        assertEquals(expected, actual);

        // more tests, compressed, (not spelling out 'actual', 'expected').
        assertEquals("", supstr.getWord(0));
        assertEquals("word1", supstr.getWord(1));
        assertEquals("word2", supstr.getWord(2));
        assertEquals("word.3", supstr.getWord(3));
        assertEquals("", supstr.getWord(10));
    }

    /**
     * TODO make a more difficult test
     * [ ] with line breaks (?? can words wrap line: no, /n counts as a char or NO??)
     */
    @Test
    public void getChar()
    {
        // given:
        SuperStringAtsakymo supstr = new SuperStringAtsakymo("line1");

        // do:
        String actual = supstr.getChar(-1);

        // check: 
        String expected = "";
        assertEquals(expected, actual);

        // more tests, compressed, (not spelling out 'actual', 'expected').
        assertEquals("", supstr.getChar(0));
        assertEquals("l", supstr.getChar(1));
        assertEquals("i", supstr.getChar(2));
        assertEquals("", supstr.getChar(10));
    }
} // class SuperStringAtsakymoTest
