
/**
 * "Boss" contains the main( ) for chordlifter
 *
 * @author Mike Roam
 * @version 2022 May 19
 */
public class Boss
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Boss
     */
    public Boss()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Note: running tests is also a good thing to do instead of running main
     */
    public static void main( String[] args )
    {
        System.out.println("Hello, World!");
        for ( /* every */ String s : /* in */ args){
            System.out.println(s);
        }
    }

    /**
     * Has companion method which uses default " "
     */
    public static String spaces(int howMany, char mySpaceChar)
    {
        String mySpaces = new String();
        // StringBuilder would be better, or StringBuffer if we need thread safety
        for (int i = 0; i < howMany; ++i) {
            mySpaces += mySpaceChar;  
        }
        return mySpaces;
    }
    
    /**
     * Has companion method which is told uses default " "
     */
    public static String spaces(int howMany )
    {
        return spaces(howMany, ' ');
    }

} // class Boss
